package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a single script deployment.
  */
trait SchemaDeployment extends StObject {
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.undefined
  
  /**
    * The deployment ID for this deployment.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment&#39;s entry points.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.undefined
  
  /**
    * Last modified date time stamp.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaDeployment {
  
  inline def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  
  extension [Self <: SchemaDeployment](x: Self) {
    
    inline def setDeploymentConfig(value: SchemaDeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setEntryPoints(value: js.Array[SchemaEntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setEntryPointsVarargs(value: SchemaEntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value :_*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
