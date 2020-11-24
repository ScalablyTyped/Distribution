package typings.jupyterlabLogconsole.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISourceDisplayed extends js.Object {
  
  var source: String | Null = js.native
  
  var version: Double | Null = js.native
}
object ISourceDisplayed {
  
  @scala.inline
  def apply(): ISourceDisplayed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceDisplayed]
  }
  
  @scala.inline
  implicit class ISourceDisplayedOps[Self <: ISourceDisplayed] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
