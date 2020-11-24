package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParser extends js.Object {
  
  def empty(): Unit = js.native
  
  def isNullOrUndefined(obj: js.Object): Unit = js.native
  
  def num(): Unit = js.native
  
  def toBool(obj: js.Object): Unit = js.native
  
  /**
    * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
    *
    * @param obj
    */
  def toDate(obj: js.Object): Unit = js.native
  
  def toNumber(obj: js.Object): Unit = js.native
  
  def toStr(obj: js.Object): Unit = js.native
  
  def toTime(obj: js.Object): Unit = js.native
}
object TypeParser {
  
  @scala.inline
  def apply(
    empty: () => Unit,
    isNullOrUndefined: js.Object => Unit,
    num: () => Unit,
    toBool: js.Object => Unit,
    toDate: js.Object => Unit,
    toNumber: js.Object => Unit,
    toStr: js.Object => Unit,
    toTime: js.Object => Unit
  ): TypeParser = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), num = js.Any.fromFunction0(num), toBool = js.Any.fromFunction1(toBool), toDate = js.Any.fromFunction1(toDate), toNumber = js.Any.fromFunction1(toNumber), toStr = js.Any.fromFunction1(toStr), toTime = js.Any.fromFunction1(toTime))
    __obj.asInstanceOf[TypeParser]
  }
  
  @scala.inline
  implicit class TypeParserOps[Self <: TypeParser] (val x: Self) extends AnyVal {
    
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
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNullOrUndefined(value: js.Object => Unit): Self = this.set("isNullOrUndefined", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNum(value: () => Unit): Self = this.set("num", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBool(value: js.Object => Unit): Self = this.set("toBool", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDate(value: js.Object => Unit): Self = this.set("toDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumber(value: js.Object => Unit): Self = this.set("toNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToStr(value: js.Object => Unit): Self = this.set("toStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToTime(value: js.Object => Unit): Self = this.set("toTime", js.Any.fromFunction1(value))
  }
}
