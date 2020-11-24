package typings.handsontable.mod.Handsontable.RecordTranslation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexMap extends js.Object {
  
  def clear(): Unit = js.native
  
  def getLength(): Double = js.native
  
  def getValueAtIndex(index: Double): js.Any = js.native
  
  def getValues(): js.Array[_] = js.native
  
  def setValueAtIndex(index: Double, value: js.Any): Boolean = js.native
  
  def setValues(values: js.Array[_]): Unit = js.native
}
object IndexMap {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    getLength: () => Double,
    getValueAtIndex: Double => js.Any,
    getValues: () => js.Array[_],
    setValueAtIndex: (Double, js.Any) => Boolean,
    setValues: js.Array[_] => Unit
  ): IndexMap = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getLength = js.Any.fromFunction0(getLength), getValueAtIndex = js.Any.fromFunction1(getValueAtIndex), getValues = js.Any.fromFunction0(getValues), setValueAtIndex = js.Any.fromFunction2(setValueAtIndex), setValues = js.Any.fromFunction1(setValues))
    __obj.asInstanceOf[IndexMap]
  }
  
  @scala.inline
  implicit class IndexMapOps[Self <: IndexMap] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueAtIndex(value: Double => js.Any): Self = this.set("getValueAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValues(value: () => js.Array[_]): Self = this.set("getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueAtIndex(value: (Double, js.Any) => Boolean): Self = this.set("setValueAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValues(value: js.Array[_] => Unit): Self = this.set("setValues", js.Any.fromFunction1(value))
  }
}
