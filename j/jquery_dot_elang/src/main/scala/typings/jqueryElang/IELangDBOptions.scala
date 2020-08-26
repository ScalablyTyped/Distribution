package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELang database (LocalStorage) functionality with Singleton instance
@js.native
trait IELangDBOptions extends js.Object {
  var autocompleteRows: Double = js.native
}

object IELangDBOptions {
  @scala.inline
  def apply(autocompleteRows: Double): IELangDBOptions = {
    val __obj = js.Dynamic.literal(autocompleteRows = autocompleteRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBOptions]
  }
  @scala.inline
  implicit class IELangDBOptionsOps[Self <: IELangDBOptions] (val x: Self) extends AnyVal {
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
    def setAutocompleteRows(value: Double): Self = this.set("autocompleteRows", value.asInstanceOf[js.Any])
  }
  
}

