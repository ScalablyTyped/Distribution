package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unit
  extends StObject
     with _MathType {
  
  def abs(unit: Unit): Unit = js.native
  
  var dimensions: js.Array[Double] = js.native
  
  def divide(unit: Unit): Unit = js.native
  
  def equalBase(unit: Unit): Boolean = js.native
  
  def equals(unit: Unit): Boolean = js.native
  
  var fixPrefix: Boolean = js.native
  
  def format(options: FormatOptions): String = js.native
  
  def formatUnits(): String = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def hasBase(base: Any): Boolean = js.native
  
  def multiply(unit: Unit): Unit = js.native
  
  def pow(unit: Unit): Unit = js.native
  
  def simplify(): Unit = js.native
  
  var skipAutomaticSimplification: `true` = js.native
  
  def splitUnit(parts: js.Array[String | Unit]): js.Array[Unit] = js.native
  
  def to(unit: String): Unit = js.native
  
  def toJSON(): MathJSON = js.native
  
  def toNumber(): Double = js.native
  def toNumber(unit: String): Double = js.native
  
  def toNumeric(): Double | Fraction | BigNumber = js.native
  def toNumeric(unit: String): Double | Fraction | BigNumber = js.native
  
  def toSI(): Unit = js.native
  
  var units: js.Array[UnitComponent] = js.native
  
  var value: Double = js.native
}
