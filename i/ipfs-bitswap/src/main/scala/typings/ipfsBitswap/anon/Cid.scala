package typings.ipfsBitswap.anon

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid extends StObject {
  
  var cid: CID[Any, Double, Double, Version]
  
  var data: js.typedarray.Uint8Array
}
object Cid {
  
  inline def apply(cid: CID[Any, Double, Double, Version], data: js.typedarray.Uint8Array): Cid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  
  extension [Self <: Cid](x: Self) {
    
    inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
