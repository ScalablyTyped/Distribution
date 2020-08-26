package typings.inflected.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transliterate extends js.Object {
  var locale: String = js.native
  var replacement: String = js.native
}

object Transliterate {
  @scala.inline
  def apply(locale: String, replacement: String): Transliterate = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transliterate]
  }
  @scala.inline
  implicit class TransliterateOps[Self <: Transliterate] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
  }
  
}

