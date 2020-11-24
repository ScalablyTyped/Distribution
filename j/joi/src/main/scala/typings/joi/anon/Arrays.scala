package typings.joi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arrays extends js.Object {
  
  var arrays: js.UndefOr[Boolean] = js.native
  
  var objects: js.UndefOr[Boolean] = js.native
}
object Arrays {
  
  @scala.inline
  def apply(): Arrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrays]
  }
  
  @scala.inline
  implicit class ArraysOps[Self <: Arrays] (val x: Self) extends AnyVal {
    
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
    def setArrays(value: Boolean): Self = this.set("arrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrays: Self = this.set("arrays", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
  }
}
