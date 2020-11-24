package typings.gulpStylint.anon

import typings.gulpStylint.gulpStylintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailOnWarning extends js.Object {
  
  var failOnWarning: `true` = js.native
}
object FailOnWarning {
  
  @scala.inline
  def apply(failOnWarning: `true`): FailOnWarning = {
    val __obj = js.Dynamic.literal(failOnWarning = failOnWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailOnWarning]
  }
  
  @scala.inline
  implicit class FailOnWarningOps[Self <: FailOnWarning] (val x: Self) extends AnyVal {
    
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
    def setFailOnWarning(value: `true`): Self = this.set("failOnWarning", value.asInstanceOf[js.Any])
  }
}
