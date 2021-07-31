package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to delete multiple Photos.
  */
trait SchemaBatchDeletePhotosRequest extends StObject {
  
  /**
    * Required. IDs of the Photos. HTTP GET requests require the following
    * syntax for the URL query parameter:
    * `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBatchDeletePhotosRequest {
  
  @scala.inline
  def apply(): SchemaBatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchDeletePhotosRequestMutableBuilder[Self <: SchemaBatchDeletePhotosRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhotoIds(value: js.Array[String]): Self = StObject.set(x, "photoIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoIdsUndefined: Self = StObject.set(x, "photoIds", js.undefined)
    
    @scala.inline
    def setPhotoIdsVarargs(value: String*): Self = StObject.set(x, "photoIds", js.Array(value :_*))
  }
}
