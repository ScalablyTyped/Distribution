package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceFile extends StObject {
  
  /**
    * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
    */
  var allowInsecure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A Cloud Storage object.
    */
  var gcs: js.UndefOr[SchemaOSPolicyResourceFileGcs] = js.undefined
  
  /**
    * A local path within the VM to use.
    */
  var localPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A generic remote file.
    */
  var remote: js.UndefOr[SchemaOSPolicyResourceFileRemote] = js.undefined
}
object SchemaOSPolicyResourceFile {
  
  inline def apply(): SchemaOSPolicyResourceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceFile]
  }
  
  extension [Self <: SchemaOSPolicyResourceFile](x: Self) {
    
    inline def setAllowInsecure(value: Boolean): Self = StObject.set(x, "allowInsecure", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureNull: Self = StObject.set(x, "allowInsecure", null)
    
    inline def setAllowInsecureUndefined: Self = StObject.set(x, "allowInsecure", js.undefined)
    
    inline def setGcs(value: SchemaOSPolicyResourceFileGcs): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathNull: Self = StObject.set(x, "localPath", null)
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
    
    inline def setRemote(value: SchemaOSPolicyResourceFileRemote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
