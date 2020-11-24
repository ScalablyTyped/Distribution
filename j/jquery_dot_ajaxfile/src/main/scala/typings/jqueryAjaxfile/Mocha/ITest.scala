package typings.jqueryAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Partial interface for Mocha's `Test` class. */
@js.native
trait ITest extends IRunnable {
  
  def fullTitle(): String = js.native
  
  var parent: ISuite = js.native
  
  var pending: Boolean = js.native
}
object ITest {
  
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    fullTitle: () => String,
    parent: ISuite,
    pending: Boolean,
    sync: Boolean,
    timedOut: Boolean,
    title: String
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITest]
  }
  
  @scala.inline
  implicit class ITestOps[Self <: ITest] (val x: Self) extends AnyVal {
    
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
    def setFullTitle(value: () => String): Self = this.set("fullTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: ISuite): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
  }
}
