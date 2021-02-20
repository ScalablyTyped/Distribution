package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single device file description.
  */
@js.native
trait SchemaDeviceFile extends StObject {
  
  /**
    * A reference to an opaque binary blob file
    */
  var obbFile: js.UndefOr[SchemaObbFile] = js.native
  
  /**
    * A reference to a regular file
    */
  var regularFile: js.UndefOr[SchemaRegularFile] = js.native
}
object SchemaDeviceFile {
  
  @scala.inline
  def apply(): SchemaDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceFile]
  }
  
  @scala.inline
  implicit class SchemaDeviceFileMutableBuilder[Self <: SchemaDeviceFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObbFile(value: SchemaObbFile): Self = StObject.set(x, "obbFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObbFileUndefined: Self = StObject.set(x, "obbFile", js.undefined)
    
    @scala.inline
    def setRegularFile(value: SchemaRegularFile): Self = StObject.set(x, "regularFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularFileUndefined: Self = StObject.set(x, "regularFile", js.undefined)
  }
}
