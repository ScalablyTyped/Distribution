package typings.gulpDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterOptions extends js.Object {
  
  /**
    * emit an error on finding diffs, defaults to `false`
    */
  var fail: js.UndefOr[Boolean] = js.native
  
  /**
    * do not show diff information, defaults to `false`
    */
  var quiet: js.UndefOr[Boolean] = js.native
}
object ReporterOptions {
  
  @scala.inline
  def apply(): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterOptions]
  }
  
  @scala.inline
  implicit class ReporterOptionsOps[Self <: ReporterOptions] (val x: Self) extends AnyVal {
    
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
    def setFail(value: Boolean): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
}
