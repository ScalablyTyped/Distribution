package typings.intlMessageformatParser.typesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeSkeleton extends Skeleton {
  var location: js.UndefOr[Location] = js.native
  var pattern: String = js.native
  var `type`: `1` = js.native
}

object DateTimeSkeleton {
  @scala.inline
  def apply(pattern: String, `type`: `1`): DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeSkeleton]
  }
  @scala.inline
  implicit class DateTimeSkeletonOps[Self <: DateTimeSkeleton] (val x: Self) extends AnyVal {
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `1`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

