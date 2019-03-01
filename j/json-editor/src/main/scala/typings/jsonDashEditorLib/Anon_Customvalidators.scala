package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Customvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[
      /* schema */ _, 
      /* value */ java.lang.String, 
      /* path */ java.lang.String, 
      js.Array[JSONEditorError]
    ]
  ]
  var editors: Anon_Array
  var language: java.lang.String
  var languages: js.Any
  var options: JSONEditorOptions[_]
  var resolvers: js.Array[js.Function1[/* schema */ _, java.lang.String]]
}

object Anon_Customvalidators {
  @scala.inline
  def apply(
    custom_validators: js.Array[
      js.Function3[
        /* schema */ _, 
        /* value */ java.lang.String, 
        /* path */ java.lang.String, 
        js.Array[JSONEditorError]
      ]
    ],
    editors: Anon_Array,
    language: java.lang.String,
    languages: js.Any,
    options: JSONEditorOptions[_],
    resolvers: js.Array[js.Function1[/* schema */ _, java.lang.String]]
  ): Anon_Customvalidators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custom_validators")(custom_validators)
    __obj.updateDynamic("editors")(editors)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("languages")(languages)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[Anon_Customvalidators]
  }
}

