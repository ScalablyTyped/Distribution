package typings.jsonEditor.anon

import typings.jsonEditor.JSONEditorError
import typings.jsonEditor.JSONEditorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
  ] = js.native
  var editors: Array = js.native
  var language: String = js.native
  var languages: js.Any = js.native
  var options: JSONEditorOptions[_] = js.native
  var resolvers: js.Array[js.Function1[/* schema */ _, String]] = js.native
}

object Customvalidators {
  @scala.inline
  def apply(
    custom_validators: js.Array[
      js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
    ],
    editors: Array,
    language: String,
    languages: js.Any,
    options: JSONEditorOptions[_],
    resolvers: js.Array[js.Function1[/* schema */ _, String]]
  ): Customvalidators = {
    val __obj = js.Dynamic.literal(custom_validators = custom_validators.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customvalidators]
  }
  @scala.inline
  implicit class CustomvalidatorsOps[Self <: Customvalidators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustom_validatorsVarargs(value: (js.Function3[js.Any, /* value */ String, /* path */ String, js.Array[JSONEditorError]])*): Self = this.set("custom_validators", js.Array(value :_*))
    @scala.inline
    def setCustom_validators(
      value: js.Array[
          js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
        ]
    ): Self = this.set("custom_validators", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditors(value: Array): Self = this.set("editors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguages(value: js.Any): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: JSONEditorOptions[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolversVarargs(value: (js.Function1[js.Any, String])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: js.Array[js.Function1[/* schema */ _, String]]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
  }
  
}

