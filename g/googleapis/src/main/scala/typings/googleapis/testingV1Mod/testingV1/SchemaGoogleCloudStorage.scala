package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudStorage extends StObject {
  
  /**
    * Required. The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudStorage {
  
  inline def apply(): SchemaGoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudStorage]
  }
  
  extension [Self <: SchemaGoogleCloudStorage](x: Self) {
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathNull: Self = StObject.set(x, "gcsPath", null)
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
