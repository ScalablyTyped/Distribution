package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileReference extends StObject {
  
  /**
    * A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)
    */
  var gcsPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileReference {
  
  inline def apply(): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileReference]
  }
  
  extension [Self <: SchemaFileReference](x: Self) {
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathNull: Self = StObject.set(x, "gcsPath", null)
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
