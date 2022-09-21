package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosAppConfig extends StObject {
  
  /**
    * The content of the XML configuration file.
    */
  var configFileContents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filename that the configuration artifact for the `IosApp` is typically saved as. For example: `GoogleService-Info.plist`
    */
  var configFilename: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosAppConfig {
  
  inline def apply(): SchemaIosAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosAppConfig]
  }
  
  extension [Self <: SchemaIosAppConfig](x: Self) {
    
    inline def setConfigFileContents(value: String): Self = StObject.set(x, "configFileContents", value.asInstanceOf[js.Any])
    
    inline def setConfigFileContentsNull: Self = StObject.set(x, "configFileContents", null)
    
    inline def setConfigFileContentsUndefined: Self = StObject.set(x, "configFileContents", js.undefined)
    
    inline def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
    
    inline def setConfigFilenameNull: Self = StObject.set(x, "configFilename", null)
    
    inline def setConfigFilenameUndefined: Self = StObject.set(x, "configFilename", js.undefined)
  }
}
