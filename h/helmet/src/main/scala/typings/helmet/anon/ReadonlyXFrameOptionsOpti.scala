package typings.helmet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-frame-options.XFrameOptionsOptions> */
@js.native
trait ReadonlyXFrameOptionsOpti extends js.Object {
  
  val action: js.UndefOr[String] = js.native
}
object ReadonlyXFrameOptionsOpti {
  
  @scala.inline
  def apply(): ReadonlyXFrameOptionsOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyXFrameOptionsOpti]
  }
  
  @scala.inline
  implicit class ReadonlyXFrameOptionsOptiOps[Self <: ReadonlyXFrameOptionsOpti] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
}
