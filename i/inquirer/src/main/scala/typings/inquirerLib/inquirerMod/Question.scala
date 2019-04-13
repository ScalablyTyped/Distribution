package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Question[T] extends js.Object {
  /**
    * Choices array or a function returning a choices array. If defined as a function,
    * the first parameter will be the current inquirer session answers.
    * Array values can be simple strings, or objects containing a name (to display) and a value properties
    * (to save in the answers hash). Values can also be a Separator.
    */
  var choices: js.UndefOr[
    js.Array[ChoiceType] | (js.Function1[/* answers */ T, js.Array[ChoiceType]]) | (js.Function1[/* answers */ T, js.Promise[js.Array[ChoiceType]]])
  ] = js.undefined
  /**
    * Default value(s) to use if nothing is entered, or a function that returns the default value(s).
    * If defined as a function, the first parameter will be the current inquirer session answers.
    */
  var default: js.UndefOr[
    js.Any | (js.Function1[/* answers */ T, _]) | (js.Function1[/* answers */ T, js.Promise[_]])
  ] = js.undefined
  /**
    * Receive the user input and return the filtered value to be used inside the program.
    * The value returned will be added to the Answers hash.
    */
  var filter: js.UndefOr[js.Function1[/* input */ java.lang.String, _]] = js.undefined
  /**
    * Add a mask when password will entered
    */
  var mask: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The question to print. If defined as a function,
    * the first parameter will be the current inquirer session answers.
    */
  var message: js.UndefOr[java.lang.String | (js.Function1[/* answers */ T, java.lang.String])] = js.undefined
  /**
    * The name to use when storing the answer in the anwers hash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the number of lines that will be rendered when using list, rawList, expand or checkbox.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var paginated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change the default prefix message.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the default suffix message.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Receive the user input and return the transformed value to be displayed to the user. The
    * transformation only impacts what is shown while editing. It does not impact the answers
    * hash.
    */
  var transformer: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Type of the prompt.
    * Possible values:
    * <ul>
    *      <li>input</li>
  	     *      <li>number</li>
    *      <li>confirm</li>
    *      <li>list</li>
    *      <li>rawlist</li>
    *      <li>password</li>
    * </ul>
    * @defaults: 'input'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Receive the user input and should return true if the value is valid, and an error message (String)
    * otherwise. If false is returned, a default error message is provided.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String])
    ]
  ] = js.undefined
  /**
    * Receive the current user answers hash and should return true or false depending on whether or
    * not this question should be asked. The value can also be a simple boolean.
    */
  var when: js.UndefOr[
    scala.Boolean | (js.Function1[/* answers */ T, scala.Boolean]) | (js.Function1[/* answers */ T, js.Promise[scala.Boolean]])
  ] = js.undefined
}

object Question {
  @scala.inline
  def apply[T](
    choices: js.Array[ChoiceType] | (js.Function1[/* answers */ T, js.Array[ChoiceType]]) | (js.Function1[/* answers */ T, js.Promise[js.Array[ChoiceType]]]) = null,
    default: js.Any | (js.Function1[/* answers */ T, _]) | (js.Function1[/* answers */ T, js.Promise[_]]) = null,
    filter: /* input */ java.lang.String => _ = null,
    mask: java.lang.String = null,
    message: java.lang.String | (js.Function1[/* answers */ T, java.lang.String]) = null,
    name: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    paginated: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    transformer: /* input */ java.lang.String => java.lang.String = null,
    `type`: java.lang.String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String]) = null,
    when: scala.Boolean | (js.Function1[/* answers */ T, scala.Boolean]) | (js.Function1[/* answers */ T, js.Promise[scala.Boolean]]) = null
  ): Question[T] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginated)) __obj.updateDynamic("paginated")(paginated)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1(transformer))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question[T]]
  }
}

