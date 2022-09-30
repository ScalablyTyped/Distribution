package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: js.UndefOr[String] = js.undefined
  
  var notfound: js.UndefOr[String] = js.undefined
  
  var resultlist: js.UndefOr[String] = js.undefined
}
object Item {
  
  inline def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
    
    inline def setNotfoundUndefined: Self = StObject.set(x, "notfound", js.undefined)
    
    inline def setResultlist(value: String): Self = StObject.set(x, "resultlist", value.asInstanceOf[js.Any])
    
    inline def setResultlistUndefined: Self = StObject.set(x, "resultlist", js.undefined)
  }
}
