package typings.legalEagle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var license: String = js.native
  var repository: String = js.native
  var source: String = js.native
  var sourceText: String = js.native
}

object Entry {
  @scala.inline
  def apply(license: String, repository: String, source: String, sourceText: String): Entry = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceText(value: String): Self = this.set("sourceText", value.asInstanceOf[js.Any])
  }
  
}

