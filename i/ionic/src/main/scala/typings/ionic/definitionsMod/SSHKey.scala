package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSHKey extends StObject {
  
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
  implicit class SSHKeyMutableBuilder[Self <: SSHKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubkey(value: String): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
