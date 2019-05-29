package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestionCommon[A] extends js.Object {
  /**
    * Default value(s) to use if nothing is entered, or a function that returns
    * the default value(s). If defined as a function, the first parameter will be
    * the current inquirer session answers.
    */
  var default: js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Array[_] | (js.Function1[/* answers */ A, _ | js.Promise[_]])
  ] = js.undefined
  /**
    * The question to print. If defined as a function, the first parameter will be
    * the current inquirer session answers.
    * Defaults to the value of `name` (followed by a colon).
    */
  var message: js.UndefOr[java.lang.String | (js.Function1[/* answers */ A, java.lang.String])] = js.undefined
  /**
    * The name to use when storing the answer in the answers hash.
    * If the name contains periods, it will define a path in the answers hash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the default _prefix_ message.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the default _suffix_ message.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Receive the current user answers hash and should return `true` or `false` depending
    * on whether or not this question should be asked. The value can also be a simple boolean.
    */
  var when: js.UndefOr[
    scala.Boolean | (js.Function1[/* answers */ A, scala.Boolean | js.Promise[scala.Boolean]])
  ] = js.undefined
}

object QuestionCommon {
  @scala.inline
  def apply[A](
    default: java.lang.String | scala.Double | scala.Boolean | js.Array[_] | (js.Function1[/* answers */ A, _ | js.Promise[_]]) = null,
    message: java.lang.String | (js.Function1[/* answers */ A, java.lang.String]) = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    when: scala.Boolean | (js.Function1[/* answers */ A, scala.Boolean | js.Promise[scala.Boolean]]) = null
  ): QuestionCommon[A] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionCommon[A]]
  }
}

