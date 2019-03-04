package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormatterBuilder extends js.Object {
  def append(formatter: DateTimeFormatter): DateTimeFormatterBuilder
  def appendFraction(field: TemporalField, minWidth: scala.Double, maxWidth: scala.Double, decimalPoint: scala.Boolean): DateTimeFormatterBuilder
  def appendInstant(fractionalDigits: scala.Double): DateTimeFormatterBuilder
  def appendLiteral(literal: js.Any): DateTimeFormatterBuilder
  def appendOffset(pattern: java.lang.String, noOffsetText: java.lang.String): DateTimeFormatterBuilder
  def appendOffsetId(): DateTimeFormatterBuilder
  def appendPattern(pattern: java.lang.String): DateTimeFormatterBuilder
  def appendValue(): DateTimeFormatterBuilder
  def appendValueReduced(): DateTimeFormatterBuilder
  def appendZoneId(): DateTimeFormatterBuilder
  def optionalEnd(): DateTimeFormatterBuilder
  def optionalStart(): DateTimeFormatterBuilder
  def padNext(): DateTimeFormatterBuilder
  def parseCaseInsensitive(): DateTimeFormatterBuilder
  def parseCaseSensitive(): DateTimeFormatterBuilder
  def parseLenient(): DateTimeFormatterBuilder
  def parseStrict(): DateTimeFormatterBuilder
  def toFormatter(resolverStyle: ResolverStyle): DateTimeFormatter
}

object DateTimeFormatterBuilder {
  @scala.inline
  def apply(
    append: js.Function1[DateTimeFormatter, DateTimeFormatterBuilder],
    appendFraction: js.Function4[TemporalField, scala.Double, scala.Double, scala.Boolean, DateTimeFormatterBuilder],
    appendInstant: js.Function1[scala.Double, DateTimeFormatterBuilder],
    appendLiteral: js.Function1[js.Any, DateTimeFormatterBuilder],
    appendOffset: js.Function2[java.lang.String, java.lang.String, DateTimeFormatterBuilder],
    appendOffsetId: js.Function0[DateTimeFormatterBuilder],
    appendPattern: js.Function1[java.lang.String, DateTimeFormatterBuilder],
    appendValue: js.Function0[DateTimeFormatterBuilder],
    appendValueReduced: js.Function0[DateTimeFormatterBuilder],
    appendZoneId: js.Function0[DateTimeFormatterBuilder],
    optionalEnd: js.Function0[DateTimeFormatterBuilder],
    optionalStart: js.Function0[DateTimeFormatterBuilder],
    padNext: js.Function0[DateTimeFormatterBuilder],
    parseCaseInsensitive: js.Function0[DateTimeFormatterBuilder],
    parseCaseSensitive: js.Function0[DateTimeFormatterBuilder],
    parseLenient: js.Function0[DateTimeFormatterBuilder],
    parseStrict: js.Function0[DateTimeFormatterBuilder],
    toFormatter: js.Function1[ResolverStyle, DateTimeFormatter]
  ): DateTimeFormatterBuilder = {
    val __obj = js.Dynamic.literal(append = append, appendFraction = appendFraction, appendInstant = appendInstant, appendLiteral = appendLiteral, appendOffset = appendOffset, appendOffsetId = appendOffsetId, appendPattern = appendPattern, appendValue = appendValue, appendValueReduced = appendValueReduced, appendZoneId = appendZoneId, optionalEnd = optionalEnd, optionalStart = optionalStart, padNext = padNext, parseCaseInsensitive = parseCaseInsensitive, parseCaseSensitive = parseCaseSensitive, parseLenient = parseLenient, parseStrict = parseStrict, toFormatter = toFormatter)
  
    __obj.asInstanceOf[DateTimeFormatterBuilder]
  }
}

