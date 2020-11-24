package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceProperties extends js.Object {
  
  /** Whether an approval will exclude the descendants of the resource being requested. */
  var excludesDescendants: js.UndefOr[Boolean] = js.native
}
object ResourceProperties {
  
  @scala.inline
  def apply(): ResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceProperties]
  }
  
  @scala.inline
  implicit class ResourcePropertiesOps[Self <: ResourceProperties] (val x: Self) extends AnyVal {
    
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
    def setExcludesDescendants(value: Boolean): Self = this.set("excludesDescendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludesDescendants: Self = this.set("excludesDescendants", js.undefined)
  }
}
