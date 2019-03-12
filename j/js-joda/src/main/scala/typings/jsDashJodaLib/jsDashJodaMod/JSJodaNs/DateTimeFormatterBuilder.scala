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
    append: DateTimeFormatter => DateTimeFormatterBuilder,
    appendFraction: (TemporalField, scala.Double, scala.Double, scala.Boolean) => DateTimeFormatterBuilder,
    appendInstant: scala.Double => DateTimeFormatterBuilder,
    appendLiteral: js.Any => DateTimeFormatterBuilder,
    appendOffset: (java.lang.String, java.lang.String) => DateTimeFormatterBuilder,
    appendOffsetId: () => DateTimeFormatterBuilder,
    appendPattern: java.lang.String => DateTimeFormatterBuilder,
    appendValue: () => DateTimeFormatterBuilder,
    appendValueReduced: () => DateTimeFormatterBuilder,
    appendZoneId: () => DateTimeFormatterBuilder,
    optionalEnd: () => DateTimeFormatterBuilder,
    optionalStart: () => DateTimeFormatterBuilder,
    padNext: () => DateTimeFormatterBuilder,
    parseCaseInsensitive: () => DateTimeFormatterBuilder,
    parseCaseSensitive: () => DateTimeFormatterBuilder,
    parseLenient: () => DateTimeFormatterBuilder,
    parseStrict: () => DateTimeFormatterBuilder,
    toFormatter: ResolverStyle => DateTimeFormatter
  ): DateTimeFormatterBuilder = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendFraction = js.Any.fromFunction4(appendFraction), appendInstant = js.Any.fromFunction1(appendInstant), appendLiteral = js.Any.fromFunction1(appendLiteral), appendOffset = js.Any.fromFunction2(appendOffset), appendOffsetId = js.Any.fromFunction0(appendOffsetId), appendPattern = js.Any.fromFunction1(appendPattern), appendValue = js.Any.fromFunction0(appendValue), appendValueReduced = js.Any.fromFunction0(appendValueReduced), appendZoneId = js.Any.fromFunction0(appendZoneId), optionalEnd = js.Any.fromFunction0(optionalEnd), optionalStart = js.Any.fromFunction0(optionalStart), padNext = js.Any.fromFunction0(padNext), parseCaseInsensitive = js.Any.fromFunction0(parseCaseInsensitive), parseCaseSensitive = js.Any.fromFunction0(parseCaseSensitive), parseLenient = js.Any.fromFunction0(parseLenient), parseStrict = js.Any.fromFunction0(parseStrict), toFormatter = js.Any.fromFunction1(toFormatter))
  
    __obj.asInstanceOf[DateTimeFormatterBuilder]
  }
}

