package typings.luhnGenerator

import typings.luhnGenerator.mod.InputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("luhn-generator/dist/luhn", JSImport.Namespace)
@js.native
object luhnMod extends js.Object {
  
  def checksum(input: String): Double = js.native
  def checksum(input: Double): Double = js.native
  
  def generate(input: String): Double = js.native
  def generate(input: String, inputOptions: InputOptions): Double = js.native
  def generate(input: Double): Double = js.native
  def generate(input: Double, inputOptions: InputOptions): Double = js.native
  
  def random(input: String): Double = js.native
  def random(input: String, inputOptions: InputOptions): Double = js.native
  def random(input: Double): Double = js.native
  def random(input: Double, inputOptions: InputOptions): Double = js.native
  
  def validate(input: String): Boolean = js.native
  def validate(input: Double): Boolean = js.native
}
