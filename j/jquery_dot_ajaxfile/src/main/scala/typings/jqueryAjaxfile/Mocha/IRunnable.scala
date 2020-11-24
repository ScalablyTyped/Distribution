package typings.jqueryAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Partial interface for Mocha's `Runnable` class. */
@js.native
trait IRunnable extends js.Object {
  
  var async: Boolean = js.native
  
  var fn: js.Function = js.native
  
  var sync: Boolean = js.native
  
  var timedOut: Boolean = js.native
  
  var title: String = js.native
}
object IRunnable {
  
  @scala.inline
  def apply(async: Boolean, fn: js.Function, sync: Boolean, timedOut: Boolean, title: String): IRunnable = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunnable]
  }
  
  @scala.inline
  implicit class IRunnableOps[Self <: IRunnable] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: js.Function): Self = this.set("fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOut(value: Boolean): Self = this.set("timedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
