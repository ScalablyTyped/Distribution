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

object distEsmContainerHashContainerHashSetMod {
  
  @JSImport("js-sdsl/dist/esm/container/HashContainer/HashSet", JSImport.Default)
  @js.native
  open class default[K] () extends HashSet[K] {
    def this(container: initContainer[K]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/HashContainer/HashSet", "HashSetIterator")
  @js.native
  open class HashSetIterator[K] protected () extends HashContainerIterator[K, Unit] {
    def this(node: HashLinkNode[K, Unit], header: HashLinkNode[K, Unit], container: HashSet[K]) = this()
    def this(
      node: HashLinkNode[K, Unit],
      header: HashLinkNode[K, Unit],
      container: HashSet[K],
      iteratorType: IteratorType
    ) = this()
    
    @JSName("container")
    val container_HashSetIterator: HashSet[K] = js.native
    
    def equals(iter: HashSetIterator[K]): Boolean = js.native
  }
  
  @js.native
  trait HashSet[K] extends HashContainer[K, Unit] {
    
    def find(key: K, isObject: Boolean): HashSetIterator[K] = js.native
    
    /**
      * @description Insert element to set.
      * @param key - The key want to insert.
      * @param isObject - Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                   If a `undefined` value is passed in, the type will be automatically judged.
      * @returns The size of container after inserting.
      */
    def insert(key: K): Double = js.native
    def insert(key: K, isObject: Boolean): Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashSet: js.Function0[Generator[K, Unit, Any]] = js.native
  }
}
