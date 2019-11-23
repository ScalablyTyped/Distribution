package typings.hlsDashParser

import typings.hlsDashParser.hlsDashParserMod.Byterange
import typings.hlsDashParser.hlsDashParserMod.types.DateRange
import typings.hlsDashParser.hlsDashParserMod.types.Key
import typings.hlsDashParser.hlsDashParserMod.types.MediaInitializationSection
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Byterange extends js.Object {
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

object Anon_Byterange {
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
  ): Anon_Byterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence, duration = duration, mediaSequenceNumber = mediaSequenceNumber, uri = uri)
    if (byterange != null) __obj.updateDynamic("byterange")(byterange)
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange)
    if (!js.isUndefined(discontinuity)) __obj.updateDynamic("discontinuity")(discontinuity)
    if (key != null) __obj.updateDynamic("key")(key)
    if (map != null) __obj.updateDynamic("map")(map)
    if (programDateTime != null) __obj.updateDynamic("programDateTime")(programDateTime)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Byterange]
  }
}

