package typings.jsqubits.mod.jsqubits

import typings.jsqubits.anon.DecimalPlaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complex extends js.Object {
  
  def add(other: Double): Complex = js.native
  def add(other: Complex): Complex = js.native
  
  def closeTo(other: Complex): Double = js.native
  
  def conjugate(): Complex = js.native
  
  def eql(other: Double): Boolean = js.native
  def eql(other: Complex): Boolean = js.native
  
  def format(): String = js.native
  def format(options: DecimalPlaces): String = js.native
  
  var imaginary: Double = js.native
  
  def inspect(): String = js.native
  
  def magnitude(): Double = js.native
  
  def multiply(other: Double): Complex = js.native
  def multiply(other: Complex): Complex = js.native
  
  def negate(): Complex = js.native
  
  def phase(): Double = js.native
  
  var real: Double = js.native
  
  def subtract(other: Double): Complex = js.native
  def subtract(other: Complex): Complex = js.native
}
