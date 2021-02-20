package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unit extends _MathType {
  
  def abs(unit: Unit): Unit = js.native
  
  def divide(unit: Unit): Unit = js.native
  
  def equalBase(unit: Unit): Boolean = js.native
  
  def equals(unit: Unit): Boolean = js.native
  
  def format(options: FormatOptions): String = js.native
  
  def formatUnits(): String = js.native
  
  def hasBase(base: js.Any): Boolean = js.native
  
  def multiply(unit: Unit): Unit = js.native
  
  def pow(unit: Unit): Unit = js.native
  
  def splitUnit(parts: js.Array[String | Unit]): js.Array[Unit] = js.native
  
  def to(unit: String): Unit = js.native
  
  def toJSON(): MathJSON = js.native
  
  def toNumber(unit: String): Double = js.native
  
  def toNumeric(unit: String): Double | Fraction | BigNumber = js.native
  
  def toSI(): Unit = js.native
}
object Unit {
  
  @scala.inline
  def apply(
    abs: Unit => Unit,
    divide: Unit => Unit,
    equalBase: Unit => Boolean,
    equals_ : Unit => Boolean,
    format: FormatOptions => String,
    formatUnits: () => String,
    hasBase: js.Any => Boolean,
    multiply: Unit => Unit,
    pow: Unit => Unit,
    splitUnit: js.Array[String | Unit] => js.Array[Unit],
    to: String => Unit,
    toJSON: () => MathJSON,
    toNumber: String => Double,
    toNumeric: String => Double | Fraction | BigNumber,
    toSI: () => Unit
  ): Unit = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), divide = js.Any.fromFunction1(divide), equalBase = js.Any.fromFunction1(equalBase), format = js.Any.fromFunction1(format), formatUnits = js.Any.fromFunction0(formatUnits), hasBase = js.Any.fromFunction1(hasBase), multiply = js.Any.fromFunction1(multiply), pow = js.Any.fromFunction1(pow), splitUnit = js.Any.fromFunction1(splitUnit), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), toNumber = js.Any.fromFunction1(toNumber), toNumeric = js.Any.fromFunction1(toNumeric), toSI = js.Any.fromFunction0(toSI))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbs(value: Unit => Unit): Self = StObject.set(x, "abs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDivide(value: Unit => Unit): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEqualBase(value: Unit => Boolean): Self = StObject.set(x, "equalBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: Unit => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: FormatOptions => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUnits(value: () => String): Self = StObject.set(x, "formatUnits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasBase(value: js.Any => Boolean): Self = StObject.set(x, "hasBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply(value: Unit => Unit): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPow(value: Unit => Unit): Self = StObject.set(x, "pow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitUnit(value: js.Array[String | Unit] => js.Array[Unit]): Self = StObject.set(x, "splitUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: String => Unit): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => MathJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToNumber(value: String => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumeric(value: String => Double | Fraction | BigNumber): Self = StObject.set(x, "toNumeric", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToSI(value: () => Unit): Self = StObject.set(x, "toSI", js.Any.fromFunction0(value))
  }
}
