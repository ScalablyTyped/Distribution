package typings.gulpCopy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GulpCopyOptions extends js.Object {
  
  /**
    * Specifies the number of parts of the path to be ignored as path prefixes.
    */
  var prefix: Double = js.native
}
object GulpCopyOptions {
  
  @scala.inline
  def apply(prefix: Double): GulpCopyOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpCopyOptions]
  }
  
  @scala.inline
  implicit class GulpCopyOptionsOps[Self <: GulpCopyOptions] (val x: Self) extends AnyVal {
    
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
    def setPrefix(value: Double): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
}
