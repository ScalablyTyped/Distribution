package typings.lokijs

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataOptions extends js.Object {
  
  var forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null = js.native
  
  var forceClones: Boolean = js.native
  
  var removeMeta: Boolean = js.native
}
object GetDataOptions {
  
  @scala.inline
  def apply(forceClones: Boolean, removeMeta: Boolean): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones.asInstanceOf[js.Any], removeMeta = removeMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
  
  @scala.inline
  implicit class GetDataOptionsOps[Self <: GetDataOptions] (val x: Self) extends AnyVal {
    
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
    def setForceClones(value: Boolean): Self = this.set("forceClones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMeta(value: Boolean): Self = this.set("removeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = this.set("forceCloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceCloneMethodNull: Self = this.set("forceCloneMethod", null)
  }
}
