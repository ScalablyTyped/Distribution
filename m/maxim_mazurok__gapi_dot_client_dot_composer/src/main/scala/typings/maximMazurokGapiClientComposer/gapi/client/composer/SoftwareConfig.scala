package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareConfig extends StObject {
  
  /**
    * Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example
    * "core-dags_are_paused_at_creation". Section names must not contain hyphens ("-"), opening square brackets ("["), or closing square brackets ("]"). The property name must not be
    * empty and must not contain an equals sign ("=") or semicolon (";"). Section and property names must not contain a period ("."). Apache Airflow configuration property names must be
    * written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache
    * Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
    */
  var airflowConfigOverrides: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression
    * `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match
    * any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` *
    * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
    */
  var envVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the
    * regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported
    * and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is
    * omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud
    * Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release
    * name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
    */
  var imageVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as "numpy" and values are the lowercase
    * extras and version specifier such as "==1.12.0", "[devel,gcp_api]", or "[devel]>=1.8.2, <1.9.2". To specify a package without pinning it to a version specifier, use the empty string
    * as the value.
    */
  var pypiPackages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to '2' or '3'. If not specified, the default is '2'.
    * Cannot be updated.
    */
  var pythonVersion: js.UndefOr[String] = js.undefined
}
object SoftwareConfig {
  
  @scala.inline
  def apply(): SoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareConfig]
  }
  
  @scala.inline
  implicit class SoftwareConfigMutableBuilder[Self <: SoftwareConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAirflowConfigOverrides(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "airflowConfigOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirflowConfigOverridesUndefined: Self = StObject.set(x, "airflowConfigOverrides", js.undefined)
    
    @scala.inline
    def setEnvVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "envVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVariablesUndefined: Self = StObject.set(x, "envVariables", js.undefined)
    
    @scala.inline
    def setImageVersion(value: String): Self = StObject.set(x, "imageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionUndefined: Self = StObject.set(x, "imageVersion", js.undefined)
    
    @scala.inline
    def setPypiPackages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.SoftwareConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "pypiPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPypiPackagesUndefined: Self = StObject.set(x, "pypiPackages", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
  }
}
