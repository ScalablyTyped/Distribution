package typings.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/tasks.TaskOptions> */
@js.native
trait PartialTaskOptions extends js.Object {
  
  var msg: js.UndefOr[String] = js.native
  
  var tickInterval: js.UndefOr[Double] = js.native
}
object PartialTaskOptions {
  
  @scala.inline
  def apply(): PartialTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTaskOptions]
  }
  
  @scala.inline
  implicit class PartialTaskOptionsOps[Self <: PartialTaskOptions] (val x: Self) extends AnyVal {
    
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
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setTickInterval(value: Double): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
  }
}
