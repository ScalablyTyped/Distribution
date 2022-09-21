package typings.googleapis.gmailpostmastertoolsV1beta1Mod.gmailpostmastertoolsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainsTrafficstatsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the traffic statistics to get. E.g., domains/mymail.mydomain.com/trafficStats/20160807.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainsTrafficstatsGet {
  
  inline def apply(): ParamsResourceDomainsTrafficstatsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainsTrafficstatsGet]
  }
  
  extension [Self <: ParamsResourceDomainsTrafficstatsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
