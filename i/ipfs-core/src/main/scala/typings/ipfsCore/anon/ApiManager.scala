package typings.ipfsCore.anon

import typings.ipfsCore.apiManagerMod.^
import typings.ipfsCore.initMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiManager extends js.Object {
  
  var apiManager: ^ = js.native
  
  var options: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, Boolean] = js.native
  
  def print(args: js.Any*): Unit = js.native
}
object ApiManager {
  
  @scala.inline
  def apply(
    apiManager: ^,
    options: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, Boolean],
    print: /* repeated */ js.Any => Unit
  ): ApiManager = {
    val __obj = js.Dynamic.literal(apiManager = apiManager.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], print = js.Any.fromFunction1(print))
    __obj.asInstanceOf[ApiManager]
  }
  
  @scala.inline
  implicit class ApiManagerOps[Self <: ApiManager] (val x: Self) extends AnyVal {
    
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
    def setApiManager(value: ^): Self = this.set("apiManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[Boolean | typings.ipfsCore.initMod.InitOptions, Boolean]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: /* repeated */ js.Any => Unit): Self = this.set("print", js.Any.fromFunction1(value))
  }
}
