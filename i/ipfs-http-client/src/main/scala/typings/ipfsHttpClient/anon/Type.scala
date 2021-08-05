package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var cid: ^
  
  var `type`: js.Any
}
object Type {
  
  inline def apply(cid: ^, `type`: js.Any): Type = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setCid(value: ^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
