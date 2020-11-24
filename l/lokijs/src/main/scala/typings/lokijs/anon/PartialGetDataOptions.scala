package typings.lokijs.anon

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.GetDataOptions> */
@js.native
trait PartialGetDataOptions extends js.Object {
  
  var forceCloneMethod: js.UndefOr[
    `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  ] = js.native
  
  var forceClones: js.UndefOr[Boolean] = js.native
  
  var removeMeta: js.UndefOr[Boolean] = js.native
}
object PartialGetDataOptions {
  
  @scala.inline
  def apply(): PartialGetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetDataOptions]
  }
  
  @scala.inline
  implicit class PartialGetDataOptionsOps[Self <: PartialGetDataOptions] (val x: Self) extends AnyVal {
    
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
    def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = this.set("forceCloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCloneMethod: Self = this.set("forceCloneMethod", js.undefined)
    
    @scala.inline
    def setForceCloneMethodNull: Self = this.set("forceCloneMethod", null)
    
    @scala.inline
    def setForceClones(value: Boolean): Self = this.set("forceClones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceClones: Self = this.set("forceClones", js.undefined)
    
    @scala.inline
    def setRemoveMeta(value: Boolean): Self = this.set("removeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveMeta: Self = this.set("removeMeta", js.undefined)
  }
}
