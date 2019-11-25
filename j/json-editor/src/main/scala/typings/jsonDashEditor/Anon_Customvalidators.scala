package typings.jsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Customvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
  ]
  var editors: Anon_Array
  var language: String
  var languages: js.Any
  var options: JSONEditorOptions[_]
  var resolvers: js.Array[js.Function1[/* schema */ _, String]]
}

object Anon_Customvalidators {
  @scala.inline
  def apply(
    custom_validators: js.Array[
      js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
    ],
    editors: Anon_Array,
    language: String,
    languages: js.Any,
    options: JSONEditorOptions[_],
    resolvers: js.Array[js.Function1[/* schema */ _, String]]
  ): Anon_Customvalidators = {
    val __obj = js.Dynamic.literal(custom_validators = custom_validators.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolvers = resolvers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Customvalidators]
  }
}

