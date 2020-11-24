package typings.json2csv.json2csvbaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedFieldInfo[T] extends js.Object {
  
  var label: String = js.native
  
  var value: FieldValueCallback[T] = js.native
}
object NormalizedFieldInfo {
  
  @scala.inline
  def apply[T](label: String, value: FieldValueCallback[T]): NormalizedFieldInfo[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedFieldInfo[T]]
  }
  
  @scala.inline
  implicit class NormalizedFieldInfoOps[Self <: NormalizedFieldInfo[_], T] (val x: Self with NormalizedFieldInfo[T]) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => js.Any): Self = this.set("value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueFunction1(value: T => js.Any): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: FieldValueCallback[T]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
