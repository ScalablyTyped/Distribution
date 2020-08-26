package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$V1beta1")
@js.native
class ResourceV1beta1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.getEidparams
    * @desc Gets the Proximity Beacon API's current public key and associated
    * parameters used to initiate the Diffie-Hellman key exchange required to
    * register a beacon that broadcasts the Eddystone-EID format. This key
    * changes periodically; clients may cache it and re-use the same public key
    * to provision and register multiple beacons. However, clients should be
    * prepared to refresh this key when they encounter an error registering an
    * Eddystone-EID beacon.
    * @alias proximitybeacon.getEidparams
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getEidparams(): GaxiosPromise[SchemaEphemeralIdRegistrationParams] = js.native
  def getEidparams(callback: BodyResponseCallback[SchemaEphemeralIdRegistrationParams]): Unit = js.native
  def getEidparams(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEphemeralIdRegistrationParams] = js.native
  def getEidparams(params: ParamsResourceV1beta1Geteidparams): GaxiosPromise[SchemaEphemeralIdRegistrationParams] = js.native
  def getEidparams(
    params: ParamsResourceV1beta1Geteidparams,
    callback: BodyResponseCallback[SchemaEphemeralIdRegistrationParams]
  ): Unit = js.native
  def getEidparams(
    params: ParamsResourceV1beta1Geteidparams,
    options: BodyResponseCallback[SchemaEphemeralIdRegistrationParams],
    callback: BodyResponseCallback[SchemaEphemeralIdRegistrationParams]
  ): Unit = js.native
  def getEidparams(params: ParamsResourceV1beta1Geteidparams, options: MethodOptions): GaxiosPromise[SchemaEphemeralIdRegistrationParams] = js.native
  def getEidparams(
    params: ParamsResourceV1beta1Geteidparams,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEphemeralIdRegistrationParams]
  ): Unit = js.native
}

