package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaOrder extends StObject {
  
  /** Order of the differencing part. */
  var d: js.UndefOr[String] = js.undefined
  
  /** Order of the autoregressive part. */
  var p: js.UndefOr[String] = js.undefined
  
  /** Order of the moving-average part. */
  var q: js.UndefOr[String] = js.undefined
}
object ArimaOrder {
  
  inline def apply(): ArimaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaOrder]
  }
  
  extension [Self <: ArimaOrder](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
