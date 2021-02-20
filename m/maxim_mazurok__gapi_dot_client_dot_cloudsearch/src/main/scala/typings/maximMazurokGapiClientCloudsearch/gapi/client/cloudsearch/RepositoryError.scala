package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryError extends StObject {
  
  /** Message that describes the error. The maximum allowable length of the message is 8192 characters. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** Error codes. Matches the definition of HTTP status codes. */
  var httpStatusCode: js.UndefOr[Double] = js.native
  
  /** Type of error. */
  var `type`: js.UndefOr[String] = js.native
}
object RepositoryError {
  
  @scala.inline
  def apply(): RepositoryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryError]
  }
  
  @scala.inline
  implicit class RepositoryErrorMutableBuilder[Self <: RepositoryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
