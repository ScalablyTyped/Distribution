package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceFile extends StObject {
  
  /**
    * A reference to an opaque binary blob file.
    */
  var obbFile: js.UndefOr[SchemaObbFile] = js.undefined
  
  /**
    * A reference to a regular file.
    */
  var regularFile: js.UndefOr[SchemaRegularFile] = js.undefined
}
object SchemaDeviceFile {
  
  inline def apply(): SchemaDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceFile]
  }
  
  extension [Self <: SchemaDeviceFile](x: Self) {
    
    inline def setObbFile(value: SchemaObbFile): Self = StObject.set(x, "obbFile", value.asInstanceOf[js.Any])
    
    inline def setObbFileUndefined: Self = StObject.set(x, "obbFile", js.undefined)
    
    inline def setRegularFile(value: SchemaRegularFile): Self = StObject.set(x, "regularFile", value.asInstanceOf[js.Any])
    
    inline def setRegularFileUndefined: Self = StObject.set(x, "regularFile", js.undefined)
  }
}
