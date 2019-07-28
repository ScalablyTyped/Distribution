package typings.jsDashJoda.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DateTimeFormatterBuilder")
@js.native
class DateTimeFormatterBuilder () extends js.Object {
  def append(formatter: DateTimeFormatter): DateTimeFormatterBuilder = js.native
  def appendFraction(field: TemporalField, minWidth: Double, maxWidth: Double, decimalPoint: Boolean): DateTimeFormatterBuilder = js.native
  def appendInstant(fractionalDigits: Double): DateTimeFormatterBuilder = js.native
  def appendLiteral(literal: js.Any): DateTimeFormatterBuilder = js.native
  def appendOffset(pattern: String, noOffsetText: String): DateTimeFormatterBuilder = js.native
  def appendOffsetId(): DateTimeFormatterBuilder = js.native
  def appendPattern(pattern: String): DateTimeFormatterBuilder = js.native
  def appendValue(field: TemporalField): DateTimeFormatterBuilder = js.native
  def appendValue(field: TemporalField, width: Double): DateTimeFormatterBuilder = js.native
  def appendValue(field: TemporalField, width: Double, maxWidth: Double): DateTimeFormatterBuilder = js.native
  def appendValue(field: TemporalField, width: Double, maxWidth: Double, signStyle: SignStyle): DateTimeFormatterBuilder = js.native
  def appendValueReduced(field: TemporalField, width: Double, maxWidth: Double, base: Double): DateTimeFormatterBuilder = js.native
  def appendValueReduced(field: TemporalField, width: Double, maxWidth: Double, base: ChronoLocalDate): DateTimeFormatterBuilder = js.native
  def appendZoneId(): DateTimeFormatterBuilder = js.native
  def optionalEnd(): DateTimeFormatterBuilder = js.native
  def optionalStart(): DateTimeFormatterBuilder = js.native
  def padNext(): DateTimeFormatterBuilder = js.native
  def parseCaseInsensitive(): DateTimeFormatterBuilder = js.native
  def parseCaseSensitive(): DateTimeFormatterBuilder = js.native
  def parseLenient(): DateTimeFormatterBuilder = js.native
  def parseStrict(): DateTimeFormatterBuilder = js.native
  def toFormatter(resolverStyle: ResolverStyle): DateTimeFormatter = js.native
}

