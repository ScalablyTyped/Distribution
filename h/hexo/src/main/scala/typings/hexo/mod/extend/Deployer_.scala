package typings.hexo.mod.extend

import typings.hexo.mod.extend.Deployer.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployer_ extends js.Object {
  
  def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit = js.native
}
object Deployer_ {
  
  @scala.inline
  def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Unit): Deployer_ = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Deployer_]
  }
  
  @scala.inline
  implicit class Deployer_Ops[Self <: Deployer_] (val x: Self) extends AnyVal {
    
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
    def setRegister(value: (String, js.Function1[/* args */ Config, Unit]) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
  }
}
