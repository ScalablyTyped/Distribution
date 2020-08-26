package typings.hlsParser.anon

import typings.hlsParser.mod.types.DateRange
import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.MediaInitializationSection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Byterange extends js.Object {
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var discontinuity: js.UndefOr[Boolean] = js.native
  var discontinuitySequence: Double = js.native
  var duration: Double = js.native
  var key: js.UndefOr[Key] = js.native
  var map: js.UndefOr[MediaInitializationSection] = js.native
  var mediaSequenceNumber: Double = js.native
  var programDateTime: js.UndefOr[Date] = js.native
  var title: js.UndefOr[String] = js.native
  var uri: String = js.native
}

object Byterange {
  @scala.inline
  def apply(discontinuitySequence: Double, duration: Double, mediaSequenceNumber: Double, uri: String): Byterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Byterange]
  }
  @scala.inline
  implicit class ByterangeOps[Self <: Byterange] (val x: Self) extends AnyVal {
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
    def setDiscontinuitySequence(value: Double): Self = this.set("discontinuitySequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaSequenceNumber(value: Double): Self = this.set("mediaSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setByterange(value: typings.hlsParser.mod.Byterange): Self = this.set("byterange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByterange: Self = this.set("byterange", js.undefined)
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setDiscontinuity(value: Boolean): Self = this.set("discontinuity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscontinuity: Self = this.set("discontinuity", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMap(value: MediaInitializationSection): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setProgramDateTime(value: Date): Self = this.set("programDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramDateTime: Self = this.set("programDateTime", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

