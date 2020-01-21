package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hash values.
  */
@js.native
trait SchemaHash extends js.Object {
  /**
    * The type of hash that was performed.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The hash value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaHash {
  @scala.inline
  def apply(`type`: String = null, value: String = null): SchemaHash = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHash]
  }
}

