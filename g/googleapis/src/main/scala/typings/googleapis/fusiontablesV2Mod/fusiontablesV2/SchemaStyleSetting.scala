package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a complete StyleSettings object. The primary key is a
  * combination of the tableId and a styleId.
  */
@js.native
trait SchemaStyleSetting extends js.Object {
  /**
    * The kind of item this is. A StyleSetting contains the style definitions
    * for points, lines, and polygons in a table. Since a table can have any
    * one or all of them, a style definition can have point, line and polygon
    * style definitions.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Style definition for points in the table.
    */
  var markerOptions: js.UndefOr[SchemaPointStyle] = js.native
  /**
    * Optional name for the style setting.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Style definition for polygons in the table.
    */
  var polygonOptions: js.UndefOr[SchemaPolygonStyle] = js.native
  /**
    * Style definition for lines in the table.
    */
  var polylineOptions: js.UndefOr[SchemaLineStyle] = js.native
  /**
    * Identifier for the style setting (unique only within tables).
    */
  var styleId: js.UndefOr[Double] = js.native
  /**
    * Identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
}

object SchemaStyleSetting {
  @scala.inline
  def apply(
    kind: String = null,
    markerOptions: SchemaPointStyle = null,
    name: String = null,
    polygonOptions: SchemaPolygonStyle = null,
    polylineOptions: SchemaLineStyle = null,
    styleId: Int | Double = null,
    tableId: String = null
  ): SchemaStyleSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (styleId != null) __obj.updateDynamic("styleId")(styleId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStyleSetting]
  }
}

