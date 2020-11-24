package typings.logform.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PadLevelsOptions extends js.Object {
  
  /**
    * Log levels. Defaults to `configs.npm.levels` from [triple-beam](https://github.com/winstonjs/triple-beam)
    * module.
    */
  var levels: js.UndefOr[Record[String, Double]] = js.native
}
object PadLevelsOptions {
  
  @scala.inline
  def apply(): PadLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PadLevelsOptions]
  }
  
  @scala.inline
  implicit class PadLevelsOptionsOps[Self <: PadLevelsOptions] (val x: Self) extends AnyVal {
    
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
    def setLevels(value: Record[String, Double]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
  }
}
