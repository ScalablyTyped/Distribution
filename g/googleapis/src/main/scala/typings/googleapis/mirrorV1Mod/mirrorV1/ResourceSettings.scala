package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Settings")
@js.native
class ResourceSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * mirror.settings.get
    * @desc Gets a single setting by ID.
    * @alias mirror.settings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the setting. The following IDs are valid:  - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.  - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSetting] = js.native
  def get(callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet, callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: BodyResponseCallback[SchemaSetting],
    callback: BodyResponseCallback[SchemaSetting]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsGet, options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetting]
  ): Unit = js.native
}
