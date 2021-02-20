package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckAccessResponse extends StObject {
  
  /** Returns true if principal has access. Returns false otherwise. */
  var hasAccess: js.UndefOr[Boolean] = js.native
}
object CheckAccessResponse {
  
  @scala.inline
  def apply(): CheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckAccessResponse]
  }
  
  @scala.inline
  implicit class CheckAccessResponseMutableBuilder[Self <: CheckAccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasAccess(value: Boolean): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
  }
}
