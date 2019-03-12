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

object DateTimeFormatter {
  @scala.inline
  def apply(
    chronology: () => js.Any,
    decimalStyle: () => js.Any,
    format: TemporalAccessor => java.lang.String,
    locale: () => js.Any,
    parse: (java.lang.String, TemporalQuery) => TemporalAccessor,
    parse1: java.lang.String => TemporalAccessor,
    parse2: (js.Any, js.Any) => js.Any,
    parseUnresolved: (js.Any, js.Any) => js.Any,
    toString: () => java.lang.String,
    withChronology: js.Any => js.Any,
    withLocale: Locale => DateTimeFormatter,
    withResolverStyle: ResolverStyle => DateTimeFormatter
  ): DateTimeFormatter = {
    val __obj = js.Dynamic.literal(chronology = js.Any.fromFunction0(chronology), decimalStyle = js.Any.fromFunction0(decimalStyle), format = js.Any.fromFunction1(format), locale = js.Any.fromFunction0(locale), parse = js.Any.fromFunction2(parse), parse1 = js.Any.fromFunction1(parse1), parse2 = js.Any.fromFunction2(parse2), parseUnresolved = js.Any.fromFunction2(parseUnresolved), toString = js.Any.fromFunction0(toString), withChronology = js.Any.fromFunction1(withChronology), withLocale = js.Any.fromFunction1(withLocale), withResolverStyle = js.Any.fromFunction1(withResolverStyle))
  
    __obj.asInstanceOf[DateTimeFormatter]
  }
}

