package typings
package inquirerLib.inquirerMod.inquirerNs

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

