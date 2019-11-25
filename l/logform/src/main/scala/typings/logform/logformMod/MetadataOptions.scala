package typings.logform.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataOptions extends js.Object {
  /**
    * An array of keys that should not be added to the metadata object.
    */
  var fillExcept: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of keys that will be added to the metadata object.
    */
  var fillWith: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the key used for the metadata object. Defaults to `metadata`.
    */
  var key: js.UndefOr[String] = js.undefined
}

object MetadataOptions {
  @scala.inline
  def apply(fillExcept: js.Array[String] = null, fillWith: js.Array[String] = null, key: String = null): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (fillExcept != null) __obj.updateDynamic("fillExcept")(fillExcept.asInstanceOf[js.Any])
    if (fillWith != null) __obj.updateDynamic("fillWith")(fillWith.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataOptions]
  }
}

