package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemApksListResponse extends StObject {
  
  /** All system APK variants created. */
  var variants: js.UndefOr[js.Array[Variant]] = js.native
}
object SystemApksListResponse {
  
  @scala.inline
  def apply(): SystemApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemApksListResponse]
  }
  
  @scala.inline
  implicit class SystemApksListResponseMutableBuilder[Self <: SystemApksListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
