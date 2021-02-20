package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConsistencyTokenResponse extends StObject {
  
  /** The generated consistency token. */
  var consistencyToken: js.UndefOr[String] = js.native
}
object GenerateConsistencyTokenResponse {
  
  @scala.inline
  def apply(): GenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConsistencyTokenResponse]
  }
  
  @scala.inline
  implicit class GenerateConsistencyTokenResponseMutableBuilder[Self <: GenerateConsistencyTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
