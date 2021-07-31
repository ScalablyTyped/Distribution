package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tiers list response.
  */
trait SchemaTiersListResponse extends StObject {
  
  /**
    * List of tiers.
    */
  var items: js.UndefOr[js.Array[SchemaTier]] = js.undefined
  
  /**
    * This is always sql#tiersList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaTiersListResponse {
  
  @scala.inline
  def apply(): SchemaTiersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTiersListResponse]
  }
  
  @scala.inline
  implicit class SchemaTiersListResponseMutableBuilder[Self <: SchemaTiersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaTier]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTier*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
