package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection for items that share a common key.
  */
trait ICollection[K, T] extends StObject {
  
  var items: js.Array[T]
  
  var key: K
}
object ICollection {
  
  inline def apply[K, T](items: js.Array[T], key: K): ICollection[K, T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollection[K, T]]
  }
  
  extension [Self <: ICollection[?, ?], K, T](x: Self & (ICollection[K, T])) {
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
