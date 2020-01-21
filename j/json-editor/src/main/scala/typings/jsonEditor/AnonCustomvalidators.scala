package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
  ]
  var editors: AnonArray
  var language: String
  var languages: js.Any
  var options: JSONEditorOptions[_]
  var resolvers: js.Array[js.Function1[/* schema */ _, String]]
}

object AnonCustomvalidators {
  @scala.inline
  def apply(
    custom_validators: js.Array[
      js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
    ],
    editors: AnonArray,
    language: String,
    languages: js.Any,
    options: JSONEditorOptions[_],
    resolvers: js.Array[js.Function1[/* schema */ _, String]]
  ): AnonCustomvalidators = {
    val __obj = js.Dynamic.literal(custom_validators = custom_validators.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolvers = resolvers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCustomvalidators]
  }
}

