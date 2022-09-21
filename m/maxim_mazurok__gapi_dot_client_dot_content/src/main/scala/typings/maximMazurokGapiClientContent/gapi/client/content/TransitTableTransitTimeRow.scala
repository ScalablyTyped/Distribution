package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitTableTransitTimeRow extends StObject {
  
  var values: js.UndefOr[js.Array[TransitTableTransitTimeRowTransitTimeValue]] = js.undefined
}
object TransitTableTransitTimeRow {
  
  inline def apply(): TransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTableTransitTimeRow]
  }
  
  extension [Self <: TransitTableTransitTimeRow](x: Self) {
    
    inline def setValues(value: js.Array[TransitTableTransitTimeRowTransitTimeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: TransitTableTransitTimeRowTransitTimeValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
