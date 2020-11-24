package typings.iarnaToml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  /**
    * The amount text to parser per pass through the event loop. Defaults to 40kb (`40000`).
    */
  var blocksize: Double = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(blocksize: Double): ParseOptions = {
    val __obj = js.Dynamic.literal(blocksize = blocksize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setBlocksize(value: Double): Self = this.set("blocksize", value.asInstanceOf[js.Any])
  }
}
