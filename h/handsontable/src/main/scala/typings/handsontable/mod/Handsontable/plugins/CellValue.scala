package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellValue extends BaseCell {
  
  def addPrecedent(cellReference: CellReference): Unit = js.native
  
  def clearPrecedents(): Unit = js.native
  
  var error: String | Unit = js.native
  
  def getError(): String | Unit = js.native
  
  def getPrecedents(): js.Array[_] = js.native
  
  def getValue(): js.Any = js.native
  
  def hasError(): Boolean = js.native
  
  def hasPrecedent(cellReference: CellReference): Boolean = js.native
  
  def hasPrecedents(): Boolean = js.native
  
  def isState(state: Double): Boolean = js.native
  
  var precedents: js.Array[_] = js.native
  
  def removePrecedent(cellReference: CellReference): Unit = js.native
  
  def setError(error: String): Unit = js.native
  
  def setState(state: Double): Unit = js.native
  
  def setValue(value: js.Any): Unit = js.native
  
  var state: String = js.native
  
  var value: js.Any = js.native
}
object CellValue {
  
  @scala.inline
  def apply(
    addPrecedent: CellReference => Unit,
    clearPrecedents: () => Unit,
    columnAbsolute: Boolean,
    columnOffset: Double,
    error: String | Unit,
    getError: () => String | Unit,
    getPrecedents: () => js.Array[_],
    getValue: () => js.Any,
    hasError: () => Boolean,
    hasPrecedent: CellReference => Boolean,
    hasPrecedents: () => Boolean,
    isEqual: BaseCell => Boolean,
    isState: Double => Boolean,
    precedents: js.Array[_],
    removePrecedent: CellReference => Unit,
    rowAbsolute: Boolean,
    rowOffset: Double,
    setError: String => Unit,
    setState: Double => Unit,
    setValue: js.Any => Unit,
    state: String,
    translateTo: (Double, Double) => Unit,
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(addPrecedent = js.Any.fromFunction1(addPrecedent), clearPrecedents = js.Any.fromFunction0(clearPrecedents), columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], getError = js.Any.fromFunction0(getError), getPrecedents = js.Any.fromFunction0(getPrecedents), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), hasPrecedent = js.Any.fromFunction1(hasPrecedent), hasPrecedents = js.Any.fromFunction0(hasPrecedents), isEqual = js.Any.fromFunction1(isEqual), isState = js.Any.fromFunction1(isState), precedents = precedents.asInstanceOf[js.Any], removePrecedent = js.Any.fromFunction1(removePrecedent), rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], setError = js.Any.fromFunction1(setError), setState = js.Any.fromFunction1(setState), setValue = js.Any.fromFunction1(setValue), state = state.asInstanceOf[js.Any], translateTo = js.Any.fromFunction2(translateTo), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellValue]
  }
  
  @scala.inline
  implicit class CellValueMutableBuilder[Self <: CellValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPrecedent(value: CellReference => Unit): Self = StObject.set(x, "addPrecedent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearPrecedents(value: () => Unit): Self = StObject.set(x, "clearPrecedents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: String | Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetError(value: () => String | Unit): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrecedents(value: () => js.Array[_]): Self = StObject.set(x, "getPrecedents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPrecedent(value: CellReference => Boolean): Self = StObject.set(x, "hasPrecedent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPrecedents(value: () => Boolean): Self = StObject.set(x, "hasPrecedents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsState(value: Double => Boolean): Self = StObject.set(x, "isState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrecedents(value: js.Array[_]): Self = StObject.set(x, "precedents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedentsVarargs(value: js.Any*): Self = StObject.set(x, "precedents", js.Array(value :_*))
    
    @scala.inline
    def setRemovePrecedent(value: CellReference => Unit): Self = StObject.set(x, "removePrecedent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetError(value: String => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetState(value: Double => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
