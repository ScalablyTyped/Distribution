package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentConfig extends StObject {
  
  /**
    * The description for this deployment.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The manifest file name for this deployment.
    */
  var manifestFileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number on which this deployment is based.
    */
  var versionNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeploymentConfig {
  
  inline def apply(): SchemaDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentConfig]
  }
  
  extension [Self <: SchemaDeploymentConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
    
    inline def setManifestFileNameNull: Self = StObject.set(x, "manifestFileName", null)
    
    inline def setManifestFileNameUndefined: Self = StObject.set(x, "manifestFileName", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdNull: Self = StObject.set(x, "scriptId", null)
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
