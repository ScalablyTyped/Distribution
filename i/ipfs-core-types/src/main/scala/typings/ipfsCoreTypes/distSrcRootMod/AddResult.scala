package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsUnixfs.mod.Mtime
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResult extends StObject {
  
  var cid: CID[Any, Double, Double, Version]
  
  var mode: js.UndefOr[Double] = js.undefined
  
  var mtime: js.UndefOr[Mtime] = js.undefined
  
  var path: String
  
  var size: Double
}
object AddResult {
  
  inline def apply(cid: CID[Any, Double, Double, Version], path: String, size: Double): AddResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResult]
  }
  
  extension [Self <: AddResult](x: Self) {
    
    inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
