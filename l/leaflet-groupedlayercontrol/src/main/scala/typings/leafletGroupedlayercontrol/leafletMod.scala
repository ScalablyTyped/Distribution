package typings.leafletGroupedlayercontrol

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.GroupedLayers")
    @js.native
    open class GroupedLayers protected ()
      extends typings.leaflet.mod.Control_ {
      def this(
        baseLayers: StringDictionary[Layer],
        groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[Any]]],
        options: GroupedLayersOptions
      ) = this()
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def groupedLayers(
      baseLayers: StringDictionary[Layer],
      groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[Any]]],
      options: GroupedLayersOptions
    ): Control_ = (^.asInstanceOf[js.Dynamic].applyDynamic("groupedLayers")(baseLayers.asInstanceOf[js.Any], groupedOverlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Control_]
  }
  
  trait GroupedLayersOptions
    extends StObject
       with ControlOptions {
    
    /** Default: true */
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    /** Default: true */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var exclusiveGroups: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Default: false */
    var groupCheckboxes: js.UndefOr[Boolean] = js.undefined
  }
  object GroupedLayersOptions {
    
    inline def apply(): GroupedLayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupedLayersOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupedLayersOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setExclusiveGroups(value: js.Array[String]): Self = StObject.set(x, "exclusiveGroups", value.asInstanceOf[js.Any])
      
      inline def setExclusiveGroupsUndefined: Self = StObject.set(x, "exclusiveGroups", js.undefined)
      
      inline def setExclusiveGroupsVarargs(value: String*): Self = StObject.set(x, "exclusiveGroups", js.Array(value*))
      
      inline def setGroupCheckboxes(value: Boolean): Self = StObject.set(x, "groupCheckboxes", value.asInstanceOf[js.Any])
      
      inline def setGroupCheckboxesUndefined: Self = StObject.set(x, "groupCheckboxes", js.undefined)
    }
  }
}
