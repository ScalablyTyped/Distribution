package typings.leafletDraw.leafletMod

import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.Handler
import typings.leaflet.mod.PathOptions
import typings.leafletDraw.anon.FeatureGroup
import typings.leafletDraw.leafletMod.Control.DrawConstructorOptions
import typings.leafletDraw.leafletMod.Draw.Feature
import typings.leafletDraw.leafletMod.EditOptions.EditPolyVerticesEditOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "EditToolbar")
@js.native
open class EditToolbar () extends Toolbar {
  def this(options: ToolbarOptions) = this()
  
  def getActions(handler: Feature): js.Array[ToolbarAction] = js.native
  
  def getModeHandlers(map: DrawMap): js.Array[ToolbarModeHandler] = js.native
  
  def setOptions(options: DrawConstructorOptions): Unit = js.native
}
object EditToolbar {
  
  @JSImport("leaflet", "EditToolbar.Delete")
  @js.native
  open class Delete protected () extends Handler {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: FeatureGroup) = this()
    
    def removeAllLayers(): Unit = js.native
    
    def revertLayers(): Unit = js.native
    
    def save(): Unit = js.native
  }
  
  @JSImport("leaflet", "EditToolbar.Edit")
  @js.native
  open class Edit protected () extends Handler {
    def this(map: DrawMap) = this()
    def this(map: DrawMap, options: EditHandlerOptions) = this()
    
    def revertLayers(): Unit = js.native
    
    def save(): Unit = js.native
  }
  
  trait EditHandlerOptions extends StObject {
    
    /**
      * This is the FeatureGroup that stores all editable shapes.
      * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
      *
      * @default null
      */
    var featureGroup: FeatureGroup_[Any]
    
    /**
      * The options for the polygon layer in editing mode
      *
      * @default null
      */
    var poly: js.UndefOr[EditPolyOptions] = js.undefined
    
    /**
      * The path options for how the layers will look while in edit mode.
      * If this is set to null the editable path options will not be set.
      *
      * @default { dashArray: '10, 10', fill: true, fillColor: '#fe57a1', fillOpacity: 0.1, maintainColor: false }
      */
    var selectedPathOptions: js.UndefOr[PathOptions] = js.undefined
  }
  object EditHandlerOptions {
    
    inline def apply(featureGroup: FeatureGroup_[Any]): EditHandlerOptions = {
      val __obj = js.Dynamic.literal(featureGroup = featureGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setFeatureGroup(value: FeatureGroup_[Any]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: EditPolyOptions): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      inline def setPolyUndefined: Self = StObject.set(x, "poly", js.undefined)
      
      inline def setSelectedPathOptions(value: PathOptions): Self = StObject.set(x, "selectedPathOptions", value.asInstanceOf[js.Any])
      
      inline def setSelectedPathOptionsUndefined: Self = StObject.set(x, "selectedPathOptions", js.undefined)
    }
  }
  
  trait EditPolyOptions
    extends StObject
       with EditPolyVerticesEditOptions {
    
    /**
      * Determines if line segments can cross
      *
      * @default true
      */
    var allowIntersection: js.UndefOr[Boolean] = js.undefined
  }
  object EditPolyOptions {
    
    inline def apply(): EditPolyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditPolyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditPolyOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowIntersection(value: Boolean): Self = StObject.set(x, "allowIntersection", value.asInstanceOf[js.Any])
      
      inline def setAllowIntersectionUndefined: Self = StObject.set(x, "allowIntersection", js.undefined)
    }
  }
}
