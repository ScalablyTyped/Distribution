package typings.ipfsHttpServer

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ipfsHttpServer.anon.CopyWithin
import typings.ipfsHttpServer.anon.Path
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-http-server/dist/src/api/routes/repo", JSImport.Namespace)
@js.native
object routesRepoMod extends TopLevel[/* n */ NumberDictionary[Path]] {
  
  def concat(items: (js.Array[Path] | Path)*): js.Array[Path] = js.native
  
  def copyWithin(target: Double, start: Double): js.Array[Path] = js.native
  def copyWithin(target: Double, start: Double, end: Double): js.Array[Path] = js.native
  
  def entries(): IterableIterator[js.Tuple2[Double, Path]] = js.native
  
  def every(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _]): Boolean = js.native
  def every(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _],
    thisArg: js.Any
  ): Boolean = js.native
  @JSName("every")
  def every_S_Path[S /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S */ Boolean]
  ): /* is std.Array<S> */ Boolean = js.native
  @JSName("every")
  def every_S_Path[S /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S */ Boolean],
    thisArg: js.Any
  ): /* is std.Array<S> */ Boolean = js.native
  
  def fill(value: Path): js.Array[Path] = js.native
  def fill(value: Path, start: js.UndefOr[scala.Nothing], end: Double): js.Array[Path] = js.native
  def fill(value: Path, start: Double): js.Array[Path] = js.native
  def fill(value: Path, start: Double, end: Double): js.Array[Path] = js.native
  
  def filter(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _]): js.Array[Path] = js.native
  def filter(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _],
    thisArg: js.Any
  ): js.Array[Path] = js.native
  @JSName("filter")
  def filter_S_1_Path[S_1 /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S_1 */ Boolean]
  ): js.Array[S_1] = js.native
  @JSName("filter")
  def filter_S_1_Path[S_1 /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S_1 */ Boolean],
    thisArg: js.Any
  ): js.Array[S_1] = js.native
  
  def find(predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _]): js.UndefOr[Path] = js.native
  def find(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _],
    thisArg: js.Any
  ): js.UndefOr[Path] = js.native
  def find[S_2 /* <: Path */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is S_2 */ Boolean
    ]
  ): js.UndefOr[S_2] = js.native
  def find[S_2 /* <: Path */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is S_2 */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S_2] = js.native
  
  def findIndex(predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _],
    thisArg: js.Any
  ): Double = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  def includes(searchElement: Path): Boolean = js.native
  def includes(searchElement: Path, fromIndex: Double): Boolean = js.native
  
  def indexOf(searchElement: Path): Double = js.native
  def indexOf(searchElement: Path, fromIndex: Double): Double = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Path]] = js.native
  
  def join(): String = js.native
  def join(separator: String): String = js.native
  
  def keys(): IterableIterator[Double] = js.native
  
  def lastIndexOf(searchElement: Path): Double = js.native
  def lastIndexOf(searchElement: Path, fromIndex: Double): Double = js.native
  
  var length: Double = js.native
  
  def map[U](callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], U]): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  
  def pop(): js.UndefOr[Path] = js.native
  
  def push(items: Path*): Double = js.native
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ]
  ): Path = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ],
    initialValue: Path
  ): Path = js.native
  def reduce[U_1](
    callbackfn: js.Function4[
      /* previousValue */ U_1, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      U_1
    ],
    initialValue: U_1
  ): U_1 = js.native
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ]
  ): Path = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ],
    initialValue: Path
  ): Path = js.native
  def reduceRight[U_2](
    callbackfn: js.Function4[
      /* previousValue */ U_2, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      U_2
    ],
    initialValue: U_2
  ): U_2 = js.native
  
  def reverse(): js.Array[Path] = js.native
  
  def shift(): js.UndefOr[Path] = js.native
  
  def slice(): js.Array[Path] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[Path] = js.native
  def slice(start: Double): js.Array[Path] = js.native
  def slice(start: Double, end: Double): js.Array[Path] = js.native
  
  def some(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _]): Boolean = js.native
  def some(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _],
    thisArg: js.Any
  ): Boolean = js.native
  
  def sort(): js.Array[Path] = js.native
  def sort(compareFn: js.Function2[/* a */ Path, /* b */ Path, Double]): js.Array[Path] = js.native
  
  def splice(start: Double): js.Array[Path] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[Path] = js.native
  def splice(start: Double, deleteCount: Double, items: Path*): js.Array[Path] = js.native
  
  @JSName(js.Symbol.unscopables)
  var unscopables: js.Function0[CopyWithin] = js.native
  
  def unshift(items: Path*): Double = js.native
  
  def values(): IterableIterator[Path] = js.native
}
