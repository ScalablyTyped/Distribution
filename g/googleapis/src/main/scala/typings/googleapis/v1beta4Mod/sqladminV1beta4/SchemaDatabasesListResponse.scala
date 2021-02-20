package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database list response.
  */
@js.native
trait SchemaDatabasesListResponse extends StObject {
  
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  
  /**
    * This is always sql#databasesList.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaDatabasesListResponse {
  
  @scala.inline
  def apply(): SchemaDatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabasesListResponse]
  }
  
  @scala.inline
  implicit class SchemaDatabasesListResponseMutableBuilder[Self <: SchemaDatabasesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaDatabase]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaDatabase*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
