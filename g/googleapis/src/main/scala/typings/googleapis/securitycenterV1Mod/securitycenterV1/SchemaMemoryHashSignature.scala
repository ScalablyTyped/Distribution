package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemoryHashSignature extends StObject {
  
  /**
    * The binary family.
    */
  var binaryFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of memory hash detections contributing to the binary family match.
    */
  var detections: js.UndefOr[js.Array[SchemaDetection]] = js.undefined
}
object SchemaMemoryHashSignature {
  
  inline def apply(): SchemaMemoryHashSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryHashSignature]
  }
  
  extension [Self <: SchemaMemoryHashSignature](x: Self) {
    
    inline def setBinaryFamily(value: String): Self = StObject.set(x, "binaryFamily", value.asInstanceOf[js.Any])
    
    inline def setBinaryFamilyNull: Self = StObject.set(x, "binaryFamily", null)
    
    inline def setBinaryFamilyUndefined: Self = StObject.set(x, "binaryFamily", js.undefined)
    
    inline def setDetections(value: js.Array[SchemaDetection]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: SchemaDetection*): Self = StObject.set(x, "detections", js.Array(value*))
  }
}
