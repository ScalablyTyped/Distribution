package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckUpgradeResponse extends StObject {
  
  /** Output only. Url for a docker build log of an upgraded image. */
  var buildLogUri: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether build has succeeded or failed on modules conflicts. */
  var containsPypiModulesConflict: js.UndefOr[String] = js.undefined
  
  /** Composer image for which the build was happening. */
  var imageVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. Extract from a docker image build log containing information about pypi modules conflicts. */
  var pypiConflictBuildLogExtract: js.UndefOr[String] = js.undefined
  
  /** Pypi dependencies specified in the environment configuration, at the time when the build was triggered. */
  var pypiDependencies: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.CheckUpgradeResponse & TopLevel[Any]
  ] = js.undefined
}
object CheckUpgradeResponse {
  
  inline def apply(): CheckUpgradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckUpgradeResponse]
  }
  
  extension [Self <: CheckUpgradeResponse](x: Self) {
    
    inline def setBuildLogUri(value: String): Self = StObject.set(x, "buildLogUri", value.asInstanceOf[js.Any])
    
    inline def setBuildLogUriUndefined: Self = StObject.set(x, "buildLogUri", js.undefined)
    
    inline def setContainsPypiModulesConflict(value: String): Self = StObject.set(x, "containsPypiModulesConflict", value.asInstanceOf[js.Any])
    
    inline def setContainsPypiModulesConflictUndefined: Self = StObject.set(x, "containsPypiModulesConflict", js.undefined)
    
    inline def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    inline def setPypiConflictBuildLogExtract(value: String): Self = StObject.set(x, "pypiConflictBuildLogExtract", value.asInstanceOf[js.Any])
    
    inline def setPypiConflictBuildLogExtractUndefined: Self = StObject.set(x, "pypiConflictBuildLogExtract", js.undefined)
    
    inline def setPypiDependencies(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.CheckUpgradeResponse & TopLevel[Any]
    ): Self = StObject.set(x, "pypiDependencies", value.asInstanceOf[js.Any])
    
    inline def setPypiDependenciesUndefined: Self = StObject.set(x, "pypiDependencies", js.undefined)
  }
}
