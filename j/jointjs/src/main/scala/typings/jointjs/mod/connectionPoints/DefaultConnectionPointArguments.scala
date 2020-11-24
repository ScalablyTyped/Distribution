package typings.jointjs.mod.connectionPoints

import typings.jointjs.mod.dia.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultConnectionPointArguments extends js.Object {
  
  var offset: js.UndefOr[Double | Point] = js.native
}
object DefaultConnectionPointArguments {
  
  @scala.inline
  def apply(): DefaultConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultConnectionPointArguments]
  }
  
  @scala.inline
  implicit class DefaultConnectionPointArgumentsOps[Self <: DefaultConnectionPointArguments] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double | Point): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
