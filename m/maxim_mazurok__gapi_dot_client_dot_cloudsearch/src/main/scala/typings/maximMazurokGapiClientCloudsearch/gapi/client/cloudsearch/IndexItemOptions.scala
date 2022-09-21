package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexItemOptions extends StObject {
  
  /** Specifies if the index request should allow Google Workspace principals that do not exist or are deleted. */
  var allowUnknownGsuitePrincipals: js.UndefOr[Boolean] = js.undefined
}
object IndexItemOptions {
  
  inline def apply(): IndexItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexItemOptions]
  }
  
  extension [Self <: IndexItemOptions](x: Self) {
    
    inline def setAllowUnknownGsuitePrincipals(value: Boolean): Self = StObject.set(x, "allowUnknownGsuitePrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowUnknownGsuitePrincipalsUndefined: Self = StObject.set(x, "allowUnknownGsuitePrincipals", js.undefined)
  }
}
