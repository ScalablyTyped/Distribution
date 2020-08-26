package typings.keystonejsAppGraphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Introspection extends js.Object {
  var introspection: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.native
}

object Introspection {
  @scala.inline
  def apply(): Introspection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Introspection]
  }
  @scala.inline
  implicit class IntrospectionOps[Self <: Introspection] (val x: Self) extends AnyVal {
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
    def setIntrospection(value: Boolean): Self = this.set("introspection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntrospection: Self = this.set("introspection", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(value: js.Any*): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(value: js.Array[js.Any]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

