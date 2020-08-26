package typings.intlMessageformatParser.srcSkeletonMod

import typings.intlMessageformatParser.intlMessageformatParserStrings.h11
import typings.intlMessageformatParser.intlMessageformatParserStrings.h12
import typings.intlMessageformatParser.intlMessageformatParserStrings.h23
import typings.intlMessageformatParser.intlMessageformatParserStrings.h24
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedDateTimeFormatOptions extends DateTimeFormatOptions {
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
}

object ExtendedDateTimeFormatOptions {
  @scala.inline
  def apply(): ExtendedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedDateTimeFormatOptions]
  }
  @scala.inline
  implicit class ExtendedDateTimeFormatOptionsOps[Self <: ExtendedDateTimeFormatOptions] (val x: Self) extends AnyVal {
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
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = this.set("hourCycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourCycle: Self = this.set("hourCycle", js.undefined)
  }
  
}

