package typings.googleapis.composerV1Mod.composerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The relative resource name of the environment to update, in the form:
    * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnvironment] = js.undefined
  
  /**
    * Required. A comma-separated list of paths, relative to `Environment`, of
    * fields to update. For example, to set the version of scikit-learn to
    * install in the environment to 0.19.0 and to remove an existing
    * installation of numpy, the `updateMask` parameter would include the
    * following two `paths` values:
    * "config.softwareConfig.pypiPackages.scikit-learn" and
    * "config.softwareConfig.pypiPackages.numpy". The included patch
    * environment would specify the scikit-learn version as follows:      {
    * "config":{         "softwareConfig":{           "pypiPackages":{
    * "scikit-learn":"==0.19.0"           }         }       }     }  Note that
    * in the above example, any existing PyPI packages other than scikit-learn
    * and numpy will be unaffected.  Only one update type may be included in a
    * single request's `updateMask`. For example, one cannot update both the
    * PyPI packages and labels in the same request. However, it is possible to
    * update multiple members of a map field simultaneously in the same
    * request. For example, to set the labels "label1" and "label2" while
    * clearing "label3" (assuming it already exists), one can provide the paths
    * "labels.label1", "labels.label2", and "labels.label3" and populate the
    * patch environment as follows:      {       "labels":{
    * "label1":"new-label1-value"         "label2":"new-label2-value"       }
    * }  Note that in the above example, any existing labels that are not
    * included in the `updateMask` will be unaffected.  It is also possible to
    * replace an entire map field by providing the map field's path in the
    * `updateMask`. The new value of the field will be that which is provided
    * in the patch environment. For example, to delete all pre-existing
    * user-specified PyPI packages and install botocore at version 1.7.14, the
    * `updateMask` would contain the path "config.softwareConfig.pypiPackages",
    * and the patch environment would be the following:      {       "config":{
    * "softwareConfig":{           "pypiPackages":{ "botocore":"==1.7.14" } }
    * }     }  **Note:** Only the following fields can be updated:   <table>
    * <tbody>  <tr>  <td><strong>Mask</strong></td>
    * <td><strong>Purpose</strong></td>  </tr>  <tr>
    * <td>config.softwareConfig.pypiPackages  </td>  <td>Replace all custom
    * custom PyPI packages. If a replacement  package map is not included in
    * `environment`, all custom  PyPI packages are cleared. It is an error to
    * provide both this mask and a  mask specifying an individual package.</td>
    * </tr>  <tr>
    * <td>config.softwareConfig.pypiPackages.<var>packagename</var></td>
    * <td>Update the custom PyPI package <var>packagename</var>,  preserving
    * other packages. To delete the package, include it in  `updateMask`, and
    * omit the mapping for it in
    * `environment.config.softwareConfig.pypiPackages`. It is an error  to
    * provide both a mask of this form and the
    * "config.softwareConfig.pypiPackages" mask.</td>  </tr>  <tr>
    * <td>labels</td>  <td>Replace all environment labels. If a replacement
    * labels map is not  included in `environment`, all labels are cleared. It
    * is an error to  provide both this mask and a mask specifying one or more
    * individual  labels.</td>  </tr>  <tr>
    * <td>labels.<var>labelName</var></td>  <td>Set the label named
    * <var>labelName</var>, while preserving other  labels. To delete the
    * label, include it in `updateMask` and omit its  mapping in
    * `environment.labels`. It is an error to provide both a  mask of this form
    * and the "labels" mask.</td>  </tr>  <tr>  <td>config.nodeCount</td>
    * <td>Horizontally scale the number of nodes in the environment. An integer
    * greater than or equal to 3 must be provided in the `config.nodeCount`
    * field.  </td>  </tr>  <tr>
    * <td>config.softwareConfig.airflowConfigOverrides</td>  <td>Replace all
    * Apache Airflow config overrides. If a replacement config  overrides map
    * is not included in `environment`, all config overrides  are cleared.  It
    * is an error to provide both this mask and a mask specifying one or  more
    * individual config overrides.</td>  </tr>  <tr>
    * <td>config.softwareConfig.airflowConfigOverrides.<var>section</var>-<var>name
    * </var></td>  <td>Override the Apache Airflow config property
    * <var>name</var> in the  section named <var>section</var>, preserving
    * other properties. To delete  the property override, include it in
    * `updateMask` and omit its mapping  in
    * `environment.config.softwareConfig.airflowConfigOverrides`.  It is an
    * error to provide both a mask of this form and the
    * "config.softwareConfig.airflowConfigOverrides" mask.</td>  </tr>  <tr>
    * <td>config.softwareConfig.envVariables</td>  <td>Replace all environment
    * variables. If a replacement environment  variable map is not included in
    * `environment`, all custom environment  variables  are cleared.  It is an
    * error to provide both this mask and a mask specifying one or  more
    * individual environment variables.</td>  </tr>  </tbody>  </table>
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsEnvironmentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsEnvironmentsPatchMutableBuilder[Self <: ParamsResourceProjectsLocationsEnvironmentsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEnvironment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
