package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the partner to fetch.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersGet {
  
  inline def apply(): ParamsResourcePartnersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersGet]
  }
  
  extension [Self <: ParamsResourcePartnersGet](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
