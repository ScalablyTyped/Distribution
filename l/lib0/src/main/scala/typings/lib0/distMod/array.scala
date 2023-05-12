package typings.lib0.distMod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object array {
  
  @JSImport("lib0/dist", "array")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendTo[M](dest: js.Array[M], src: js.Array[M]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copy[D](a: js.Array[D]): js.Array[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[D]]
  
  inline def create[C](): js.Array[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[C]]
  
  inline def equalFlat[ELEM](a: ArrayLike[ELEM], b: ArrayLike[ELEM]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every[ITEM, ARR /* <: ArrayLike[ITEM] */](arr: ARR, f: js.Function3[/* arg0 */ ITEM, /* arg1 */ Double, /* arg2 */ ARR, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flatten[ELEM](arr: js.Array[js.Array[ELEM]]): js.Array[ELEM] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ELEM]]
  
  inline def fold[T_1, RESULT](
    arr: js.Array[T_1],
    seed: RESULT,
    folder: js.Function3[/* arg0 */ RESULT, /* arg1 */ T_1, /* arg2 */ Double, RESULT]
  ): RESULT = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], folder.asInstanceOf[js.Any])).asInstanceOf[RESULT]
  
  inline def from[T_3](iterable: js.Iterable[T_3]): js.Array[T_3] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T_3]]
  inline def from[T_3](iterable: ArrayLike[T_3]): js.Array[T_3] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T_3]]
  inline def from[T_4, U_1](iterable: js.Iterable[T_4], mapfn: js.Function2[/* v */ T_4, /* k */ Double, U_1]): js.Array[U_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U_1]]
  inline def from[T_4, U_1](iterable: js.Iterable[T_4], mapfn: js.Function2[/* v */ T_4, /* k */ Double, U_1], thisArg: Any): js.Array[U_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U_1]]
  inline def from[T_4, U_1](iterable: ArrayLike[T_4], mapfn: js.Function2[/* v */ T_4, /* k */ Double, U_1]): js.Array[U_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U_1]]
  inline def from[T_4, U_1](iterable: ArrayLike[T_4], mapfn: js.Function2[/* v */ T_4, /* k */ Double, U_1], thisArg: Any): js.Array[U_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U_1]]
  
  inline def from_T_1[T_1](arrayLike: ArrayLike[T_1]): js.Array[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Array[T_1]]
  
  inline def from_T_2U[T_2, U](arrayLike: ArrayLike[T_2], mapfn: js.Function2[/* v */ T_2, /* k */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def from_T_2U[T_2, U](arrayLike: ArrayLike[T_2], mapfn: js.Function2[/* v */ T_2, /* k */ Double, U], thisArg: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def last[L](arr: ArrayLike[L]): L = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(arr.asInstanceOf[js.Any]).asInstanceOf[L]
  
  inline def some[S, ARR /* <: ArrayLike[S] */](arr: ARR, f: js.Function3[/* arg0 */ S, /* arg1 */ Double, /* arg2 */ ARR, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unfold[T_1](len: Double, f: js.Function2[/* arg0 */ Double, /* arg1 */ js.Array[T_1], T_1]): js.Array[T_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfold")(len.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_1]]
  
  inline def unique[T_1](arr: js.Array[T_1]): js.Array[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T_1]]
  
  inline def uniqueBy[T_1, M](arr: ArrayLike[T_1], mapper: js.Function1[/* arg0 */ T_1, M]): js.Array[T_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueBy")(arr.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_1]]
}
