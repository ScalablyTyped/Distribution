package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObbFile extends StObject {
  
  /**
    * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
    */
  var obb: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * Required. OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
    */
  var obbFileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaObbFile {
  
  inline def apply(): SchemaObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObbFile]
  }
  
  extension [Self <: SchemaObbFile](x: Self) {
    
    inline def setObb(value: SchemaFileReference): Self = StObject.set(x, "obb", value.asInstanceOf[js.Any])
    
    inline def setObbFileName(value: String): Self = StObject.set(x, "obbFileName", value.asInstanceOf[js.Any])
    
    inline def setObbFileNameNull: Self = StObject.set(x, "obbFileName", null)
    
    inline def setObbFileNameUndefined: Self = StObject.set(x, "obbFileName", js.undefined)
    
    inline def setObbUndefined: Self = StObject.set(x, "obb", js.undefined)
  }
}
