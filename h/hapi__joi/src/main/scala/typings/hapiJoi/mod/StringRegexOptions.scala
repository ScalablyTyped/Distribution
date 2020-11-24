package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringRegexOptions extends js.Object {
  
  /**
    * when true, the provided pattern will be disallowed instead of required.
    *
    * @default false
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * optional pattern name.
    */
  var name: js.UndefOr[String] = js.native
}
object StringRegexOptions {
  
  @scala.inline
  def apply(): StringRegexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringRegexOptions]
  }
  
  @scala.inline
  implicit class StringRegexOptionsOps[Self <: StringRegexOptions] (val x: Self) extends AnyVal {
    
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
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
