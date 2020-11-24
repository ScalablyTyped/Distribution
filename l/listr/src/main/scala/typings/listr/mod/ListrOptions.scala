package typings.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListrOptions[Ctx] extends js.Object {
  
  var concurrent: js.UndefOr[Boolean | Double] = js.native
  
  var exitOnError: js.UndefOr[Boolean] = js.native
  
  var nonTTYRenderer: js.UndefOr[ListrRendererValue[Ctx]] = js.native
  
  var renderer: js.UndefOr[ListrRendererValue[Ctx]] = js.native
}
object ListrOptions {
  
  @scala.inline
  def apply[Ctx](): ListrOptions[Ctx] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrOptions[Ctx]]
  }
  
  @scala.inline
  implicit class ListrOptionsOps[Self <: ListrOptions[_], Ctx] (val x: Self with ListrOptions[Ctx]) extends AnyVal {
    
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
    def setConcurrent(value: Boolean | Double): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    
    @scala.inline
    def setExitOnError(value: Boolean): Self = this.set("exitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnError: Self = this.set("exitOnError", js.undefined)
    
    @scala.inline
    def setNonTTYRenderer(value: ListrRendererValue[Ctx]): Self = this.set("nonTTYRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonTTYRenderer: Self = this.set("nonTTYRenderer", js.undefined)
    
    @scala.inline
    def setRenderer(value: ListrRendererValue[Ctx]): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
}
