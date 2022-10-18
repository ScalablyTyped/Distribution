package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("lib0/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/list", "List")
  @js.native
  open class List[N /* <: ListNode */] () extends StObject {
    
    /**
      * @type {N | null}
      */
    var end: N | Null = js.native
    
    var len: Double = js.native
    
    /**
      * @type {N | null}
      */
    var start: N | Null = js.native
  }
  
  @JSImport("lib0/list", "ListNode")
  @js.native
  open class ListNode () extends StObject {
    
    /**
      * @type {this|null}
      */
    var next: ListNode | Null = js.native
    
    /**
      * @type {this|null}
      */
    var prev: ListNode | Null = js.native
  }
  
  inline def create[N /* <: ListNode */](): typings.lib0.listMod.List[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.lib0.listMod.List[N]]
  
  inline def forEach[N /* <: ListNode */, M](list: typings.lib0.listMod.List[N], f: js.Function1[/* arg0 */ N, M]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(list.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertBetween[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], left: N, right: N, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBetween")(queue.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBetween[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], left: N, right: Null, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBetween")(queue.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBetween[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], left: Null, right: N, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBetween")(queue.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertBetween[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], left: Null, right: Null, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBetween")(queue.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEmpty[N /* <: ListNode */](queue: typings.lib0.listMod.List[N]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(queue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def map[N /* <: ListNode */, M](list: typings.lib0.listMod.List[N], f: js.Function1[/* arg0 */ N, M]): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  inline def popEnd[N /* <: ListNode */](list: typings.lib0.listMod.List[N]): N | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("popEnd")(list.asInstanceOf[js.Any]).asInstanceOf[N | Null]
  
  inline def popFront[N /* <: ListNode */](list: typings.lib0.listMod.List[N]): N | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("popFront")(list.asInstanceOf[js.Any]).asInstanceOf[N | Null]
  
  inline def pushEnd[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], n: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushEnd")(queue.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pushFront[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], n: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFront")(queue.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], node: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(queue.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[N]
  
  inline def removeNode[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], node: N): N = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(queue.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[N]
  
  inline def replace[N /* <: ListNode */](queue: typings.lib0.listMod.List[N], node: N, newNode: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(queue.asInstanceOf[js.Any], node.asInstanceOf[js.Any], newNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toArray[N /* <: ListNode */](list: typings.lib0.listMod.List[N]): js.Array[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[N]]
}
