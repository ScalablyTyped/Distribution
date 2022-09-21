package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ContentNotebook extends StObject {
  
  /**
    * Required. Kernel Type of the notebook.
    */
  var kernelType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ContentNotebook {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ContentNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ContentNotebook]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ContentNotebook](x: Self) {
    
    inline def setKernelType(value: String): Self = StObject.set(x, "kernelType", value.asInstanceOf[js.Any])
    
    inline def setKernelTypeNull: Self = StObject.set(x, "kernelType", null)
    
    inline def setKernelTypeUndefined: Self = StObject.set(x, "kernelType", js.undefined)
  }
}
