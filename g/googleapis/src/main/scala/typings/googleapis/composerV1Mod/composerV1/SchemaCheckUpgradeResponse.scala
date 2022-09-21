package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckUpgradeResponse extends StObject {
  
  /**
    * Output only. Url for a docker build log of an upgraded image.
    */
  var buildLogUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether build has succeeded or failed on modules conflicts.
    */
  var containsPypiModulesConflict: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Composer image for which the build was happening.
    */
  var imageVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Extract from a docker image build log containing information about pypi modules conflicts.
    */
  var pypiConflictBuildLogExtract: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pypi dependencies specified in the environment configuration, at the time when the build was triggered.
    */
  var pypiDependencies: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaCheckUpgradeResponse {
  
  inline def apply(): SchemaCheckUpgradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckUpgradeResponse]
  }
  
  extension [Self <: SchemaCheckUpgradeResponse](x: Self) {
    
    inline def setBuildLogUri(value: String): Self = StObject.set(x, "buildLogUri", value.asInstanceOf[js.Any])
    
    inline def setBuildLogUriNull: Self = StObject.set(x, "buildLogUri", null)
    
    inline def setBuildLogUriUndefined: Self = StObject.set(x, "buildLogUri", js.undefined)
    
    inline def setContainsPypiModulesConflict(value: String): Self = StObject.set(x, "containsPypiModulesConflict", value.asInstanceOf[js.Any])
    
    inline def setContainsPypiModulesConflictNull: Self = StObject.set(x, "containsPypiModulesConflict", null)
    
    inline def setContainsPypiModulesConflictUndefined: Self = StObject.set(x, "containsPypiModulesConflict", js.undefined)
    
    inline def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNull: Self = StObject.set(x, "imageVersion", null)
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    inline def setPypiConflictBuildLogExtract(value: String): Self = StObject.set(x, "pypiConflictBuildLogExtract", value.asInstanceOf[js.Any])
    
    inline def setPypiConflictBuildLogExtractNull: Self = StObject.set(x, "pypiConflictBuildLogExtract", null)
    
    inline def setPypiConflictBuildLogExtractUndefined: Self = StObject.set(x, "pypiConflictBuildLogExtract", js.undefined)
    
    inline def setPypiDependencies(value: StringDictionary[String]): Self = StObject.set(x, "pypiDependencies", value.asInstanceOf[js.Any])
    
    inline def setPypiDependenciesNull: Self = StObject.set(x, "pypiDependencies", null)
    
    inline def setPypiDependenciesUndefined: Self = StObject.set(x, "pypiDependencies", js.undefined)
  }
}
