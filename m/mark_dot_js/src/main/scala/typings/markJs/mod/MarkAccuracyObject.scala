package typings.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkAccuracyObject extends js.Object {
  
  var limiters: js.UndefOr[js.Array[String]] = js.native
  
  var value: MarkAccuracy = js.native
}
object MarkAccuracyObject {
  
  @scala.inline
  def apply(value: MarkAccuracy): MarkAccuracyObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAccuracyObject]
  }
  
  @scala.inline
  implicit class MarkAccuracyObjectOps[Self <: MarkAccuracyObject] (val x: Self) extends AnyVal {
    
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
    def setValue(value: MarkAccuracy): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitersVarargs(value: String*): Self = this.set("limiters", js.Array(value :_*))
    
    @scala.inline
    def setLimiters(value: js.Array[String]): Self = this.set("limiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimiters: Self = this.set("limiters", js.undefined)
  }
}
