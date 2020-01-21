package typings.hlsParser

import typings.hlsParser.mod.Byterange
import typings.hlsParser.mod.types.DateRange
import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.MediaInitializationSection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonByterange extends js.Object {
  var byterange: js.UndefOr[Byterange] = js.undefined
  var dateRange: js.UndefOr[DateRange] = js.undefined
  var discontinuity: js.UndefOr[Boolean] = js.undefined
  var discontinuitySequence: Double
  var duration: Double
  var key: js.UndefOr[Key] = js.undefined
  var map: js.UndefOr[MediaInitializationSection] = js.undefined
  var mediaSequenceNumber: Double
  var programDateTime: js.UndefOr[Date] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var uri: String
}

object AnonByterange {
  @scala.inline
  def apply(
    discontinuitySequence: Double,
    duration: Double,
    mediaSequenceNumber: Double,
    uri: String,
    byterange: Byterange = null,
    dateRange: DateRange = null,
    discontinuity: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    map: MediaInitializationSection = null,
    programDateTime: Date = null,
    title: String = null
  ): AnonByterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (byterange != null) __obj.updateDynamic("byterange")(byterange.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (!js.isUndefined(discontinuity)) __obj.updateDynamic("discontinuity")(discontinuity.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (programDateTime != null) __obj.updateDynamic("programDateTime")(programDateTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonByterange]
  }
}

