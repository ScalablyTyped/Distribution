package typings.libp2pDelegatedContentRouting.mod

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatResult extends StObject {
  
  var cid: CID[Any, Double, Double, Version]
  
  var size: Double
}
object StatResult {
  
  inline def apply(cid: CID[Any, Double, Double, Version], size: Double): StatResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatResult]
  }
  
  extension [Self <: StatResult](x: Self) {
    
    inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
