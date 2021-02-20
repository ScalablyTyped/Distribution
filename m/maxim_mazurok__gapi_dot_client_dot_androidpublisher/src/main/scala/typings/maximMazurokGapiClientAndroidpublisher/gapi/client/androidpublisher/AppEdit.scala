package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEdit extends StObject {
  
  /** Output only. The time (as seconds since Epoch) at which the edit will expire and will be no longer valid for use. */
  var expiryTimeSeconds: js.UndefOr[String] = js.native
  
  /** Output only. Identifier of the edit. Can be used in subsequent API calls. */
  var id: js.UndefOr[String] = js.native
}
object AppEdit {
  
  @scala.inline
  def apply(): AppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEdit]
  }
  
  @scala.inline
  implicit class AppEditMutableBuilder[Self <: AppEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiryTimeSeconds(value: String): Self = StObject.set(x, "expiryTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeSecondsUndefined: Self = StObject.set(x, "expiryTimeSeconds", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
