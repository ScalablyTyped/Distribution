package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangesListResponse extends StObject {
  
  var changes: js.UndefOr[js.Array[SchemaChange]] = js.undefined
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaChangesListResponse {
  
  @scala.inline
  def apply(): SchemaChangesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangesListResponse]
  }
  
  @scala.inline
  implicit class SchemaChangesListResponseMutableBuilder[Self <: SchemaChangesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[SchemaChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: SchemaChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
