package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainaliasesList
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parent domain for which domain aliases are to be fetched.
    */
  var parentDomainName: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainaliasesList {
  
  inline def apply(): ParamsResourceDomainaliasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainaliasesList]
  }
  
  extension [Self <: ParamsResourceDomainaliasesList](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setParentDomainName(value: String): Self = StObject.set(x, "parentDomainName", value.asInstanceOf[js.Any])
    
    inline def setParentDomainNameUndefined: Self = StObject.set(x, "parentDomainName", js.undefined)
  }
}
