package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesDeleteAllResponse extends StObject {
  
  /** The deleted images. */
  var deleted: js.UndefOr[js.Array[Image]] = js.native
}
object ImagesDeleteAllResponse {
  
  @scala.inline
  def apply(): ImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesDeleteAllResponse]
  }
  
  @scala.inline
  implicit class ImagesDeleteAllResponseMutableBuilder[Self <: ImagesDeleteAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: js.Array[Image]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDeletedVarargs(value: Image*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
