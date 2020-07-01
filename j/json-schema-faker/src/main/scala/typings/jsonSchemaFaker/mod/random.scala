package typings.jsonSchemaFaker.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// jsf.random
@JSImport("json-schema-faker", "random")
@js.native
object random extends js.Object {
  def date(step: String): Date = js.native
  def number(): Double = js.native
  def number(min: Double): Double = js.native
  def number(min: Double, max: Double): Double = js.native
  def number(min: Double, max: Double, defMin: Double): Double = js.native
  def number(min: Double, max: Double, defMin: Double, defMax: Double): Double = js.native
  def number(min: Double, max: Double, defMin: Double, defMax: Double, hasPrecision: Boolean): Double = js.native
  def pick[T](collection: js.Array[T]): T = js.native
  def randexp(value: String): String | Double = js.native
  def shuffle[T](collection: js.Array[T]): js.Array[T] = js.native
}

