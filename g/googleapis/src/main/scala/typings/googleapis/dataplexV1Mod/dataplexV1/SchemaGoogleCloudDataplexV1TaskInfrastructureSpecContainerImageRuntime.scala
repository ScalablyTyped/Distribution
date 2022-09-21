package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime extends StObject {
  
  /**
    * Optional. Container image to use.
    */
  var image: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
    */
  var javaJars: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
    */
  var pythonPackages: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setJavaJars(value: js.Array[String]): Self = StObject.set(x, "javaJars", value.asInstanceOf[js.Any])
    
    inline def setJavaJarsNull: Self = StObject.set(x, "javaJars", null)
    
    inline def setJavaJarsUndefined: Self = StObject.set(x, "javaJars", js.undefined)
    
    inline def setJavaJarsVarargs(value: String*): Self = StObject.set(x, "javaJars", js.Array(value*))
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPythonPackages(value: js.Array[String]): Self = StObject.set(x, "pythonPackages", value.asInstanceOf[js.Any])
    
    inline def setPythonPackagesNull: Self = StObject.set(x, "pythonPackages", null)
    
    inline def setPythonPackagesUndefined: Self = StObject.set(x, "pythonPackages", js.undefined)
    
    inline def setPythonPackagesVarargs(value: String*): Self = StObject.set(x, "pythonPackages", js.Array(value*))
  }
}
