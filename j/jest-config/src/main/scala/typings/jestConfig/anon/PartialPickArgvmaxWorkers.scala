package typings.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers' | 'runInBand' | 'watch' | 'watchAll'>> */
@js.native
trait PartialPickArgvmaxWorkers extends js.Object {
  
  var maxWorkers: js.UndefOr[js.Any] = js.native
  
  var runInBand: js.UndefOr[js.Any] = js.native
  
  var watch: js.UndefOr[js.Any] = js.native
  
  var watchAll: js.UndefOr[js.Any] = js.native
}
object PartialPickArgvmaxWorkers {
  
  @scala.inline
  def apply(): PartialPickArgvmaxWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickArgvmaxWorkers]
  }
  
  @scala.inline
  implicit class PartialPickArgvmaxWorkersOps[Self <: PartialPickArgvmaxWorkers] (val x: Self) extends AnyVal {
    
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
    def setMaxWorkers(value: js.Any): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    
    @scala.inline
    def setRunInBand(value: js.Any): Self = this.set("runInBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunInBand: Self = this.set("runInBand", js.undefined)
    
    @scala.inline
    def setWatch(value: js.Any): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWatchAll(value: js.Any): Self = this.set("watchAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchAll: Self = this.set("watchAll", js.undefined)
  }
}
