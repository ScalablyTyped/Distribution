package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNymResponse extends StObject {
  
  var did: Did
  
  var role: NymRole
  
  var verkey: Verkey
}
object GetNymResponse {
  
  inline def apply(did: Did, role: NymRole, verkey: Verkey): GetNymResponse = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNymResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNymResponse] (val x: Self) extends AnyVal {
    
    inline def setDid(value: Did): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
    
    inline def setRole(value: NymRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
  }
}
