package typings.graphqlCompose.filterByDotPathsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOpts extends js.Object {
  var hideFields: StringDictionary[String] = js.native
  var hideFieldsNote: js.UndefOr[String] = js.native
}

object FilterOpts {
  @scala.inline
  def apply(hideFields: StringDictionary[String]): FilterOpts = {
    val __obj = js.Dynamic.literal(hideFields = hideFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOpts]
  }
  @scala.inline
  implicit class FilterOptsOps[Self <: FilterOpts] (val x: Self) extends AnyVal {
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
    def setHideFields(value: StringDictionary[String]): Self = this.set("hideFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideFieldsNote(value: String): Self = this.set("hideFieldsNote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFieldsNote: Self = this.set("hideFieldsNote", js.undefined)
  }
  
}

