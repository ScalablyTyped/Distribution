package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainaliasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Name of domain alias to be retrieved.
    */
  var domainAliasName: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainaliasesGet {
  
  inline def apply(): ParamsResourceDomainaliasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainaliasesGet]
  }
  
  extension [Self <: ParamsResourceDomainaliasesGet](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDomainAliasName(value: String): Self = StObject.set(x, "domainAliasName", value.asInstanceOf[js.Any])
    
    inline def setDomainAliasNameUndefined: Self = StObject.set(x, "domainAliasName", js.undefined)
  }
}
