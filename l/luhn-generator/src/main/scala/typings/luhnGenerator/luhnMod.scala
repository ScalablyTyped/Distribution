package typings.luhnGenerator

import typings.luhnGenerator.mod.InputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luhnMod {
  
  @JSImport("luhn-generator/dist/luhn", "checksum")
  @js.native
  def checksum(input: String): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "checksum")
  @js.native
  def checksum(input: Double): Double = js.native
  
  @JSImport("luhn-generator/dist/luhn", "generate")
  @js.native
  def generate(input: String): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "generate")
  @js.native
  def generate(input: String, inputOptions: InputOptions): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "generate")
  @js.native
  def generate(input: Double): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "generate")
  @js.native
  def generate(input: Double, inputOptions: InputOptions): Double = js.native
  
  @JSImport("luhn-generator/dist/luhn", "random")
  @js.native
  def random(input: String): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "random")
  @js.native
  def random(input: String, inputOptions: InputOptions): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "random")
  @js.native
  def random(input: Double): Double = js.native
  @JSImport("luhn-generator/dist/luhn", "random")
  @js.native
  def random(input: Double, inputOptions: InputOptions): Double = js.native
  
  @JSImport("luhn-generator/dist/luhn", "validate")
  @js.native
  def validate(input: String): Boolean = js.native
  @JSImport("luhn-generator/dist/luhn", "validate")
  @js.native
  def validate(input: Double): Boolean = js.native
}
