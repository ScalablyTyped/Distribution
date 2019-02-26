package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormatter extends js.Object {
  def chronology(): js.Any
  def decimalStyle(): js.Any
  def format(temporal: TemporalAccessor): java.lang.String
  def locale(): js.Any
  def parse(text: java.lang.String, `type`: TemporalQuery): TemporalAccessor
  def parse1(text: java.lang.String): TemporalAccessor
  def parse2(text: js.Any, `type`: js.Any): js.Any
  def parseUnresolved(text: js.Any, position: js.Any): js.Any
  def withChronology(chrono: js.Any): js.Any
  def withLocale(locale: Locale): DateTimeFormatter
  def withResolverStyle(resolverStyle: ResolverStyle): DateTimeFormatter
}

