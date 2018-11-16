package typings
package jestLib.jestNs

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
  // tslint:disable-next-line ban-types
  def apply(name: java.lang.String, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  def apply(name: FunctionLike, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  def apply(name: js.Function, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  def apply(name: scala.Double, fn: EmptyFunction): scala.Unit = js.native
  def each(cases: js.Array[_]): js.Function2[
    /* name */ java.lang.String, 
    /* fn */ js.Function1[/* repeated */js.Any, _], 
    scala.Unit
  ] = js.native
  def each(strings: stdLib.TemplateStringsArray, placeholders: js.Any*): js.Function2[/* name */ java.lang.String, /* fn */ js.Function1[/* arg */ js.Any, _], scala.Unit] = js.native
  // tslint:disable-next-line ban-types
  /** Only runs the tests inside this `describe` for the current file */
  def only(name: java.lang.String, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Only runs the tests inside this `describe` for the current file */
  def only(name: FunctionLike, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Only runs the tests inside this `describe` for the current file */
  def only(name: js.Function, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Only runs the tests inside this `describe` for the current file */
  def only(name: scala.Double, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Skips running the tests inside this `describe` for the current file */
  def skip(name: java.lang.String, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Skips running the tests inside this `describe` for the current file */
  def skip(name: FunctionLike, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Skips running the tests inside this `describe` for the current file */
  def skip(name: js.Function, fn: EmptyFunction): scala.Unit = js.native
  // tslint:disable-next-line ban-types
  /** Skips running the tests inside this `describe` for the current file */
  def skip(name: scala.Double, fn: EmptyFunction): scala.Unit = js.native
}

