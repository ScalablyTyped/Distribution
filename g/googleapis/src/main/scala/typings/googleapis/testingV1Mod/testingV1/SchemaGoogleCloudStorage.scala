package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A storage location within Google cloud storage (GCS).
  */
@js.native
trait SchemaGoogleCloudStorage extends StObject {
  
  /**
    * Required. The path to a directory in GCS that will eventually contain the
    * results for this test. The requesting user must have write access on the
    * bucket in the supplied path.
    */
  var gcsPath: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudStorage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudStorage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudStorageMutableBuilder[Self <: SchemaGoogleCloudStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
