package typings.googleapis.composerV1Mod.composerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/composer/v1", "composer_v1.Resource$Projects$Locations$Environments")
@js.native
class ResourceProjectsLocationsEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * composer.projects.locations.environments.create
    * @desc Create a new environment.
    * @alias composer.projects.locations.environments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent must be of the form "projects/{projectId}/locations/{locationId}".
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsEnvironmentsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEnvironmentsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsEnvironmentsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsEnvironmentsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsEnvironmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * composer.projects.locations.environments.delete
    * @desc Delete an environment.
    * @alias composer.projects.locations.environments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The environment to delete, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsEnvironmentsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEnvironmentsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEnvironmentsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsEnvironmentsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsEnvironmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * composer.projects.locations.environments.get
    * @desc Get an existing environment.
    * @alias composer.projects.locations.environments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the environment to get, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEnvironment] = js.native
  def get(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(params: ParamsResourceProjectsLocationsEnvironmentsGet): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEnvironmentsGet,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsEnvironmentsGet,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  
  /**
    * composer.projects.locations.environments.list
    * @desc List environments.
    * @alias composer.projects.locations.environments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of environments to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent List environments in the given project and location, in the form: "projects/{projectId}/locations/{locationId}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnvironmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsEnvironmentsList): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEnvironmentsList,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsEnvironmentsList,
    options: BodyResponseCallback[SchemaListEnvironmentsResponse],
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsEnvironmentsList, options: MethodOptions): GaxiosPromise[SchemaListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsEnvironmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnvironmentsResponse]
  ): Unit = js.native
  
  /**
    * composer.projects.locations.environments.patch
    * @desc Update an environment.
    * @alias composer.projects.locations.environments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the environment to update, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
    * @param {string=} params.updateMask Required. A comma-separated list of paths, relative to `Environment`, of fields to update. For example, to set the version of scikit-learn to install in the environment to 0.19.0 and to remove an existing installation of numpy, the `updateMask` parameter would include the following two `paths` values: "config.softwareConfig.pypiPackages.scikit-learn" and "config.softwareConfig.pypiPackages.numpy". The included patch environment would specify the scikit-learn version as follows:      {       "config":{         "softwareConfig":{           "pypiPackages":{             "scikit-learn":"==0.19.0"           }         }       }     }  Note that in the above example, any existing PyPI packages other than scikit-learn and numpy will be unaffected.  Only one update type may be included in a single request's `updateMask`. For example, one cannot update both the PyPI packages and labels in the same request. However, it is possible to update multiple members of a map field simultaneously in the same request. For example, to set the labels "label1" and "label2" while clearing "label3" (assuming it already exists), one can provide the paths "labels.label1", "labels.label2", and "labels.label3" and populate the patch environment as follows:      {       "labels":{         "label1":"new-label1-value"         "label2":"new-label2-value"       }     }  Note that in the above example, any existing labels that are not included in the `updateMask` will be unaffected.  It is also possible to replace an entire map field by providing the map field's path in the `updateMask`. The new value of the field will be that which is provided in the patch environment. For example, to delete all pre-existing user-specified PyPI packages and install botocore at version 1.7.14, the `updateMask` would contain the path "config.softwareConfig.pypiPackages", and the patch environment would be the following:      {       "config":{         "softwareConfig":{           "pypiPackages":{             "botocore":"==1.7.14"           }         }       }     }  **Note:** Only the following fields can be updated:   <table>  <tbody>  <tr>  <td><strong>Mask</strong></td>  <td><strong>Purpose</strong></td>  </tr>  <tr>  <td>config.softwareConfig.pypiPackages  </td>  <td>Replace all custom custom PyPI packages. If a replacement  package map is not included in `environment`, all custom  PyPI packages are cleared. It is an error to provide both this mask and a  mask specifying an individual package.</td>  </tr>  <tr>  <td>config.softwareConfig.pypiPackages.<var>packagename</var></td>  <td>Update the custom PyPI package <var>packagename</var>,  preserving other packages. To delete the package, include it in  `updateMask`, and omit the mapping for it in  `environment.config.softwareConfig.pypiPackages`. It is an error  to provide both a mask of this form and the  "config.softwareConfig.pypiPackages" mask.</td>  </tr>  <tr>  <td>labels</td>  <td>Replace all environment labels. If a replacement labels map is not  included in `environment`, all labels are cleared. It is an error to  provide both this mask and a mask specifying one or more individual  labels.</td>  </tr>  <tr>  <td>labels.<var>labelName</var></td>  <td>Set the label named <var>labelName</var>, while preserving other  labels. To delete the label, include it in `updateMask` and omit its  mapping in `environment.labels`. It is an error to provide both a  mask of this form and the "labels" mask.</td>  </tr>  <tr>  <td>config.nodeCount</td>  <td>Horizontally scale the number of nodes in the environment. An integer  greater than or equal to 3 must be provided in the `config.nodeCount` field.  </td>  </tr>  <tr>  <td>config.softwareConfig.airflowConfigOverrides</td>  <td>Replace all Apache Airflow config overrides. If a replacement config  overrides map is not included in `environment`, all config overrides  are cleared.  It is an error to provide both this mask and a mask specifying one or  more individual config overrides.</td>  </tr>  <tr>  <td>config.softwareConfig.airflowConfigOverrides.<var>section</var>-<var>name  </var></td>  <td>Override the Apache Airflow config property <var>name</var> in the  section named <var>section</var>, preserving other properties. To delete  the property override, include it in `updateMask` and omit its mapping  in `environment.config.softwareConfig.airflowConfigOverrides`.  It is an error to provide both a mask of this form and the  "config.softwareConfig.airflowConfigOverrides" mask.</td>  </tr>  <tr>  <td>config.softwareConfig.envVariables</td>  <td>Replace all environment variables. If a replacement environment  variable map is not included in `environment`, all custom environment  variables  are cleared.  It is an error to provide both this mask and a mask specifying one or  more individual environment variables.</td>  </tr>  </tbody>  </table>
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsEnvironmentsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEnvironmentsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEnvironmentsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsEnvironmentsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsEnvironmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
