package typings.graphqlFields.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var excludedFields: js.UndefOr[js.Array[String]] = js.native
  var processArguments: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExcludedFieldsVarargs(value: String*): Self = this.set("excludedFields", js.Array(value :_*))
    @scala.inline
    def setExcludedFields(value: js.Array[String]): Self = this.set("excludedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedFields: Self = this.set("excludedFields", js.undefined)
    @scala.inline
    def setProcessArguments(value: Boolean): Self = this.set("processArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessArguments: Self = this.set("processArguments", js.undefined)
  }
  
}

