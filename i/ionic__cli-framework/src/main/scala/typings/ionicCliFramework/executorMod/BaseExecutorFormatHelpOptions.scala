package typings.ionicCliFramework.executorMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.json
import typings.ionicCliFramework.ionicCliFrameworkStrings.terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseExecutorFormatHelpOptions extends js.Object {
  
  var format: js.UndefOr[terminal | json] = js.native
}
object BaseExecutorFormatHelpOptions {
  
  @scala.inline
  def apply(): BaseExecutorFormatHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseExecutorFormatHelpOptions]
  }
  
  @scala.inline
  implicit class BaseExecutorFormatHelpOptionsOps[Self <: BaseExecutorFormatHelpOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: terminal | json): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
