package typings.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarkOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.native
  
  var element: js.UndefOr[String] = js.native
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var iframes: js.UndefOr[Boolean] = js.native
  
  var iframesTimeout: js.UndefOr[Double] = js.native
  
  var log: js.UndefOr[js.Object] = js.native
}
object UnmarkOptions {
  
  @scala.inline
  def apply(): UnmarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarkOptions]
  }
  
  @scala.inline
  implicit class UnmarkOptionsOps[Self <: UnmarkOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDone(value: /* marksTotal */ Double => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIframes(value: Boolean): Self = this.set("iframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframes: Self = this.set("iframes", js.undefined)
    
    @scala.inline
    def setIframesTimeout(value: Double): Self = this.set("iframesTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframesTimeout: Self = this.set("iframesTimeout", js.undefined)
    
    @scala.inline
    def setLog(value: js.Object): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
  }
}
