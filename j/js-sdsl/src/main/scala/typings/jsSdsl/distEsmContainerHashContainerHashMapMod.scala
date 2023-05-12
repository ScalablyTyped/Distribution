package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerHashContainerBaseMod.HashContainer
import typings.jsSdsl.distEsmContainerHashContainerBaseMod.HashContainerIterator
import typings.jsSdsl.distEsmContainerHashContainerBaseMod.HashLinkNode
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerHashContainerHashMapMod {
  
  @JSImport("js-sdsl/dist/esm/container/HashContainer/HashMap", JSImport.Default)
  @js.native
  open class default[K, V] () extends HashMap[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/HashContainer/HashMap", "HashMapIterator")
  @js.native
  open class HashMapIterator[K, V] protected () extends HashContainerIterator[K, V] {
    def this(node: HashLinkNode[K, V], header: HashLinkNode[K, V], container: HashMap[K, V]) = this()
    def this(
      node: HashLinkNode[K, V],
      header: HashLinkNode[K, V],
      container: HashMap[K, V],
      iteratorType: IteratorType
    ) = this()
    
    @JSName("container")
    val container_HashMapIterator: HashMap[K, V] = js.native
    
    def equals(iter: HashMapIterator[K, V]): Boolean = js.native
  }
  
  @js.native
  trait HashMap[K, V] extends HashContainer[K, V] {
    
    def find(key: K, isObject: Boolean): HashMapIterator[K, V] = js.native
    
    /**
      * @description Get the value of the element of the specified key.
      * @param key - The key want to search.
      * @param isObject - Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                   If a `undefined` value is passed in, the type will be automatically judged.
      * @example
      * const val = container.getElementByKey(1);
      */
    def getElementByKey(key: K): js.UndefOr[V] = js.native
    def getElementByKey(key: K, isObject: Boolean): js.UndefOr[V] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashMap: js.Function0[Generator[js.Tuple2[K, V], Unit, Any]] = js.native
    
    /**
      * @description Insert a key-value pair or set value by the given key.
      * @param key - The key want to insert.
      * @param value - The value want to set.
      * @param isObject - Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                   If a `undefined` value is passed in, the type will be automatically judged.
      * @returns The size of container after setting.
      */
    def setElement(key: K, value: V): Double = js.native
    def setElement(key: K, value: V, isObject: Boolean): Double = js.native
  }
}
