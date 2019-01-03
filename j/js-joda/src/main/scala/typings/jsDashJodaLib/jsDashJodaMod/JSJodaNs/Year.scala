package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Year extends TemporalAccessor {
  def atMonth(monthOrNumber: Month): YearMonth = js.native
  def atMonth(monthOrNumber: scala.Double): YearMonth = js.native
  def minus(amountOrNumber: TemporalAmount): Year = js.native
  def minus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def minus(amountOrNumber: scala.Double): Year = js.native
  def minus(amountOrNumber: scala.Double, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: TemporalAmount): Year = js.native
  def plus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: scala.Double): Year = js.native
  def plus(amountOrNumber: scala.Double, unit: TemporalUnit): Year = js.native
  def value(): scala.Double = js.native
}

