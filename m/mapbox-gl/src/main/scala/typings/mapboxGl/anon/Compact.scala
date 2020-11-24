package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compact extends js.Object {
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.native
}
object Compact {
  
  @scala.inline
  def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setCustomAttributionVarargs(value: String*): Self = this.set("customAttribution", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttribution(value: String | js.Array[String]): Self = this.set("customAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttribution: Self = this.set("customAttribution", js.undefined)
  }
}
