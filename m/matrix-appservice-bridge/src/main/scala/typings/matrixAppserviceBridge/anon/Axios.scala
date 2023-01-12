package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libUtilsMatrixHostResolverMod.DnsInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axios extends StObject {
  
  var axios: js.UndefOr[typings.axios.mod.Axios] = js.undefined
  
  var currentTimeMs: js.UndefOr[Double] = js.undefined
  
  var dns: js.UndefOr[DnsInterface] = js.undefined
}
object Axios {
  
  inline def apply(): Axios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axios]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Axios] (val x: Self) extends AnyVal {
    
    inline def setAxios(value: typings.axios.mod.Axios): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
    
    inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
    
    inline def setCurrentTimeMs(value: Double): Self = StObject.set(x, "currentTimeMs", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeMsUndefined: Self = StObject.set(x, "currentTimeMs", js.undefined)
    
    inline def setDns(value: DnsInterface): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
  }
}
