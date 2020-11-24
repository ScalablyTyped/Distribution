package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.findLoops.
  */
@js.native
trait IFindLoopsOptions extends IPointMatchOptions {
  
  /**
    * Flag to remove looped paths from the original model.
    */
  var removeFromOriginal: js.UndefOr[Boolean] = js.native
}
object IFindLoopsOptions {
  
  @scala.inline
  def apply(): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindLoopsOptions]
  }
  
  @scala.inline
  implicit class IFindLoopsOptionsOps[Self <: IFindLoopsOptions] (val x: Self) extends AnyVal {
    
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
    def setRemoveFromOriginal(value: Boolean): Self = this.set("removeFromOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFromOriginal: Self = this.set("removeFromOriginal", js.undefined)
  }
}
