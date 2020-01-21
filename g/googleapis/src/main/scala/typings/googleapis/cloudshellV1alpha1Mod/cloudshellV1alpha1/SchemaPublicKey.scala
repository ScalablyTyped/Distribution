package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public SSH key, corresponding to a private SSH key held by the client.
  */
@js.native
trait SchemaPublicKey extends js.Object {
  /**
    * Required. Format of this key&#39;s content.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Required. Content of this key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`.
    * `{owner_email}` is the email address of the user to whom the key belongs.
    * `{environment_id}` is the identifier of the environment to which the key
    * grants access. `{key_id}` is the unique identifier of the key. For
    * example,
    * `users/someone@example.com/environments/default/publicKeys/myKey`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPublicKey {
  @scala.inline
  def apply(format: String = null, key: String = null, name: String = null): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublicKey]
  }
}

