package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An opaque binary blob file to install on the device before the test starts.
  */
trait SchemaObbFile extends StObject {
  
  /**
    * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
    */
  var obb: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * Required. OBB file name which must conform to the format as specified by
    * Android e.g. [main|patch].0300110.com.example.android.obb which will be
    * installed into
    * \&lt;shared-storage\&gt;/Android/obb/\&lt;package-name\&gt;/ on the
    * device.
    */
  var obbFileName: js.UndefOr[String] = js.undefined
}
object SchemaObbFile {
  
  @scala.inline
  def apply(): SchemaObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObbFile]
  }
  
  @scala.inline
  implicit class SchemaObbFileMutableBuilder[Self <: SchemaObbFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObb(value: SchemaFileReference): Self = StObject.set(x, "obb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileName(value: String): Self = StObject.set(x, "obbFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileNameUndefined: Self = StObject.set(x, "obbFileName", js.undefined)
    
    @scala.inline
    def setObbUndefined: Self = StObject.set(x, "obb", js.undefined)
  }
}
