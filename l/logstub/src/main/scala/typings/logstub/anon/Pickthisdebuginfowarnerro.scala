package typings.logstub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<this, 'debug' | 'info' | 'warn' | 'error' | 'child' | 'level'> */
@js.native
trait Pickthisdebuginfowarnerro extends js.Object {
  
  var child: js.UndefOr[js.Any] = js.native
  
  var debug: js.UndefOr[js.Any] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var info: js.UndefOr[js.Any] = js.native
  
  var level: js.UndefOr[js.Any] = js.native
  
  var warn: js.UndefOr[js.Any] = js.native
}
object Pickthisdebuginfowarnerro {
  
  @scala.inline
  def apply(): Pickthisdebuginfowarnerro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pickthisdebuginfowarnerro]
  }
  
  @scala.inline
  implicit class PickthisdebuginfowarnerroOps[Self <: Pickthisdebuginfowarnerro] (val x: Self) extends AnyVal {
    
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
    def setChild(value: js.Any): Self = this.set("child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    
    @scala.inline
    def setDebug(value: js.Any): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLevel(value: js.Any): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setWarn(value: js.Any): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
