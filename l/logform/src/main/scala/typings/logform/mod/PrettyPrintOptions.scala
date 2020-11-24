package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrettyPrintOptions extends js.Object {
  
  /**
    * Colorizes the message if set to `true`. Defaults to `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.native
  
  /**
    * A `number` that specifies the maximum depth of the `info` object being stringified by
    * `util.inspect`. Defaults to `2`.
    */
  var depth: js.UndefOr[Double] = js.native
}
object PrettyPrintOptions {
  
  @scala.inline
  def apply(): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyPrintOptions]
  }
  
  @scala.inline
  implicit class PrettyPrintOptionsOps[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
    
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
    def setColorize(value: Boolean): Self = this.set("colorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorize: Self = this.set("colorize", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
  }
}
