package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning
  * object. Currently, an owning object must be in the same namespace, so there
  * is no namespace field.
  */
@js.native
trait SchemaOwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * If true, AND if the owner has the &quot;foregroundDeletion&quot;
    * finalizer, then the owner cannot be deleted from the key-value store
    * until this reference is removed. Defaults to false. To set this field, a
    * user needs &quot;delete&quot; permission of the owner, otherwise 422
    * (Unprocessable Entity) will be returned. +optional
    */
  var blockOwnerDeletion: js.UndefOr[Boolean] = js.native
  /**
    * If true, this reference points to the managing controller. +optional
    */
  var controller: js.UndefOr[Boolean] = js.native
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[String] = js.native
  /**
    * UID of the referent. More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[String] = js.native
}

object SchemaOwnerReference {
  @scala.inline
  def apply(
    apiVersion: String = null,
    blockOwnerDeletion: js.UndefOr[Boolean] = js.undefined,
    controller: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    uid: String = null
  ): SchemaOwnerReference = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(blockOwnerDeletion)) __obj.updateDynamic("blockOwnerDeletion")(blockOwnerDeletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controller)) __obj.updateDynamic("controller")(controller.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOwnerReference]
  }
}

