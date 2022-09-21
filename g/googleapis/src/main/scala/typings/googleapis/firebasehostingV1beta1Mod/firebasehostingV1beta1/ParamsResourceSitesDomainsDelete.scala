package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesDomainsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the domain association to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesDomainsDelete {
  
  inline def apply(): ParamsResourceSitesDomainsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesDomainsDelete]
  }
  
  extension [Self <: ParamsResourceSitesDomainsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
