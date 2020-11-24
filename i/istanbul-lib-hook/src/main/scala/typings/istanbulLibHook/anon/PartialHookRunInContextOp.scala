package typings.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRunInContextOptions> */
@js.native
trait PartialHookRunInContextOp extends js.Object {
  
  var coverageVariable: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialHookRunInContextOp {
  
  @scala.inline
  def apply(): PartialHookRunInContextOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookRunInContextOp]
  }
  
  @scala.inline
  implicit class PartialHookRunInContextOpOps[Self <: PartialHookRunInContextOp] (val x: Self) extends AnyVal {
    
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
    def setCoverageVariable(value: String): Self = this.set("coverageVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageVariable: Self = this.set("coverageVariable", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
