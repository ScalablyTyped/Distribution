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
    chronology: js.Function0[js.Any],
    decimalStyle: js.Function0[js.Any],
    format: js.Function1[TemporalAccessor, java.lang.String],
    locale: js.Function0[js.Any],
    parse: js.Function2[java.lang.String, TemporalQuery, TemporalAccessor],
    parse1: js.Function1[java.lang.String, TemporalAccessor],
    parse2: js.Function2[js.Any, js.Any, js.Any],
    parseUnresolved: js.Function2[js.Any, js.Any, js.Any],
    toString: js.Function0[java.lang.String],
    withChronology: js.Function1[js.Any, js.Any],
    withLocale: js.Function1[Locale, DateTimeFormatter],
    withResolverStyle: js.Function1[ResolverStyle, DateTimeFormatter]
  ): DateTimeFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chronology")(chronology)
    __obj.updateDynamic("decimalStyle")(decimalStyle)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("parse1")(parse1)
    __obj.updateDynamic("parse2")(parse2)
    __obj.updateDynamic("parseUnresolved")(parseUnresolved)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("withChronology")(withChronology)
    __obj.updateDynamic("withLocale")(withLocale)
    __obj.updateDynamic("withResolverStyle")(withResolverStyle)
    __obj.asInstanceOf[DateTimeFormatter]
  }
}

