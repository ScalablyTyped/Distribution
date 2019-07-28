package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'choices' | 'filter' | 'pageSize' ]: inquirer.inquirer.QuestionOptions<A>[P]} */ trait RawListQuestion[A]
  extends QuestionCommon[A]
     with Question[A] {
  var `type`: rawlist
}

object RawListQuestion {
  @scala.inline
  def apply[A](
    `type`: rawlist,
    default: String | Double | Boolean | js.Array[_] | (js.Function1[A, _ | js.Promise[_]]) = null,
    message: String | (js.Function1[A, String]) = null,
    name: String = null,
    prefix: String = null,
    suffix: String = null,
    when: Boolean | (js.Function1[A, Boolean | js.Promise[Boolean]]) = null
  ): RawListQuestion[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawListQuestion[A]]
  }
}

