package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelOptions extends OptionsBase {
                // the path to the value (used to create related observables from the factory).
  var factories: js.UndefOr[js.Any] = js.native
  var internals: js.UndefOr[js.Array[String]] = js.native
          // an array of atttributes that will have kb.Observables created even if they do not exist on the Backbone.Model. Useful for binding Views that require specific observables to exist
  var keys: js.UndefOr[js.Array[String]] = js.native
         // an array of atttributes that should be scoped with an underscore, eg. name -> _name
  var requires: js.UndefOr[js.Array[String]] = js.native
              // restricts the keys used on a model. Useful for reducing the number of kb.Observables created from a limited set of Backbone.Model attributes
  def `if`(objOrArray: js.Any): js.Any = js.native
}

object ViewModelOptions {
  @scala.inline
  def apply(`if`: js.Any => js.Any): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    __obj.asInstanceOf[ViewModelOptions]
  }
  @scala.inline
  implicit class ViewModelOptionsOps[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
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
    def setIf(value: js.Any => js.Any): Self = this.set("if", js.Any.fromFunction1(value))
    @scala.inline
    def setFactories(value: js.Any): Self = this.set("factories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactories: Self = this.set("factories", js.undefined)
    @scala.inline
    def setInternalsVarargs(value: String*): Self = this.set("internals", js.Array(value :_*))
    @scala.inline
    def setInternals(value: js.Array[String]): Self = this.set("internals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternals: Self = this.set("internals", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    @scala.inline
    def setRequires(value: js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
  }
  
}

