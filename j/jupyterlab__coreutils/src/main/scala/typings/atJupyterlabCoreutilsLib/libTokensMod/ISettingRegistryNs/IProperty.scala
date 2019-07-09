package typings
package atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal subset of the formal JSON Schema that describes a property.
  */
trait IProperty
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The default value, if any.
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * The schema description.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The schema's child properties.
    */
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IProperty]] = js.undefined
  /**
    * The title of a property.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type or types of the data.
    */
  var `type`: js.UndefOr[Primitive | js.Array[Primitive]] = js.undefined
}

object IProperty {
  @scala.inline
  def apply(
    default: js.Any = null,
    description: java.lang.String = null,
    properties: org.scalablytyped.runtime.StringDictionary[IProperty] = null,
    title: java.lang.String = null,
    `type`: Primitive | js.Array[Primitive] = null
  ): IProperty = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperty]
  }
}

