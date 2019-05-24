package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestionOptions[A] extends js.Object {
  /**
    * Choices array or a function returning a choices array. If defined as a function,
    * the first parameter will be the current inquirer session answers. Array values can
    * be simple `numbers`, `strings`, or `objects` containing a `name` (to display in list),
    * a `value` (to save in the answers hash) and a `short` (to display after selection)
    * properties. The choices array can also contain
    * [a Separator](https://github.com/SBoudrias/Inquirer.js#separator).
    */
  var choices: js.UndefOr[
    js.Array[ChoiceType[A]] | (js.Function1[/* answers */ A, js.Array[ChoiceType[A]]]) | (js.Function1[/* answers */ A, js.Promise[js.Array[ChoiceType[A]]]])
  ] = js.undefined
  /**
    * Receive the user input and return the filtered value to be used inside the program.
    * The value returned will be added to the _Answers_ hash.
    */
  var filter: js.UndefOr[js.Function1[/* input */ java.lang.String, _]] = js.undefined
  /**
    * Change the number of lines that will be rendered when using `list`, `rawList`,
    * `expand` or `checkbox`.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Receive the user input, answers hash and option flags, and return a transformed value
    * to display to the user. The transformation only impacts what is shown while editing.
    * It does not modify the answers hash.
    */
  var transformer: js.UndefOr[
    js.Function3[/* input */ java.lang.String, /* answers */ A, /* flags */ js.Any, java.lang.String]
  ] = js.undefined
}

object QuestionOptions {
  @scala.inline
  def apply[A](
    choices: js.Array[ChoiceType[A]] | (js.Function1[/* answers */ A, js.Array[ChoiceType[A]]]) | (js.Function1[/* answers */ A, js.Promise[js.Array[ChoiceType[A]]]]) = null,
    filter: /* input */ java.lang.String => _ = null,
    pageSize: scala.Int | scala.Double = null,
    transformer: (/* input */ java.lang.String, /* answers */ A, /* flags */ js.Any) => java.lang.String = null
  ): QuestionOptions[A] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3(transformer))
    __obj.asInstanceOf[QuestionOptions[A]]
  }
}

