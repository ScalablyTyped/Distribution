package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'filter' | 'transformer' ]: inquirer.inquirer.QuestionOptions<A>[P]} */ trait PasswordQuestion[A]
  extends QuestionCommon[A]
     with Question[A] {
  /**
    * Hides the user input.
    */
  var mask: js.UndefOr[String] = js.undefined
  var `type`: password
  /**
    * Receive the user input and answers hash. Should return `true` if the value is valid,
    * and an error message (`String`) otherwise. If `false` is returned, a default error
    * message is provided.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ String, 
      /* answers */ js.UndefOr[A], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ] = js.undefined
}

object PasswordQuestion {
  @scala.inline
  def apply[A](
    `type`: password,
    default: String | Double | Boolean | js.Array[_] | (js.Function1[A, _ | js.Promise[_]]) = null,
    mask: String = null,
    message: String | (js.Function1[A, String]) = null,
    name: String = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ String, /* answers */ js.UndefOr[A]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: Boolean | (js.Function1[A, Boolean | js.Promise[Boolean]]) = null
  ): PasswordQuestion[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordQuestion[A]]
  }
}

