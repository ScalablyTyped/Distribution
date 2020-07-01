package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to upload user account in batch.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyUploadAccountRequest extends js.Object {
  /**
    * Whether allow overwrite existing account when user local_id exists.
    */
  var allowOverwrite: js.UndefOr[Boolean] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  /**
    * The following 4 fields are for standard scrypt algorithm.
    */
  var cpuMemCost: js.UndefOr[Double] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  var dkLen: js.UndefOr[Double] = js.native
  /**
    * The password hash algorithm.
    */
  var hashAlgorithm: js.UndefOr[String] = js.native
  /**
    * Memory cost for hash calculation. Used by scrypt similar algorithms.
    */
  var memoryCost: js.UndefOr[Double] = js.native
  var parallelization: js.UndefOr[Double] = js.native
  /**
    * Rounds for hash calculation. Used by scrypt and similar algorithms.
    */
  var rounds: js.UndefOr[Double] = js.native
  /**
    * The salt separator.
    */
  var saltSeparator: js.UndefOr[String] = js.native
  /**
    * If true, backend will do sanity check(including duplicate email and
    * federated id) when uploading account.
    */
  var sanityCheck: js.UndefOr[Boolean] = js.native
  /**
    * The key for to hash the password.
    */
  var signerKey: js.UndefOr[String] = js.native
  /**
    * Specify which project (field value is actually project id) to operate.
    * Only used when provided credential.
    */
  var targetProjectId: js.UndefOr[String] = js.native
  /**
    * The account info to be stored.
    */
  var users: js.UndefOr[js.Array[SchemaUserInfo]] = js.native
}

object SchemaIdentitytoolkitRelyingpartyUploadAccountRequest {
  @scala.inline
  def apply(
    allowOverwrite: js.UndefOr[Boolean] = js.undefined,
    blockSize: js.UndefOr[Double] = js.undefined,
    cpuMemCost: js.UndefOr[Double] = js.undefined,
    delegatedProjectNumber: String = null,
    dkLen: js.UndefOr[Double] = js.undefined,
    hashAlgorithm: String = null,
    memoryCost: js.UndefOr[Double] = js.undefined,
    parallelization: js.UndefOr[Double] = js.undefined,
    rounds: js.UndefOr[Double] = js.undefined,
    saltSeparator: String = null,
    sanityCheck: js.UndefOr[Boolean] = js.undefined,
    signerKey: String = null,
    targetProjectId: String = null,
    users: js.Array[SchemaUserInfo] = null
  ): SchemaIdentitytoolkitRelyingpartyUploadAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverwrite)) __obj.updateDynamic("allowOverwrite")(allowOverwrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockSize)) __obj.updateDynamic("blockSize")(blockSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpuMemCost)) __obj.updateDynamic("cpuMemCost")(cpuMemCost.get.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(dkLen)) __obj.updateDynamic("dkLen")(dkLen.get.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryCost)) __obj.updateDynamic("memoryCost")(memoryCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelization)) __obj.updateDynamic("parallelization")(parallelization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rounds)) __obj.updateDynamic("rounds")(rounds.get.asInstanceOf[js.Any])
    if (saltSeparator != null) __obj.updateDynamic("saltSeparator")(saltSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(sanityCheck)) __obj.updateDynamic("sanityCheck")(sanityCheck.get.asInstanceOf[js.Any])
    if (signerKey != null) __obj.updateDynamic("signerKey")(signerKey.asInstanceOf[js.Any])
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyUploadAccountRequest]
  }
}

