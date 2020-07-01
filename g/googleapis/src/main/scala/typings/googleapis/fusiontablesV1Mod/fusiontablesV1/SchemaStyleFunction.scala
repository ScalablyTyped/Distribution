package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleapis.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StyleFunction within a StyleSetting
  */
@js.native
trait SchemaStyleFunction extends js.Object {
  /**
    * Bucket function that assigns a style based on the range a column value
    * falls into.
    */
  var buckets: js.UndefOr[js.Array[SchemaBucket]] = js.native
  /**
    * Name of the column whose value is used in the style.
    */
  var columnName: js.UndefOr[String] = js.native
  /**
    * Gradient function that interpolates a range of colors based on column
    * value.
    */
  var gradient: js.UndefOr[Colors] = js.native
  /**
    * Stylers can be one of three kinds: &quot;fusiontables#fromColumn&quot; if
    * the column value is to be used as is, i.e., the column values can have
    * colors in #RRGGBBAA format or integer line widths or icon names;
    * &quot;fusiontables#gradient&quot; if the styling of the row is to be
    * based on applying the gradient function on the column value; or
    * &quot;fusiontables#buckets&quot; if the styling is to based on the bucket
    * into which the the column value falls.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaStyleFunction {
  @scala.inline
  def apply(
    buckets: js.Array[SchemaBucket] = null,
    columnName: String = null,
    gradient: Colors = null,
    kind: String = null
  ): SchemaStyleFunction = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStyleFunction]
  }
}

