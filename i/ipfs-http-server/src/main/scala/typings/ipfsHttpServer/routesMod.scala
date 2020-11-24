package typings.ipfsHttpServer

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ipfsHttpServer.anon.CopyWithin
import typings.ipfsHttpServer.anon.MethodPath
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-http-server/dist/src/api/routes", JSImport.Namespace)
@js.native
object routesMod extends TopLevel[/* n */ NumberDictionary[MethodPath]] {
  
  def concat(items: (js.Array[MethodPath] | MethodPath)*): js.Array[MethodPath] = js.native
  
  def copyWithin(target: Double, start: Double): js.Array[MethodPath] = js.native
  def copyWithin(target: Double, start: Double, end: Double): js.Array[MethodPath] = js.native
  
  def entries(): IterableIterator[js.Tuple2[Double, MethodPath]] = js.native
  
  def every(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _]
  ): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _],
    thisArg: js.Any
  ): Boolean = js.native
  @JSName("every")
  def every_S_MethodPath[S /* <: MethodPath */](
    predicate: js.Function3[
      /* value */ MethodPath, 
      /* index */ Double, 
      /* array */ js.Array[MethodPath], 
      /* is S */ Boolean
    ]
  ): /* is std.Array<S> */ Boolean = js.native
  @JSName("every")
  def every_S_MethodPath[S /* <: MethodPath */](
    predicate: js.Function3[
      /* value */ MethodPath, 
      /* index */ Double, 
      /* array */ js.Array[MethodPath], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): /* is std.Array<S> */ Boolean = js.native
  
  def fill(value: MethodPath): js.Array[MethodPath] = js.native
  def fill(value: MethodPath, start: js.UndefOr[scala.Nothing], end: Double): js.Array[MethodPath] = js.native
  def fill(value: MethodPath, start: Double): js.Array[MethodPath] = js.native
  def fill(value: MethodPath, start: Double, end: Double): js.Array[MethodPath] = js.native
  
  def filter(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _]
  ): js.Array[MethodPath] = js.native
  def filter(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _],
    thisArg: js.Any
  ): js.Array[MethodPath] = js.native
  @JSName("filter")
  def filter_S_1_MethodPath[S_1 /* <: MethodPath */](
    predicate: js.Function3[
      /* value */ MethodPath, 
      /* index */ Double, 
      /* array */ js.Array[MethodPath], 
      /* is S_1 */ Boolean
    ]
  ): js.Array[S_1] = js.native
  @JSName("filter")
  def filter_S_1_MethodPath[S_1 /* <: MethodPath */](
    predicate: js.Function3[
      /* value */ MethodPath, 
      /* index */ Double, 
      /* array */ js.Array[MethodPath], 
      /* is S_1 */ Boolean
    ],
    thisArg: js.Any
  ): js.Array[S_1] = js.native
  
  def find(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* obj */ js.Array[MethodPath], _]
  ): js.UndefOr[MethodPath] = js.native
  def find(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* obj */ js.Array[MethodPath], _],
    thisArg: js.Any
  ): js.UndefOr[MethodPath] = js.native
  def find[S_2 /* <: MethodPath */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ MethodPath, 
      /* index */ Double, 
      /* obj */ js.Array[MethodPath], 
      /* is S_2 */ Boolean
    ]
  ): js.UndefOr[S_2] = js.native
  def find[S_2 /* <: MethodPath */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ MethodPath, 
      /* index */ Double, 
      /* obj */ js.Array[MethodPath], 
      /* is S_2 */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S_2] = js.native
  
  def findIndex(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* obj */ js.Array[MethodPath], _]
  ): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* obj */ js.Array[MethodPath], _],
    thisArg: js.Any
  ): Double = js.native
  
  def forEach(
    callbackfn: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  def includes(searchElement: MethodPath): Boolean = js.native
  def includes(searchElement: MethodPath, fromIndex: Double): Boolean = js.native
  
  def indexOf(searchElement: MethodPath): Double = js.native
  def indexOf(searchElement: MethodPath, fromIndex: Double): Double = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MethodPath]] = js.native
  
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  def keys(): IterableIterator[Double] = js.native
  
  def lastIndexOf(searchElement: MethodPath): Double = js.native
  def lastIndexOf(searchElement: MethodPath, fromIndex: Double): Double = js.native
  
  var length: Double = js.native
  
  def map[U](
    callbackfn: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], U]
  ): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  
  def pop(): js.UndefOr[MethodPath] = js.native
  
  def push(items: MethodPath*): Double = js.native
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ MethodPath, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      MethodPath
    ]
  ): MethodPath = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ MethodPath, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      MethodPath
    ],
    initialValue: MethodPath
  ): MethodPath = js.native
  def reduce[U_1](
    callbackfn: js.Function4[
      /* previousValue */ U_1, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      U_1
    ],
    initialValue: U_1
  ): U_1 = js.native
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ MethodPath, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      MethodPath
    ]
  ): MethodPath = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ MethodPath, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      MethodPath
    ],
    initialValue: MethodPath
  ): MethodPath = js.native
  def reduceRight[U_2](
    callbackfn: js.Function4[
      /* previousValue */ U_2, 
      /* currentValue */ MethodPath, 
      /* currentIndex */ Double, 
      /* array */ js.Array[MethodPath], 
      U_2
    ],
    initialValue: U_2
  ): U_2 = js.native
  
  def reverse(): js.Array[MethodPath] = js.native
  
  def shift(): js.UndefOr[MethodPath] = js.native
  
  def slice(): js.Array[MethodPath] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[MethodPath] = js.native
  def slice(start: Double): js.Array[MethodPath] = js.native
  def slice(start: Double, end: Double): js.Array[MethodPath] = js.native
  
  def some(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _]
  ): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ MethodPath, /* index */ Double, /* array */ js.Array[MethodPath], _],
    thisArg: js.Any
  ): Boolean = js.native
  
  def sort(): js.Array[MethodPath] = js.native
  def sort(compareFn: js.Function2[/* a */ MethodPath, /* b */ MethodPath, Double]): js.Array[MethodPath] = js.native
  
  def splice(start: Double): js.Array[MethodPath] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[MethodPath] = js.native
  def splice(start: Double, deleteCount: Double, items: MethodPath*): js.Array[MethodPath] = js.native
  
  @JSName(js.Symbol.unscopables)
  var unscopables: js.Function0[CopyWithin] = js.native
  
  def unshift(items: MethodPath*): Double = js.native
  
  def values(): IterableIterator[MethodPath] = js.native
}
