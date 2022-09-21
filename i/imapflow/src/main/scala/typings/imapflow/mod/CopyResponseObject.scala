package typings.imapflow.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyResponseObject extends StObject {
  
  var destination: String
  
  var path: String
  
  var uidMap: js.UndefOr[Map[Double, Double]] = js.undefined
  
  var uidValidity: js.UndefOr[js.BigInt] = js.undefined
}
object CopyResponseObject {
  
  inline def apply(destination: String, path: String): CopyResponseObject = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyResponseObject]
  }
  
  extension [Self <: CopyResponseObject](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUidMap(value: Map[Double, Double]): Self = StObject.set(x, "uidMap", value.asInstanceOf[js.Any])
    
    inline def setUidMapUndefined: Self = StObject.set(x, "uidMap", js.undefined)
    
    inline def setUidValidity(value: js.BigInt): Self = StObject.set(x, "uidValidity", value.asInstanceOf[js.Any])
    
    inline def setUidValidityUndefined: Self = StObject.set(x, "uidValidity", js.undefined)
  }
}
