package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSuitePrincipal extends StObject {
  
  /** This principal represents all users of the G Suite domain of the customer. */
  var gsuiteDomain: js.UndefOr[Boolean] = js.undefined
  
  /** This principal references a G Suite group account */
  var gsuiteGroupEmail: js.UndefOr[String] = js.undefined
  
  /** This principal references a G Suite user account */
  var gsuiteUserEmail: js.UndefOr[String] = js.undefined
}
object GSuitePrincipal {
  
  inline def apply(): GSuitePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GSuitePrincipal]
  }
  
  extension [Self <: GSuitePrincipal](x: Self) {
    
    inline def setGsuiteDomain(value: Boolean): Self = StObject.set(x, "gsuiteDomain", value.asInstanceOf[js.Any])
    
    inline def setGsuiteDomainUndefined: Self = StObject.set(x, "gsuiteDomain", js.undefined)
    
    inline def setGsuiteGroupEmail(value: String): Self = StObject.set(x, "gsuiteGroupEmail", value.asInstanceOf[js.Any])
    
    inline def setGsuiteGroupEmailUndefined: Self = StObject.set(x, "gsuiteGroupEmail", js.undefined)
    
    inline def setGsuiteUserEmail(value: String): Self = StObject.set(x, "gsuiteUserEmail", value.asInstanceOf[js.Any])
    
    inline def setGsuiteUserEmailUndefined: Self = StObject.set(x, "gsuiteUserEmail", js.undefined)
  }
}
