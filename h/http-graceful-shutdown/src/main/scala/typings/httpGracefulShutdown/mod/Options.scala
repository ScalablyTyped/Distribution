package typings.httpGracefulShutdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var development: js.UndefOr[Boolean] = js.native
  
  var `finally`: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShutdown: js.UndefOr[js.Function1[/* signal */ String, js.Promise[Unit]]] = js.native
  
  var signals: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDevelopment(value: Boolean): Self = this.set("development", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopment: Self = this.set("development", js.undefined)
    
    @scala.inline
    def setFinally(value: () => Unit): Self = this.set("finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFinally: Self = this.set("finally", js.undefined)
    
    @scala.inline
    def setOnShutdown(value: /* signal */ String => js.Promise[Unit]): Self = this.set("onShutdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShutdown: Self = this.set("onShutdown", js.undefined)
    
    @scala.inline
    def setSignals(value: String): Self = this.set("signals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
