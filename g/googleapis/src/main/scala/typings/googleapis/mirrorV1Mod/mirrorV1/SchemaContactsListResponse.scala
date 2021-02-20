package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Contacts representing contacts. This is the response from the
  * server to GET requests on the contacts collection.
  */
@js.native
trait SchemaContactsListResponse extends StObject {
  
  /**
    * Contact list.
    */
  var items: js.UndefOr[js.Array[SchemaContact]] = js.native
  
  /**
    * The type of resource. This is always mirror#contacts.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaContactsListResponse {
  
  @scala.inline
  def apply(): SchemaContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactsListResponse]
  }
  
  @scala.inline
  implicit class SchemaContactsListResponseMutableBuilder[Self <: SchemaContactsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaContact]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaContact*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
