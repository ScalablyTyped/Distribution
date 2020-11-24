package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if FlashElement.elementType == 'instance'
@js.native
trait FlashInstance extends js.Object {
  
  var instanceType: js.UndefOr[String] = js.native
  
  var libraryItem: js.UndefOr[FlashItem] = js.native
}
object FlashInstance {
  
  @scala.inline
  def apply(): FlashInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlashInstance]
  }
  
  @scala.inline
  implicit class FlashInstanceOps[Self <: FlashInstance] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    
    @scala.inline
    def setLibraryItem(value: FlashItem): Self = this.set("libraryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryItem: Self = this.set("libraryItem", js.undefined)
  }
}
