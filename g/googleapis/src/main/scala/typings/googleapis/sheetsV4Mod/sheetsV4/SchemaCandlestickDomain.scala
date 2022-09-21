package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCandlestickDomain extends StObject {
  
  /**
    * The data of the CandlestickDomain.
    */
  var data: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCandlestickDomain {
  
  inline def apply(): SchemaCandlestickDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandlestickDomain]
  }
  
  extension [Self <: SchemaCandlestickDomain](x: Self) {
    
    inline def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedNull: Self = StObject.set(x, "reversed", null)
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
