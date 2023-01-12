package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreLayoutPagesListResponse extends StObject {
  
  /** A store page of an enterprise. */
  var page: js.UndefOr[js.Array[StorePage]] = js.undefined
}
object StoreLayoutPagesListResponse {
  
  inline def apply(): StoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayoutPagesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    
    inline def setPage(value: js.Array[StorePage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: StorePage*): Self = StObject.set(x, "page", js.Array(value*))
  }
}
