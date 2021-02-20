package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexItemOptions extends StObject {
  
  /** Specifies if the index request should allow gsuite principals that do not exist or are deleted in the index request. */
  var allowUnknownGsuitePrincipals: js.UndefOr[Boolean] = js.native
}
object IndexItemOptions {
  
  @scala.inline
  def apply(): IndexItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexItemOptions]
  }
  
  @scala.inline
  implicit class IndexItemOptionsMutableBuilder[Self <: IndexItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknownGsuitePrincipals(value: Boolean): Self = StObject.set(x, "allowUnknownGsuitePrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnknownGsuitePrincipalsUndefined: Self = StObject.set(x, "allowUnknownGsuitePrincipals", js.undefined)
  }
}
