package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime extends StObject {
  
  /**
    * Required. Dataplex Image version.
    */
  var imageVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
    */
  var javaLibraries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be "spark".
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
    */
  var pythonPackages: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime](x: Self) {
    
    inline def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionNull: Self = StObject.set(x, "imageVersion", null)
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    inline def setJavaLibraries(value: js.Array[String]): Self = StObject.set(x, "javaLibraries", value.asInstanceOf[js.Any])
    
    inline def setJavaLibrariesNull: Self = StObject.set(x, "javaLibraries", null)
    
    inline def setJavaLibrariesUndefined: Self = StObject.set(x, "javaLibraries", js.undefined)
    
    inline def setJavaLibrariesVarargs(value: String*): Self = StObject.set(x, "javaLibraries", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPythonPackages(value: js.Array[String]): Self = StObject.set(x, "pythonPackages", value.asInstanceOf[js.Any])
    
    inline def setPythonPackagesNull: Self = StObject.set(x, "pythonPackages", null)
    
    inline def setPythonPackagesUndefined: Self = StObject.set(x, "pythonPackages", js.undefined)
    
    inline def setPythonPackagesVarargs(value: String*): Self = StObject.set(x, "pythonPackages", js.Array(value*))
  }
}
