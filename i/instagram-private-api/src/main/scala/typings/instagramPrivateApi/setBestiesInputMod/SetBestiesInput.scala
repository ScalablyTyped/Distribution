package typings.instagramPrivateApi.setBestiesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBestiesInput extends js.Object {
  
  var add: js.UndefOr[js.Array[String | Double]] = js.native
  
  var remove: js.UndefOr[js.Array[String | Double]] = js.native
}
object SetBestiesInput {
  
  @scala.inline
  def apply(): SetBestiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBestiesInput]
  }
  
  @scala.inline
  implicit class SetBestiesInputOps[Self <: SetBestiesInput] (val x: Self) extends AnyVal {
    
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
    def setAddVarargs(value: (String | Double)*): Self = this.set("add", js.Array(value :_*))
    
    @scala.inline
    def setAdd(value: js.Array[String | Double]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: (String | Double)*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[String | Double]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}
