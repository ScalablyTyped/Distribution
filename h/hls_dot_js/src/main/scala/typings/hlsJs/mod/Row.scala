package typings.hlsJs.mod

import typings.hlsJs.anon.PartialPenStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CEA-608 row consisting of NR_COLS instances of StyledUnicodeChar.
  * @constructor
  */
trait Row extends StObject {
  
  /**
    * Backspace, move one step back and clear character.
    */
  def backSpace(): Unit
  
  var chars: js.Array[StyledUnicodeChar]
  
  def clear(): Unit
  
  def clearFromPos(startPos: Double): Unit
  
  def clearToEndOfRow(): Unit
  
  def copy(other: Row): Unit
  
  var cueStartTime: js.UndefOr[Double] = js.undefined
  
  var currPenState: PenState
  
  def equals(other: Row): Boolean
  
  def getTextString(): String
  
  def insertChar(byte: Double): Unit
  
  def isEmpty(): Boolean
  
  var logger: CaptionsLogger
  
  /**
    * Move the cursor relative to current position.
    */
  def moveCursor(relPos: Double): Unit
  
  var pos: Double
  
  /**
    *  Set the cursor to a valid column.
    */
  def setCursor(absPos: Double): Unit
  
  def setPenStyles(styles: PartialPenStyles): Unit
}
object Row {
  
  inline def apply(
    backSpace: () => Unit,
    chars: js.Array[StyledUnicodeChar],
    clear: () => Unit,
    clearFromPos: Double => Unit,
    clearToEndOfRow: () => Unit,
    copy: Row => Unit,
    currPenState: PenState,
    equals_ : Row => Boolean,
    getTextString: () => String,
    insertChar: Double => Unit,
    isEmpty: () => Boolean,
    logger: CaptionsLogger,
    moveCursor: Double => Unit,
    pos: Double,
    setCursor: Double => Unit,
    setPenStyles: PartialPenStyles => Unit
  ): Row = {
    val __obj = js.Dynamic.literal(backSpace = js.Any.fromFunction0(backSpace), chars = chars.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), clearFromPos = js.Any.fromFunction1(clearFromPos), clearToEndOfRow = js.Any.fromFunction0(clearToEndOfRow), copy = js.Any.fromFunction1(copy), currPenState = currPenState.asInstanceOf[js.Any], getTextString = js.Any.fromFunction0(getTextString), insertChar = js.Any.fromFunction1(insertChar), isEmpty = js.Any.fromFunction0(isEmpty), logger = logger.asInstanceOf[js.Any], moveCursor = js.Any.fromFunction1(moveCursor), pos = pos.asInstanceOf[js.Any], setCursor = js.Any.fromFunction1(setCursor), setPenStyles = js.Any.fromFunction1(setPenStyles))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    inline def setBackSpace(value: () => Unit): Self = StObject.set(x, "backSpace", js.Any.fromFunction0(value))
    
    inline def setChars(value: js.Array[StyledUnicodeChar]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setCharsVarargs(value: StyledUnicodeChar*): Self = StObject.set(x, "chars", js.Array(value*))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearFromPos(value: Double => Unit): Self = StObject.set(x, "clearFromPos", js.Any.fromFunction1(value))
    
    inline def setClearToEndOfRow(value: () => Unit): Self = StObject.set(x, "clearToEndOfRow", js.Any.fromFunction0(value))
    
    inline def setCopy(value: Row => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCueStartTime(value: Double): Self = StObject.set(x, "cueStartTime", value.asInstanceOf[js.Any])
    
    inline def setCueStartTimeUndefined: Self = StObject.set(x, "cueStartTime", js.undefined)
    
    inline def setCurrPenState(value: PenState): Self = StObject.set(x, "currPenState", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: Row => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetTextString(value: () => String): Self = StObject.set(x, "getTextString", js.Any.fromFunction0(value))
    
    inline def setInsertChar(value: Double => Unit): Self = StObject.set(x, "insertChar", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setLogger(value: CaptionsLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMoveCursor(value: Double => Unit): Self = StObject.set(x, "moveCursor", js.Any.fromFunction1(value))
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setSetCursor(value: Double => Unit): Self = StObject.set(x, "setCursor", js.Any.fromFunction1(value))
    
    inline def setSetPenStyles(value: PartialPenStyles => Unit): Self = StObject.set(x, "setPenStyles", js.Any.fromFunction1(value))
  }
}
