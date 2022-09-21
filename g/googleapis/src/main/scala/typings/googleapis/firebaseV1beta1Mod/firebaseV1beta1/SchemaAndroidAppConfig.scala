package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidAppConfig extends StObject {
  
  /**
    * The contents of the JSON configuration file.
    */
  var configFileContents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filename that the configuration artifact for the `AndroidApp` is typically saved as. For example: `google-services.json`
    */
  var configFilename: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidAppConfig {
  
  inline def apply(): SchemaAndroidAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidAppConfig]
  }
  
  extension [Self <: SchemaAndroidAppConfig](x: Self) {
    
    inline def setConfigFileContents(value: String): Self = StObject.set(x, "configFileContents", value.asInstanceOf[js.Any])
    
    inline def setConfigFileContentsNull: Self = StObject.set(x, "configFileContents", null)
    
    inline def setConfigFileContentsUndefined: Self = StObject.set(x, "configFileContents", js.undefined)
    
    inline def setConfigFilename(value: String): Self = StObject.set(x, "configFilename", value.asInstanceOf[js.Any])
    
    inline def setConfigFilenameNull: Self = StObject.set(x, "configFilename", null)
    
    inline def setConfigFilenameUndefined: Self = StObject.set(x, "configFilename", js.undefined)
  }
}
