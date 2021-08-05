package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a file, used for user inputs.
  */
trait SchemaFileReference extends StObject {
  
  /**
    * A path to a file in Google Cloud Storage. Example:
    * gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[String] = js.undefined
}
object SchemaFileReference {
  
  inline def apply(): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileReference]
  }
  
  extension [Self <: SchemaFileReference](x: Self) {
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
