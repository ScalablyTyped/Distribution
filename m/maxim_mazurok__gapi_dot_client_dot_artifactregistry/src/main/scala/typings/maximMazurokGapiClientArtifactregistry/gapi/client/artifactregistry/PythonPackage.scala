package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PythonPackage extends StObject {
  
  /** Output only. Time the package was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. registry_location, project_id, repository_name and python_package forms a unique package name:`projects//locations//repository//pythonPackages/`. For example,
    * "projects/test-project/locations/us-west4/repositories/test-repo/pythonPackages/ python_package:1.0.0", where "us-west4" is the registry_location, "test-project" is the project_id,
    * "test-repo" is the repository_name and python_package:1.0.0" is the python package.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Package for the artifact. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the package was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Required. URL to access the package. Example: us-west4-python.pkg.dev/test-project/test-repo/python_package/file-name-1.0.0.tar.gz */
  var uri: js.UndefOr[String] = js.undefined
  
  /** Version of this package. */
  var version: js.UndefOr[String] = js.undefined
}
object PythonPackage {
  
  inline def apply(): PythonPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PythonPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PythonPackage] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
