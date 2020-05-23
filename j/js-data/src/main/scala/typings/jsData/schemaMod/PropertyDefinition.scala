package typings.jsData.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDefinition extends js.Object {
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var `extends`: js.UndefOr[Schema] = js.undefined
  var get: js.UndefOr[js.Function] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[PropertyDefinition] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[StringDictionary[PropertyDefinition]] = js.undefined
  var required: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var track: js.UndefOr[Boolean] = js.undefined
  var `type`: String | js.Array[String]
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object PropertyDefinition {
  @scala.inline
  def apply(
    `type`: String | js.Array[String],
    additionalProperties: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    `extends`: Schema = null,
    get: js.Function = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    items: PropertyDefinition = null,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    properties: StringDictionary[PropertyDefinition] = null,
    required: js.Array[String] | Boolean = null,
    track: js.UndefOr[Boolean] = js.undefined,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): PropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDefinition]
  }
}

