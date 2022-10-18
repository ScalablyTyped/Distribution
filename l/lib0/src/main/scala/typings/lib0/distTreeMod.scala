package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeMod {
  
  @JSImport("lib0/dist/tree", "Tree")
  @js.native
  open class Tree[K, V] () extends StObject {
    
    def _fixDelete(n: Any): Unit = js.native
    
    def _fixInsert(n: Any): Unit = js.native
    
    /**
      * @param {K} id
      */
    def delete(id: K): Unit = js.native
    
    /**
      * @param {K} id
      * @return {V|null}
      */
    def find(id: K): V | Null = js.native
    
    /**
      * @param {K} id
      */
    def findNext(id: K): V = js.native
    
    /**
      * @param {K} id
      * @return {N<V>|null}
      */
    def findNode(id: K): N[V] | Null = js.native
    
    /**
      * @param {K} from
      */
    def findNodeWithLowerBound(from: K): Any = js.native
    
    /**
      * @param {K} to
      */
    def findNodeWithUpperBound(to: K): Any = js.native
    
    /**
      * @param {K} id
      */
    def findPrev(id: K): V = js.native
    
    /**
      * @return {V}
      */
    def findSmallestNode(): V = js.native
    
    /**
      * @param {K} from
      * @return {V}
      */
    def findWithLowerBound(from: K): V = js.native
    
    /**
      * @param {K} to
      * @return {V}
      */
    def findWithUpperBound(to: K): V = js.native
    
    /**
      * @param {K} from
      * @param {V} from
      * @param {function(V):void} f
      */
    def iterate(from: K, to: Any, f: js.Function1[/* arg0 */ V, Unit]): Unit = js.native
    
    var length: Double = js.native
    
    def put(v: Any): Any = js.native
    
    var root: Any = js.native
  }
  
  /**
    * @template V
    */
  @js.native
  trait N[V] extends StObject {
    
    var _left: Any = js.native
    
    var _parent: Any = js.native
    
    var _right: Any = js.native
    
    def blacken(): N[V] = js.native
    
    var color: Boolean = js.native
    
    def getUncle(): Any = js.native
    
    def grandparent: Any = js.native
    
    def isBlack(): Boolean = js.native
    
    def isRed(): Boolean = js.native
    
    def left: Any = js.native
    def left_=(arg: Any): Unit = js.native
    
    def next(): Any = js.native
    
    def parent: Any = js.native
    
    def prev(): Any = js.native
    
    def redden(): N[V] = js.native
    
    def right: Any = js.native
    def right_=(arg: Any): Unit = js.native
    
    def rotateLeft(tree: Any): Unit = js.native
    
    def rotateRight(tree: Any): Unit = js.native
    
    def sibling: Any = js.native
    
    var `val`: V = js.native
  }
}
