package typings.htmlTruncate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateOptions extends js.Object {
  
  /**
    * Omission symbol for truncated string, '...' by default.
    */
  var ellipsis: Boolean | String = js.native
  
  /**
    * Flag to specify if keep image tag, false by default.
    */
  var keepImageTag: Boolean = js.native
}
object TruncateOptions {
  
  @scala.inline
  def apply(ellipsis: Boolean | String, keepImageTag: Boolean): TruncateOptions = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit class TruncateOptionsOps[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
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
    def setEllipsis(value: Boolean | String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepImageTag(value: Boolean): Self = this.set("keepImageTag", value.asInstanceOf[js.Any])
  }
}
