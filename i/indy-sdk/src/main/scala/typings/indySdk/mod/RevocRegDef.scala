package typings.indySdk.mod

import typings.indySdk.anon.IssuanceType_
import typings.indySdk.indySdkStrings.CL_ACCUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocRegDef extends StObject {
  
  var credDefId: CredDefId
  
  var id: RevRegId
  
  var revocDefType: CL_ACCUM
  
  var tag: String
  
  var value: IssuanceType_
  
  var ver: String
}
object RevocRegDef {
  
  inline def apply(credDefId: CredDefId, id: RevRegId, tag: String, value: IssuanceType_, ver: String): RevocRegDef = {
    val __obj = js.Dynamic.literal(credDefId = credDefId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revocDefType = "CL_ACCUM", tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocRegDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevocRegDef] (val x: Self) extends AnyVal {
    
    inline def setCredDefId(value: CredDefId): Self = StObject.set(x, "credDefId", value.asInstanceOf[js.Any])
    
    inline def setId(value: RevRegId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRevocDefType(value: CL_ACCUM): Self = StObject.set(x, "revocDefType", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setValue(value: IssuanceType_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
  }
}
