package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Path
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesObjectMod {
  
  @JSImport("ipfs-http-server/dist/src/api/routes/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(items: (js.Array[Path] | Path)*): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  
  inline def copyWithin(target: Double, start: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def copyWithin(target: Double, start: Double, end: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def entries(): IterableIterator[js.Tuple2[Double, Path]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, Path]]]
  
  inline def every(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def every(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any],
    thisArg: js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every_S_Path[S /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S */ Boolean]
  ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
  inline def every_S_Path[S /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S */ Boolean],
    thisArg: js.Any
  ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
  
  inline def fill(value: Path): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  inline def fill(value: Path, start: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def fill(value: Path, start: Double, end: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def fill(value: Path, start: Unit, end: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def filter(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any]): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  inline def filter(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any],
    thisArg: js.Any
  ): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def filter_S_1_Path[S_1 /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S_1 */ Boolean]
  ): js.Array[S_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S_1]]
  inline def filter_S_1_Path[S_1 /* <: Path */](
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], /* is S_1 */ Boolean],
    thisArg: js.Any
  ): js.Array[S_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S_1]]
  
  inline def find(predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], js.Any]): js.UndefOr[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Path]]
  inline def find(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], js.Any],
    thisArg: js.Any
  ): js.UndefOr[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Path]]
  inline def find[S_2 /* <: Path */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is S_2 */ Boolean
    ]
  ): js.UndefOr[S_2] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S_2]]
  inline def find[S_2 /* <: Path */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is S_2 */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S_2] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S_2]]
  
  inline def findIndex(predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def findIndex(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], js.Any],
    thisArg: js.Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def forEach(callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit],
    thisArg: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def includes(searchElement: Path): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def includes(searchElement: Path, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf(searchElement: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOf(searchElement: Path, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
  inline def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
  
  inline def lastIndexOf(searchElement: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def lastIndexOf(searchElement: Path, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("ipfs-http-server/dist/src/api/routes/object", "length")
  @js.native
  def length: Double = js.native
  inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  inline def map[U](callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], U]): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
  inline def map[U](
    callbackfn: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], U],
    thisArg: js.Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def pop(): js.UndefOr[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[Path]]
  
  inline def push(items: Path*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ]
  ): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ],
    initialValue: Path
  ): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def reduce[U_1](
    callbackfn: js.Function4[
      /* previousValue */ U_1, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      U_1
    ],
    initialValue: U_1
  ): U_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_1]
  
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ]
  ): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ],
    initialValue: Path
  ): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def reduceRight[U_2](
    callbackfn: js.Function4[
      /* previousValue */ U_2, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      U_2
    ],
    initialValue: U_2
  ): U_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_2]
  
  inline def reverse(): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[Path]]
  
  inline def shift(): js.UndefOr[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[Path]]
  
  inline def slice(): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[Path]]
  inline def slice(start: Double): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  inline def slice(start: Double, end: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def slice(start: Unit, end: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def some(predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def some(
    predicate: js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], js.Any],
    thisArg: js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sort(): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[js.Array[Path]]
  inline def sort(compareFn: js.Function2[/* a */ Path, /* b */ Path, Double]): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  
  inline def splice(start: Double): js.Array[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Path]]
  inline def splice(start: Double, deleteCount: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  inline def splice(start: Double, deleteCount: Double, items: Path*): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  inline def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
  
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  inline def unshift(items: Path*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def values(): IterableIterator[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[Path]]
}
