package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rewrite response.
  */
trait SchemaRewriteResponse extends StObject {
  
  /**
    * true if the copy is finished; otherwise, false if the copy is in
    * progress. This property is always present in the response.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The total size of the object being copied in bytes. This property is
    * always present in the response.
    */
  var objectSize: js.UndefOr[String] = js.undefined
  
  /**
    * A resource containing the metadata for the copied-to object. This
    * property is present in the response only when copying completes.
    */
  var resource: js.UndefOr[SchemaObject] = js.undefined
  
  /**
    * A token to use in subsequent requests to continue copying data. This
    * token is present in the response only when there is more data to copy.
    */
  var rewriteToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total bytes written so far, which can be used to provide a waiting
    * user with a progress indicator. This property is always present in the
    * response.
    */
  var totalBytesRewritten: js.UndefOr[String] = js.undefined
}
object SchemaRewriteResponse {
  
  @scala.inline
  def apply(): SchemaRewriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRewriteResponse]
  }
  
  @scala.inline
  implicit class SchemaRewriteResponseMutableBuilder[Self <: SchemaRewriteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setObjectSize(value: String): Self = StObject.set(x, "objectSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSizeUndefined: Self = StObject.set(x, "objectSize", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaObject): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setRewriteToken(value: String): Self = StObject.set(x, "rewriteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteTokenUndefined: Self = StObject.set(x, "rewriteToken", js.undefined)
    
    @scala.inline
    def setTotalBytesRewritten(value: String): Self = StObject.set(x, "totalBytesRewritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesRewrittenUndefined: Self = StObject.set(x, "totalBytesRewritten", js.undefined)
  }
}
