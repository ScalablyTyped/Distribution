package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveRequest extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
  var singlePackage: js.UndefOr[Boolean] = js.undefined
  var specificFiles: js.UndefOr[js.Array[String]] = js.undefined
  var unpackaged: js.UndefOr[Package] = js.undefined
}

object RetrieveRequest {
  @scala.inline
  def apply(
    apiVersion: String = null,
    packageNames: js.Array[String] = null,
    singlePackage: js.UndefOr[Boolean] = js.undefined,
    specificFiles: js.Array[String] = null,
    unpackaged: Package = null
  ): RetrieveRequest = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (packageNames != null) __obj.updateDynamic("packageNames")(packageNames)
    if (!js.isUndefined(singlePackage)) __obj.updateDynamic("singlePackage")(singlePackage)
    if (specificFiles != null) __obj.updateDynamic("specificFiles")(specificFiles)
    if (unpackaged != null) __obj.updateDynamic("unpackaged")(unpackaged)
    __obj.asInstanceOf[RetrieveRequest]
  }
}

