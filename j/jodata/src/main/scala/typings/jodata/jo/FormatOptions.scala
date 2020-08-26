package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  def atom(): typings.jodata.jo = js.native
  def custom(value: String): typings.jodata.jo = js.native
  def json(): typings.jodata.jo = js.native
  def xml(): typings.jodata.jo = js.native
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: () => typings.jodata.jo,
    custom: String => typings.jodata.jo,
    json: () => typings.jodata.jo,
    xml: () => typings.jodata.jo
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
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
    def setAtom(value: () => typings.jodata.jo): Self = this.set("atom", js.Any.fromFunction0(value))
    @scala.inline
    def setCustom(value: String => typings.jodata.jo): Self = this.set("custom", js.Any.fromFunction1(value))
    @scala.inline
    def setJson(value: () => typings.jodata.jo): Self = this.set("json", js.Any.fromFunction0(value))
    @scala.inline
    def setXml(value: () => typings.jodata.jo): Self = this.set("xml", js.Any.fromFunction0(value))
  }
  
}

