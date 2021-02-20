package typings.heremaps.H.ui

import typings.heremaps.H.map.layer.Layer
import typings.heremaps.H.service.MapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a menu control allowing to control which map type the map shows, etc.
  */
@js.native
trait MapSettingsControl extends Control {
  
  /**
    * Sets the traffic incidents layer to be shown when activating the respective button on the map settings control.
    * @param incidentsLayer {H.map.layer.Layer} - the incidents layer
    */
  def setIncidentsLayer(incidentsLayer: Layer): Unit = js.native
}
object MapSettingsControl {
  
  /**
    * The map type entry is an object containing a display name and a map type object to which it refers.
    * @property name {string} - label which describes the map type
    * @property mapType {H.service.MapType} - reference to map type
    */
  @js.native
  trait Entry extends StObject {
    
    var mapType: MapType = js.native
    
    var name: String = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(mapType: MapType, name: String): Entry = {
      val __obj = js.Dynamic.literal(mapType = mapType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.ui.MapSettingsControl.html#.Options}
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
    * @property entries {Array<H.ui.MapSettingsControl.MapTypeEntry>=} - the map type entries to be shown in this map settings control
    * @property incidents {H.map.layer.Layer} - the traffic incidents layer to be activated by the map settings control
    */
  @js.native
  trait Options extends StObject {
    
    var alignment: js.UndefOr[LayoutAlignment] = js.native
    
    var baseLayers: js.UndefOr[js.Array[Entry]] = js.native
    
    var layers: js.UndefOr[js.Array[Entry]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBaseLayers(value: js.Array[Entry]): Self = StObject.set(x, "baseLayers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseLayersUndefined: Self = StObject.set(x, "baseLayers", js.undefined)
      
      @scala.inline
      def setBaseLayersVarargs(value: Entry*): Self = StObject.set(x, "baseLayers", js.Array(value :_*))
      
      @scala.inline
      def setLayers(value: js.Array[Entry]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Entry*): Self = StObject.set(x, "layers", js.Array(value :_*))
    }
  }
}
