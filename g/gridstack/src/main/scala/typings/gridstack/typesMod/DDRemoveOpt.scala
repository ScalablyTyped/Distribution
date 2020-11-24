package typings.gridstack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDRemoveOpt extends js.Object {
  
  /** class that can be removed (default?: '.' + opts.itemClass) */
  var accept: js.UndefOr[String] = js.native
}
object DDRemoveOpt {
  
  @scala.inline
  def apply(): DDRemoveOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DDRemoveOpt]
  }
  
  @scala.inline
  implicit class DDRemoveOptOps[Self <: DDRemoveOpt] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
  }
}
