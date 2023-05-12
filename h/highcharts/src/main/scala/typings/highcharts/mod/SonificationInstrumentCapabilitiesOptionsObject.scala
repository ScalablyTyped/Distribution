package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Capabilities configuration for a SonificationInstrument.
  */
trait SonificationInstrumentCapabilitiesOptionsObject extends StObject {
  
  /**
    * Whether or not instrument should be able to use filter effects.
    * Defaults to `false`.
    */
  var filters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not instrument should be able to pan. Defaults to `true`.
    */
  var pan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not instrument should be able to use tremolo effects.
    * Defaults to `false`.
    */
  var tremolo: js.UndefOr[Boolean] = js.undefined
}
object SonificationInstrumentCapabilitiesOptionsObject {
  
  inline def apply(): SonificationInstrumentCapabilitiesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationInstrumentCapabilitiesOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationInstrumentCapabilitiesOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: Boolean): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setTremolo(value: Boolean): Self = StObject.set(x, "tremolo", value.asInstanceOf[js.Any])
    
    inline def setTremoloUndefined: Self = StObject.set(x, "tremolo", js.undefined)
  }
}
