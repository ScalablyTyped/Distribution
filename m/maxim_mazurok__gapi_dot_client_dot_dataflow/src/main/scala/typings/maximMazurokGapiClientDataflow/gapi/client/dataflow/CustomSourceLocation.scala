package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSourceLocation extends js.Object {
  
  /** Whether this source is stateful. */
  var stateful: js.UndefOr[Boolean] = js.native
}
object CustomSourceLocation {
  
  @scala.inline
  def apply(): CustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSourceLocation]
  }
  
  @scala.inline
  implicit class CustomSourceLocationOps[Self <: CustomSourceLocation] (val x: Self) extends AnyVal {
    
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
    def setStateful(value: Boolean): Self = this.set("stateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateful: Self = this.set("stateful", js.undefined)
  }
}
