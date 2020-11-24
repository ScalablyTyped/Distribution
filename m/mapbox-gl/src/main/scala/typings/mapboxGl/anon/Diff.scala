package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff extends js.Object {
  
  var diff: js.UndefOr[Boolean] = js.native
  
  var localIdeographFontFamily: js.UndefOr[String] = js.native
}
object Diff {
  
  @scala.inline
  def apply(): Diff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: Boolean): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setLocalIdeographFontFamily(value: String): Self = this.set("localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIdeographFontFamily: Self = this.set("localIdeographFontFamily", js.undefined)
  }
}
