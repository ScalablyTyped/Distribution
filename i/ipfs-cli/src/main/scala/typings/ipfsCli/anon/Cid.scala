package typings.ipfsCli.anon

import typings.cids.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid extends StObject {
  
  var cid: ^
  
  var depth: js.Any
  
  var name: js.Any
  
  var path: String
  
  var size: js.Any
  
  var `type`: String
}
object Cid {
  
  inline def apply(cid: ^, depth: js.Any, name: js.Any, path: String, size: js.Any, `type`: String): Cid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  
  extension [Self <: Cid](x: Self) {
    
    inline def setCid(value: ^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: js.Any): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
