package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Contact List Response
  */
@js.native
trait SchemaDirectorySiteContactsListResponse extends StObject {
  
  /**
    * Directory site contact collection
    */
  var directorySiteContacts: js.UndefOr[js.Array[SchemaDirectorySiteContact]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContactsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDirectorySiteContactsListResponse {
  
  @scala.inline
  def apply(): SchemaDirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContactsListResponse]
  }
  
  @scala.inline
  implicit class SchemaDirectorySiteContactsListResponseMutableBuilder[Self <: SchemaDirectorySiteContactsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectorySiteContacts(value: js.Array[SchemaDirectorySiteContact]): Self = StObject.set(x, "directorySiteContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySiteContactsUndefined: Self = StObject.set(x, "directorySiteContacts", js.undefined)
    
    @scala.inline
    def setDirectorySiteContactsVarargs(value: SchemaDirectorySiteContact*): Self = StObject.set(x, "directorySiteContacts", js.Array(value :_*))
    
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
