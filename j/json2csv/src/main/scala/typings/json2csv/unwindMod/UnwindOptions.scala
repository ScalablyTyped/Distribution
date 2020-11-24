package typings.json2csv.unwindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnwindOptions extends js.Object {
  
  var blankOut: js.UndefOr[Boolean] = js.native
  
  var paths: js.UndefOr[js.Array[String]] = js.native
}
object UnwindOptions {
  
  @scala.inline
  def apply(): UnwindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnwindOptions]
  }
  
  @scala.inline
  implicit class UnwindOptionsOps[Self <: UnwindOptions] (val x: Self) extends AnyVal {
    
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
    def setBlankOut(value: Boolean): Self = this.set("blankOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlankOut: Self = this.set("blankOut", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
}
