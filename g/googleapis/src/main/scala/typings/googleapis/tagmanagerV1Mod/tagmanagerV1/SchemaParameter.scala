package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Parameter.
  */
@js.native
trait SchemaParameter extends js.Object {
  /**
    * The named key that uniquely identifies a parameter. Required for
    * top-level parameters, as well as map values. Ignored for list values.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This list parameter&#39;s parameters (keys will be ignored).
    */
  var list: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * This map parameter&#39;s parameters (must have keys; keys must be
    * unique).
    */
  var map: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * The parameter type. Valid values are:  - boolean: The value represents a
    * boolean, represented as &#39;true&#39; or &#39;false&#39;  - integer: The
    * value represents a 64-bit signed integer value, in base 10  - list: A
    * list of parameters should be specified  - map: A map of parameters should
    * be specified  - template: The value represents any text; this can include
    * variable references (even variable references that might return
    * non-string types)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A parameter&#39;s value (may contain variable references such as
    * &quot;{{myVariable}}&quot;) as appropriate to the specified type.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaParameter {
  @scala.inline
  def apply(
    key: String = null,
    list: js.Array[SchemaParameter] = null,
    map: js.Array[SchemaParameter] = null,
    `type`: String = null,
    value: String = null
  ): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParameter]
  }
}

