package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSHKey extends js.Object {
  
  var annotation: String = js.native
  
  var created: String = js.native
  
  var fingerprint: String = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var pubkey: String = js.native
  
  var updated: String = js.native
}
object SSHKey {
  
  @scala.inline
  def apply(
    annotation: String,
    created: String,
    fingerprint: String,
    id: String,
    name: String,
    pubkey: String,
    updated: String
  ): SSHKey = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKey]
  }
  
  @scala.inline
  implicit class SSHKeyOps[Self <: SSHKey] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: String): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubkey(value: String): Self = this.set("pubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
