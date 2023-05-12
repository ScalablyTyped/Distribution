package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Container
import typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerHashContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/HashContainer/Base", "HashContainer")
  @js.native
  open class HashContainer[K, V] ()
    extends Container[K | (js.Tuple2[K, V])] {
    
    /**
      * @description Unique symbol used to tag object.
      */
    val HASH_TAG: js.Symbol = js.native
    
    def eraseElementByIterator(iter: HashContainerIterator[K, V]): HashContainerIterator[K, V] = js.native
    
    /**
      * @description Remove the element of the specified key.
      * @param key - The key you want to remove.
      * @param isObject - Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                   If a `undefined` value is passed in, the type will be automatically judged.
      * @returns Whether erase successfully.
      */
    def eraseElementByKey(key: K): Boolean = js.native
    def eraseElementByKey(key: K, isObject: Boolean): Boolean = js.native
  }
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/HashContainer/Base", "HashContainerIterator")
  @js.native
  open class HashContainerIterator[K, V] ()
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    @JSName("container")
    val container_HashContainerIterator: HashContainer[K, V] = js.native
  }
  
  trait HashLinkNode[K, V] extends StObject {
    
    var _key: K
    
    var _next: HashLinkNode[K, V]
    
    var _pre: HashLinkNode[K, V]
    
    var _value: V
  }
  object HashLinkNode {
    
    inline def apply[K, V](_key: K, _next: HashLinkNode[K, V], _pre: HashLinkNode[K, V], _value: V): HashLinkNode[K, V] = {
      val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any], _next = _next.asInstanceOf[js.Any], _pre = _pre.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashLinkNode[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashLinkNode[?, ?], K, V] (val x: Self & (HashLinkNode[K, V])) extends AnyVal {
      
      inline def set_key(value: K): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
      
      inline def set_next(value: HashLinkNode[K, V]): Self = StObject.set(x, "_next", value.asInstanceOf[js.Any])
      
      inline def set_pre(value: HashLinkNode[K, V]): Self = StObject.set(x, "_pre", value.asInstanceOf[js.Any])
      
      inline def set_value(value: V): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
