package typings.jupyterlabCoreutils.tokensMod.ISettingRegistry

import org.scalablytyped.runtime.StringDictionary
import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal subset of the formal JSON Schema that describes a property.
  */
trait IProperty extends JSONObject {
  /**
    * The default value, if any.
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * The schema description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The schema's child properties.
    */
  var properties: js.UndefOr[StringDictionary[IProperty]] = js.undefined
  /**
    * The title of a property.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type or types of the data.
    */
  var `type`: js.UndefOr[Primitive | js.Array[Primitive]] = js.undefined
}

object IProperty {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: String = null,
    properties: StringDictionary[IProperty] = null,
    title: String = null,
    `type`: Primitive | js.Array[Primitive] = null
  ): IProperty = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperty]
  }
}

