package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderMerchantProvidedAnnotation extends js.Object {
  /**
    * Key for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaOrderMerchantProvidedAnnotation {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaOrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderMerchantProvidedAnnotation]
  }
}

