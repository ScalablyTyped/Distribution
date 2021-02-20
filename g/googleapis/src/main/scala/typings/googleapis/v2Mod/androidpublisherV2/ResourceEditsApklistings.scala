package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Apklistings")
@js.native
class ResourceEditsApklistings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.edits.apklistings.delete
    * @desc Deletes the APK-specific localized listing for a specified APK and
    * language code.
    * @alias androidpublisher.edits.apklistings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsApklistingsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsApklistingsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsApklistingsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsApklistingsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEditsApklistingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.apklistings.deleteall
    * @desc Deletes all the APK-specific localized listings for a specified
    * APK.
    * @alias androidpublisher.edits.apklistings.deleteall
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteall(): GaxiosPromise[Unit] = js.native
  def deleteall(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsApklistingsDeleteall): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsApklistingsDeleteall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(
    params: ParamsResourceEditsApklistingsDeleteall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteall(params: ParamsResourceEditsApklistingsDeleteall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsResourceEditsApklistingsDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.apklistings.get
    * @desc Fetches the APK-specific localized listing for a specified APK and
    * language code.
    * @alias androidpublisher.edits.apklistings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaApkListing] = js.native
  def get(callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def get(params: ParamsResourceEditsApklistingsGet): GaxiosPromise[SchemaApkListing] = js.native
  def get(params: ParamsResourceEditsApklistingsGet, callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def get(
    params: ParamsResourceEditsApklistingsGet,
    options: BodyResponseCallback[SchemaApkListing],
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
  def get(params: ParamsResourceEditsApklistingsGet, options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def get(
    params: ParamsResourceEditsApklistingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.apklistings.list
    * @desc Lists all the APK-specific localized listings for a specified APK.
    * @alias androidpublisher.edits.apklistings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaApkListingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaApkListingsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApkListingsListResponse] = js.native
  def list(params: ParamsResourceEditsApklistingsList): GaxiosPromise[SchemaApkListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsApklistingsList,
    callback: BodyResponseCallback[SchemaApkListingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEditsApklistingsList,
    options: BodyResponseCallback[SchemaApkListingsListResponse],
    callback: BodyResponseCallback[SchemaApkListingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsApklistingsList, options: MethodOptions): GaxiosPromise[SchemaApkListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsApklistingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApkListingsListResponse]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.apklistings.patch
    * @desc Updates or creates the APK-specific localized listing for a
    * specified APK and language code. This method supports patch semantics.
    * @alias androidpublisher.edits.apklistings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ApkListing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaApkListing] = js.native
  def patch(callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def patch(params: ParamsResourceEditsApklistingsPatch): GaxiosPromise[SchemaApkListing] = js.native
  def patch(params: ParamsResourceEditsApklistingsPatch, callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def patch(
    params: ParamsResourceEditsApklistingsPatch,
    options: BodyResponseCallback[SchemaApkListing],
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsApklistingsPatch, options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def patch(
    params: ParamsResourceEditsApklistingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
  
  /**
    * androidpublisher.edits.apklistings.update
    * @desc Updates or creates the APK-specific localized listing for a
    * specified APK and language code.
    * @alias androidpublisher.edits.apklistings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.apkVersionCode The APK version code whose APK-specific listings should be read or modified.
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.language The language code (a BCP-47 language tag) of the APK-specific localized listing to read or modify. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {().ApkListing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaApkListing] = js.native
  def update(callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def update(params: ParamsResourceEditsApklistingsUpdate): GaxiosPromise[SchemaApkListing] = js.native
  def update(params: ParamsResourceEditsApklistingsUpdate, callback: BodyResponseCallback[SchemaApkListing]): Unit = js.native
  def update(
    params: ParamsResourceEditsApklistingsUpdate,
    options: BodyResponseCallback[SchemaApkListing],
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
  def update(params: ParamsResourceEditsApklistingsUpdate, options: MethodOptions): GaxiosPromise[SchemaApkListing] = js.native
  def update(
    params: ParamsResourceEditsApklistingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApkListing]
  ): Unit = js.native
}
