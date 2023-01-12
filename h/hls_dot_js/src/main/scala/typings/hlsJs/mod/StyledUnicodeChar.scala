package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unicode character with styling and background.
  * @constructor
  */
trait StyledUnicodeChar extends StObject {
  
  def copy(newChar: StyledUnicodeChar): Unit
  
  def equals(other: StyledUnicodeChar): Boolean
  
  def isEmpty(): Boolean
  
  var penState: PenState
  
  def reset(): Unit
  
  def setChar(uchar: String, newPenState: PenState): Unit
  
  def setPenState(newPenState: PenState): Unit
  
  var uchar: String
}
object StyledUnicodeChar {
  
  inline def apply(
    copy: StyledUnicodeChar => Unit,
    equals_ : StyledUnicodeChar => Boolean,
    isEmpty: () => Boolean,
    penState: PenState,
    reset: () => Unit,
    setChar: (String, PenState) => Unit,
    setPenState: PenState => Unit,
    uchar: String
  ): StyledUnicodeChar = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), isEmpty = js.Any.fromFunction0(isEmpty), penState = penState.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setChar = js.Any.fromFunction2(setChar), setPenState = js.Any.fromFunction1(setPenState), uchar = uchar.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[StyledUnicodeChar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyledUnicodeChar] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: StyledUnicodeChar => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: StyledUnicodeChar => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setPenState(value: PenState): Self = StObject.set(x, "penState", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetChar(value: (String, PenState) => Unit): Self = StObject.set(x, "setChar", js.Any.fromFunction2(value))
    
    inline def setSetPenState(value: PenState => Unit): Self = StObject.set(x, "setPenState", js.Any.fromFunction1(value))
    
    inline def setUchar(value: String): Self = StObject.set(x, "uchar", value.asInstanceOf[js.Any])
  }
}
