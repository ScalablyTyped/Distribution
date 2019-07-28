package typings.inquirer.inquirerMod

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
    String | Double | Boolean | js.Array[_] | (js.Function1[/* answers */ A, _ | js.Promise[_]])
  ] = js.undefined
  /**
    * The question to print. If defined as a function, the first parameter will be
    * the current inquirer session answers.
    * Defaults to the value of `name` (followed by a colon).
    */
  var message: js.UndefOr[String | (js.Function1[/* answers */ A, String])] = js.undefined
  /**
    * The name to use when storing the answer in the answers hash.
    * If the name contains periods, it will define a path in the answers hash.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Change the default _prefix_ message.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Change the default _suffix_ message.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Receive the current user answers hash and should return `true` or `false` depending
    * on whether or not this question should be asked. The value can also be a simple boolean.
    */
  var when: js.UndefOr[Boolean | (js.Function1[/* answers */ A, Boolean | js.Promise[Boolean]])] = js.undefined
}

object QuestionCommon {
  @scala.inline
  def apply[A](
    default: String | Double | Boolean | js.Array[_] | (js.Function1[/* answers */ A, _ | js.Promise[_]]) = null,
    message: String | (js.Function1[/* answers */ A, String]) = null,
    name: String = null,
    prefix: String = null,
    suffix: String = null,
    when: Boolean | (js.Function1[/* answers */ A, Boolean | js.Promise[Boolean]]) = null
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

