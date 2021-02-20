package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flags list response.
  */
@js.native
trait SchemaFlagsListResponse extends StObject {
  
  /**
    * List of flags.
    */
  var items: js.UndefOr[js.Array[SchemaFlag]] = js.native
  
  /**
    * This is always sql#flagsList.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaFlagsListResponse {
  
  @scala.inline
  def apply(): SchemaFlagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlagsListResponse]
  }
  
  @scala.inline
  implicit class SchemaFlagsListResponseMutableBuilder[Self <: SchemaFlagsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaFlag]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaFlag*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
