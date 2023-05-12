package typings.heremaps.H.ui

import typings.heremaps.H.map.layer.Layer
import typings.heremaps.H.service.MapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a menu control allowing to control which map type the map shows, etc.
  */
@js.native
trait MapSettingsControl
  extends StObject
     with Control {
  
  /**
    * Sets the traffic incidents layer to be shown when activating the respective button on the map settings control.
    * @param incidentsLayer {H.map.layer.Layer} - the incidents layer
    */
  def setIncidentsLayer(incidentsLayer: Layer): Unit = js.native
}
object MapSettingsControl {
  
  /**
    * The map type entry is an object containing a display name and a map type object to which it refers.
    * name {string} - label which describes the map type
    * mapType {H.service.MapType} - reference to map type
    */
  trait Entry extends StObject {
    
    var mapType: MapType
    
    var name: String
  }
  object Entry {
    
    inline def apply(mapType: MapType, name: String): Entry = {
      val __obj = js.Dynamic.literal(mapType = mapType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://developer.here.com/documentation/maps/api_reference/H.ui.MapSettingsControl.html#.Options}
    * alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
    * entries {Array<H.ui.MapSettingsControl.MapTypeEntry>=} - the map type entries to be shown in this map settings control
    * incidents {H.map.layer.Layer} - the traffic incidents layer to be activated by the map settings control
    */
  trait Options extends StObject {
    
    var alignment: js.UndefOr[LayoutAlignment] = js.undefined
    
    var baseLayers: js.UndefOr[js.Array[Entry]] = js.undefined
    
    var layers: js.UndefOr[js.Array[Entry]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBaseLayers(value: js.Array[Entry]): Self = StObject.set(x, "baseLayers", value.asInstanceOf[js.Any])
      
      inline def setBaseLayersUndefined: Self = StObject.set(x, "baseLayers", js.undefined)
      
      inline def setBaseLayersVarargs(value: Entry*): Self = StObject.set(x, "baseLayers", js.Array(value*))
      
      inline def setLayers(value: js.Array[Entry]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Entry*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
}
