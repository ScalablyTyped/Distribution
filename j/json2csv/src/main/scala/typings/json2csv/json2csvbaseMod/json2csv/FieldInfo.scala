package typings.json2csv.json2csvbaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfo[T] extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: String | FieldValueCallback[T] = js.native
}
object FieldInfo {
  
  @scala.inline
  def apply[T](value: String | FieldValueCallback[T]): FieldInfo[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo[T]]
  }
  
  @scala.inline
  implicit class FieldInfoOps[Self <: FieldInfo[_], T] (val x: Self with FieldInfo[T]) extends AnyVal {
    
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
    def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => js.Any): Self = this.set("value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueFunction1(value: T => js.Any): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String | FieldValueCallback[T]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
