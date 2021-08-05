package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseAymf extends StObject {
  
  var items: js.Array[NewsRepositoryInboxResponseItemsItem]
  
  var more_available: Boolean
}
object NewsRepositoryInboxResponseAymf {
  
  inline def apply(items: js.Array[NewsRepositoryInboxResponseItemsItem], more_available: Boolean): NewsRepositoryInboxResponseAymf = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAymf]
  }
  
  extension [Self <: NewsRepositoryInboxResponseAymf](x: Self) {
    
    inline def setItems(value: js.Array[NewsRepositoryInboxResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: NewsRepositoryInboxResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
  }
}
