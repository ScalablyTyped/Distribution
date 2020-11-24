package typings.ipfsCore.rmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmOptions extends js.Object {
  
  /**
    * - Ignores nonexistent blocks
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * - Write minimal output
    */
  var quiet: js.UndefOr[Boolean] = js.native
}
object RmOptions {
  
  @scala.inline
  def apply(): RmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmOptions]
  }
  
  @scala.inline
  implicit class RmOptionsOps[Self <: RmOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
}
