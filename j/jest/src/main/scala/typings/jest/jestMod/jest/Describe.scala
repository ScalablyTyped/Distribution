package typings.jest.jestMod.jest

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Describe extends js.Object {
  @JSName("each")
  var each_Original: Each = js.native
  /** Only runs the tests inside this `describe` for the current file */
  @JSName("only")
  var only_Original: Describe = js.native
  /** Skips running the tests inside this `describe` for the current file */
  @JSName("skip")
  var skip_Original: Describe = js.native
  def apply(name: String, fn: EmptyFunction): Unit = js.native
  def apply(name: js.Function, fn: EmptyFunction): Unit = js.native
  // tslint:disable-next-line ban-types
  def apply(name: Double, fn: EmptyFunction): Unit = js.native
  def apply(name: FunctionLike, fn: EmptyFunction): Unit = js.native
  def each(cases: js.Array[js.Array[_]]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def each(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* arg */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  // Not arrays.
  @JSName("each")
  def each_T[T](cases: js.Array[T]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ T, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  // Exclusively arrays.
  @JSName("each")
  def each_T_ArrayWildcard[T /* <: js.Array[_] */](cases: js.Array[T]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* args */ T, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  def only(name: String, fn: EmptyFunction): Unit = js.native
  def only(name: js.Function, fn: EmptyFunction): Unit = js.native
  // tslint:disable-next-line ban-types
  /** Only runs the tests inside this `describe` for the current file */
  def only(name: Double, fn: EmptyFunction): Unit = js.native
  def only(name: FunctionLike, fn: EmptyFunction): Unit = js.native
  def skip(name: String, fn: EmptyFunction): Unit = js.native
  def skip(name: js.Function, fn: EmptyFunction): Unit = js.native
  // tslint:disable-next-line ban-types
  /** Skips running the tests inside this `describe` for the current file */
  def skip(name: Double, fn: EmptyFunction): Unit = js.native
  def skip(name: FunctionLike, fn: EmptyFunction): Unit = js.native
}

