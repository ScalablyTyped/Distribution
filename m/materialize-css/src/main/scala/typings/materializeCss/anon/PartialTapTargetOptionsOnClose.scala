package typings.materializeCss.anon

import typings.materializeCss.M.TapTarget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
@js.native
trait PartialTapTargetOptionsOnClose extends js.Object {
  
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.native
}
object PartialTapTargetOptionsOnClose {
  
  @scala.inline
  def apply(): PartialTapTargetOptionsOnClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTapTargetOptionsOnClose]
  }
  
  @scala.inline
  implicit class PartialTapTargetOptionsOnCloseOps[Self <: PartialTapTargetOptionsOnClose] (val x: Self) extends AnyVal {
    
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
    def setOnClose(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
  }
}
