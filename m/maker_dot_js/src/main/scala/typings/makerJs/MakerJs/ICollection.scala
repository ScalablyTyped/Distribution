package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection for items that share a common key.
  */
@js.native
trait ICollection[K, T] extends StObject {
  
  var items: js.Array[T] = js.native
  
  var key: K = js.native
}
object ICollection {
  
  @scala.inline
  def apply[K, T](items: js.Array[T], key: K): ICollection[K, T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollection[K, T]]
  }
  
  @scala.inline
  implicit class ICollectionMutableBuilder[Self <: ICollection[_, _], K, T] (val x: Self with (ICollection[K, T])) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
