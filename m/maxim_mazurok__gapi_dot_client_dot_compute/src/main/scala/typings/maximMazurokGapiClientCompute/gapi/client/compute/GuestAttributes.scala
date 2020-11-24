package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuestAttributes extends js.Object {
  
  /** [Output Only] Type of the resource. Always compute#guestAttributes for guest attributes entry. */
  var kind: js.UndefOr[String] = js.native
  
  /** The path to be queried. This can be the default namespace ('/') or a nested namespace ('/\/') or a specified key ('/\/\') */
  var queryPath: js.UndefOr[String] = js.native
  
  /** [Output Only] The value of the requested queried path. */
  var queryValue: js.UndefOr[GuestAttributesValue] = js.native
  
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The key to search for. */
  var variableKey: js.UndefOr[String] = js.native
  
  /** [Output Only] The value found for the requested key. */
  var variableValue: js.UndefOr[String] = js.native
}
object GuestAttributes {
  
  @scala.inline
  def apply(): GuestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAttributes]
  }
  
  @scala.inline
  implicit class GuestAttributesOps[Self <: GuestAttributes] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setQueryPath(value: String): Self = this.set("queryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPath: Self = this.set("queryPath", js.undefined)
    
    @scala.inline
    def setQueryValue(value: GuestAttributesValue): Self = this.set("queryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryValue: Self = this.set("queryValue", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setVariableKey(value: String): Self = this.set("variableKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableKey: Self = this.set("variableKey", js.undefined)
    
    @scala.inline
    def setVariableValue(value: String): Self = this.set("variableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableValue: Self = this.set("variableValue", js.undefined)
  }
}
