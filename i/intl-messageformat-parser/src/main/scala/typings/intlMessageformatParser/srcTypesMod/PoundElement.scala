package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.srcTypesMod.TYPE.pound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoundElement extends _MessageFormatElement {
  var location: js.UndefOr[Location] = js.native
  var `type`: pound = js.native
}

object PoundElement {
  @scala.inline
  def apply(`type`: pound): PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoundElement]
  }
  @scala.inline
  implicit class PoundElementOps[Self <: PoundElement] (val x: Self) extends AnyVal {
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
    def setType(value: pound): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

