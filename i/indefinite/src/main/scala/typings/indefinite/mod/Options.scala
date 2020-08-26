package typings.indefinite.mod

import typings.indefinite.indefiniteStrings.colloquial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var articleOnly: js.UndefOr[Boolean] = js.native
  var capitalize: js.UndefOr[Boolean] = js.native
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  var numbers: js.UndefOr[colloquial] = js.native
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
    def setArticleOnly(value: Boolean): Self = this.set("articleOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArticleOnly: Self = this.set("articleOnly", js.undefined)
    @scala.inline
    def setCapitalize(value: Boolean): Self = this.set("capitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapitalize: Self = this.set("capitalize", js.undefined)
    @scala.inline
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
    @scala.inline
    def setNumbers(value: colloquial): Self = this.set("numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumbers: Self = this.set("numbers", js.undefined)
  }
  
}

