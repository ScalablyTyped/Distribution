package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of attributes, each in the format `[KEY]:[VALUE]`.
  */
@js.native
trait SchemaAttributes extends js.Object {
  /**
    * The set of attributes. Each attribute&#39;s key can be up to 128 bytes
    * long. The value can be a string up to 256 bytes, a signed 64-bit integer,
    * or the Boolean values `true` and `false`. For example:
    * &quot;/instance_id&quot;: &quot;my-instance&quot;
    * &quot;/http/user_agent&quot;: &quot;&quot;
    * &quot;/http/request_bytes&quot;: 300     &quot;abc.com/myattribute&quot;:
    * true
    */
  var attributeMap: js.UndefOr[StringDictionary[SchemaAttributeValue]] = js.native
  /**
    * The number of attributes that were discarded. Attributes can be discarded
    * because their keys are too long or because there are too many attributes.
    * If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.native
}

object SchemaAttributes {
  @scala.inline
  def apply(
    attributeMap: StringDictionary[SchemaAttributeValue] = null,
    droppedAttributesCount: js.UndefOr[Double] = js.undefined
  ): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributeMap != null) __obj.updateDynamic("attributeMap")(attributeMap.asInstanceOf[js.Any])
    if (!js.isUndefined(droppedAttributesCount)) __obj.updateDynamic("droppedAttributesCount")(droppedAttributesCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttributes]
  }
}

