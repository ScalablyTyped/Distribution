package typings.lib0

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArrayMod {
  
  @JSImport("lib0/dist/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendTo[M](dest: js.Array[M], src: js.Array[M]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copy[D](a: js.Array[D]): js.Array[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[D]]
  
  inline def create[C](): js.Array[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[C]]
  
  inline def equalFlat[ELEM](a: js.Array[ELEM], b: js.Array[ELEM]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalFlat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every[ITEM](
    arr: js.Array[ITEM],
    f: js.Function3[/* arg0 */ ITEM, /* arg1 */ Double, /* arg2 */ js.Array[ITEM], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flatten[ELEM](arr: js.Array[js.Array[ELEM]]): js.Array[ELEM] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ELEM]]
  
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
  
  inline def last[L](arr: js.Array[L]): L = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(arr.asInstanceOf[js.Any]).asInstanceOf[L]
  
  inline def some[S](
    arr: js.Array[S],
    f: js.Function3[/* arg0 */ S, /* arg1 */ Double, /* arg2 */ js.Array[S], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
