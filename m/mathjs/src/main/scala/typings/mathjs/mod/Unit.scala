package typings.mathjs.mod

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
    equals: Unit => Boolean,
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
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), divide = js.Any.fromFunction1(divide), equalBase = js.Any.fromFunction1(equalBase), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), formatUnits = js.Any.fromFunction0(formatUnits), hasBase = js.Any.fromFunction1(hasBase), multiply = js.Any.fromFunction1(multiply), pow = js.Any.fromFunction1(pow), splitUnit = js.Any.fromFunction1(splitUnit), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), toNumber = js.Any.fromFunction1(toNumber), toNumeric = js.Any.fromFunction1(toNumeric), toSI = js.Any.fromFunction0(toSI))
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit class UnitOps[Self <: Unit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbs(value: Unit => Unit): Self = this.set("abs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDivide(value: Unit => Unit): Self = this.set("divide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEqualBase(value: Unit => Boolean): Self = this.set("equalBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Unit => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: FormatOptions => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUnits(value: () => String): Self = this.set("formatUnits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasBase(value: js.Any => Boolean): Self = this.set("hasBase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply(value: Unit => Unit): Self = this.set("multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPow(value: Unit => Unit): Self = this.set("pow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitUnit(value: js.Array[String | Unit] => js.Array[Unit]): Self = this.set("splitUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: String => Unit): Self = this.set("to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => MathJSON): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToNumber(value: String => Double): Self = this.set("toNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumeric(value: String => Double | Fraction | BigNumber): Self = this.set("toNumeric", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToSI(value: () => Unit): Self = this.set("toSI", js.Any.fromFunction0(value))
  }
}
