package typings.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightAutoOptions extends HighlightOptions {
  
  var subset: js.UndefOr[js.Array[String]] = js.native
}
object HighlightAutoOptions {
  
  @scala.inline
  def apply(): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightAutoOptions]
  }
  
  @scala.inline
  implicit class HighlightAutoOptionsOps[Self <: HighlightAutoOptions] (val x: Self) extends AnyVal {
    
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
    def setSubsetVarargs(value: String*): Self = this.set("subset", js.Array(value :_*))
    
    @scala.inline
    def setSubset(value: js.Array[String]): Self = this.set("subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubset: Self = this.set("subset", js.undefined)
  }
}
