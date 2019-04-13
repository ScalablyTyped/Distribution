package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DateTimeFormatterBuilder")
@js.native
class DateTimeFormatterBuilder () extends js.Object {
  def append(formatter: DateTimeFormatter): DateTimeFormatterBuilder = js.native
  def appendFraction(field: TemporalField, minWidth: scala.Double, maxWidth: scala.Double, decimalPoint: scala.Boolean): DateTimeFormatterBuilder = js.native
  def appendInstant(fractionalDigits: scala.Double): DateTimeFormatterBuilder = js.native
  def appendLiteral(literal: js.Any): DateTimeFormatterBuilder = js.native
  def appendOffset(pattern: java.lang.String, noOffsetText: java.lang.String): DateTimeFormatterBuilder = js.native
  def appendOffsetId(): DateTimeFormatterBuilder = js.native
  def appendPattern(pattern: java.lang.String): DateTimeFormatterBuilder = js.native
  def appendValue(): DateTimeFormatterBuilder = js.native
  def appendValueReduced(): DateTimeFormatterBuilder = js.native
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

