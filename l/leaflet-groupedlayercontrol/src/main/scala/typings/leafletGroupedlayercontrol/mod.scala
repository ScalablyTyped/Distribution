package typings.leafletGroupedlayercontrol

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.GroupedLayers")
    @js.native
    class GroupedLayers protected ()
      extends typings.leaflet.mod.Control_ {
      def this(
        baseLayers: StringDictionary[Layer],
        groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
        options: GroupedLayersOptions
      ) = this()
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control.groupedLayers")
    @js.native
    def groupedLayers(
      baseLayers: StringDictionary[Layer],
      groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
      options: GroupedLayersOptions
    ): Control_ = js.native
  }
  
  @js.native
  trait GroupedLayersOptions extends ControlOptions {
    
    /** Default: true */
    var autoZIndex: js.UndefOr[Boolean] = js.native
    
    /** Default: true */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var exclusiveGroups: js.UndefOr[js.Array[String]] = js.native
    
    /** Default: false */
    var groupCheckboxes: js.UndefOr[Boolean] = js.native
  }
  object GroupedLayersOptions {
    
    @scala.inline
    def apply(): GroupedLayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupedLayersOptions]
    }
    
    @scala.inline
    implicit class GroupedLayersOptionsMutableBuilder[Self <: GroupedLayersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setExclusiveGroups(value: js.Array[String]): Self = StObject.set(x, "exclusiveGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveGroupsUndefined: Self = StObject.set(x, "exclusiveGroups", js.undefined)
      
      @scala.inline
      def setExclusiveGroupsVarargs(value: String*): Self = StObject.set(x, "exclusiveGroups", js.Array(value :_*))
      
      @scala.inline
      def setGroupCheckboxes(value: Boolean): Self = StObject.set(x, "groupCheckboxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupCheckboxesUndefined: Self = StObject.set(x, "groupCheckboxes", js.undefined)
    }
  }
}
