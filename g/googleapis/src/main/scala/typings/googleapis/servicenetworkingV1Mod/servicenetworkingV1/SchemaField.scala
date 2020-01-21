package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single field of a message type.
  */
@js.native
trait SchemaField extends js.Object {
  /**
    * The field cardinality.
    */
  var cardinality: js.UndefOr[String] = js.native
  /**
    * The string value of the default value of this field. Proto2 syntax only.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The field JSON name.
    */
  var jsonName: js.UndefOr[String] = js.native
  /**
    * The field type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The field name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The field number.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The index of the field type in `Type.oneofs`, for message or enumeration
    * types. The first type has index 1; zero means the type is not in the
    * list.
    */
  var oneofIndex: js.UndefOr[Double] = js.native
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  /**
    * Whether to use alternative packed wire representation.
    */
  var packed: js.UndefOr[Boolean] = js.native
  /**
    * The field type URL, without the scheme, for message or enumeration types.
    * Example: `&quot;type.googleapis.com/google.protobuf.Timestamp&quot;`.
    */
  var typeUrl: js.UndefOr[String] = js.native
}

object SchemaField {
  @scala.inline
  def apply(
    cardinality: String = null,
    defaultValue: String = null,
    jsonName: String = null,
    kind: String = null,
    name: String = null,
    number: Int | Double = null,
    oneofIndex: Int | Double = null,
    options: js.Array[SchemaOption] = null,
    packed: js.UndefOr[Boolean] = js.undefined,
    typeUrl: String = null
  ): SchemaField = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (oneofIndex != null) __obj.updateDynamic("oneofIndex")(oneofIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    if (typeUrl != null) __obj.updateDynamic("typeUrl")(typeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaField]
  }
}

