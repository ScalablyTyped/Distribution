package typings.ldapjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjs.mod.AttributeJson
import typings.ldapjs.mod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ldapjs.ldapjs.LDAPMessageJsonObject & {  objectName :string,   attributes :std.Array<ldapjs.ldapjs.AttributeJson>} */
@js.native
trait LDAPMessageJsonObjectobje
  extends /* k */ StringDictionary[js.Any] {
  
  var attributes: js.Array[AttributeJson] = js.native
  
  var controls: js.Array[Control] = js.native
  
  var messageID: Double = js.native
  
  var objectName: String = js.native
  
  var protocolOp: js.UndefOr[String] = js.native
}
object LDAPMessageJsonObjectobje {
  
  @scala.inline
  def apply(
    attributes: js.Array[AttributeJson],
    controls: js.Array[Control],
    messageID: Double,
    objectName: String
  ): LDAPMessageJsonObjectobje = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObjectobje]
  }
  
  @scala.inline
  implicit class LDAPMessageJsonObjectobjeOps[Self <: LDAPMessageJsonObjectobje] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: AttributeJson*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[AttributeJson]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: Double): Self = this.set("messageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectName(value: String): Self = this.set("objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolOp(value: String): Self = this.set("protocolOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolOp: Self = this.set("protocolOp", js.undefined)
  }
}
