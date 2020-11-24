package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantifyType extends js.Object {
  
  var few: js.UndefOr[String] = js.native
  
  var one: String = js.native
  
  var other: String = js.native
  
  var two: js.UndefOr[String] = js.native
}
object QuantifyType {
  
  @scala.inline
  def apply(one: String, other: String): QuantifyType = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantifyType]
  }
  
  @scala.inline
  implicit class QuantifyTypeOps[Self <: QuantifyType] (val x: Self) extends AnyVal {
    
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
    def setOne(value: String): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFew(value: String): Self = this.set("few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    
    @scala.inline
    def setTwo(value: String): Self = this.set("two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
  }
}
