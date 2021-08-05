package typings.ipfsCli.anon

import typings.cids.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidType extends StObject {
  
  var cid: ^
  
  var `type`: js.Any
}
object CidType {
  
  inline def apply(cid: ^, `type`: js.Any): CidType = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidType]
  }
  
  extension [Self <: CidType](x: Self) {
    
    inline def setCid(value: ^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
