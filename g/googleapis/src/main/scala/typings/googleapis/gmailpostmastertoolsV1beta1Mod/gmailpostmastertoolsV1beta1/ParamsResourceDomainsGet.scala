package typings.googleapis.gmailpostmastertoolsV1beta1Mod.gmailpostmastertoolsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the domain. It should have the form `domains/{domain_name\}`, where domain_name is the fully qualified domain name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainsGet {
  
  inline def apply(): ParamsResourceDomainsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainsGet]
  }
  
  extension [Self <: ParamsResourceDomainsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
