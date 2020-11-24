package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.walk().
  */
@js.native
trait IWalkOptions extends js.Object {
  
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.native
  
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.native
  
  var onPath: js.UndefOr[IWalkPathCallback] = js.native
}
object IWalkOptions {
  
  @scala.inline
  def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  
  @scala.inline
  implicit class IWalkOptionsOps[Self <: IWalkOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterChildWalk(value: /* context */ IWalkModel => Unit): Self = this.set("afterChildWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterChildWalk: Self = this.set("afterChildWalk", js.undefined)
    
    @scala.inline
    def setBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = this.set("beforeChildWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeChildWalk: Self = this.set("beforeChildWalk", js.undefined)
    
    @scala.inline
    def setOnPath(value: /* context */ IWalkPath => Unit): Self = this.set("onPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPath: Self = this.set("onPath", js.undefined)
  }
}
