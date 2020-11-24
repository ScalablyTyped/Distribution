package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipTo extends js.Object {
  
  var skipTo: js.UndefOr[String] = js.native
}
object SkipTo {
  
  @scala.inline
  def apply(): SkipTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipTo]
  }
  
  @scala.inline
  implicit class SkipToOps[Self <: SkipTo] (val x: Self) extends AnyVal {
    
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
    def setSkipTo(value: String): Self = this.set("skipTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTo: Self = this.set("skipTo", js.undefined)
  }
}
