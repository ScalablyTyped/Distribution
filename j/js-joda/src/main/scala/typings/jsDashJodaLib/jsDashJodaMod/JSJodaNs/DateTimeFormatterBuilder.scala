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

