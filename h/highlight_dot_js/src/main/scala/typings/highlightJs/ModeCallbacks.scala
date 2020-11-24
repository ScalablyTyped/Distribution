package typings.highlightJs

import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* modes */
@js.native
trait ModeCallbacks extends js.Object {
  
  @JSName("on:begin")
  var onColonbegin: js.UndefOr[ModeCallback] = js.native
  
  @JSName("on:end")
  var onColonend: js.UndefOr[js.Function] = js.native
}
object ModeCallbacks {
  
  @scala.inline
  def apply(): ModeCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeCallbacks]
  }
  
  @scala.inline
  implicit class ModeCallbacksOps[Self <: ModeCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnColonbegin(value: (/* match */ RegExpMatchArray, /* response */ CallbackResponse) => Unit): Self = this.set("on:begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColonbegin: Self = this.set("on:begin", js.undefined)
    
    @scala.inline
    def setOnColonend(value: js.Function): Self = this.set("on:end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnColonend: Self = this.set("on:end", js.undefined)
  }
}
