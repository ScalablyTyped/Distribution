package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the dimensions of ads, placements, creatives, or creative
  * assets.
  */
@js.native
trait SchemaSize extends js.Object {
  /**
    * Height of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * IAB standard size. This is a read-only, auto-generated field.
    */
  var iab: js.UndefOr[Boolean] = js.native
  /**
    * ID of this size. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#size&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Width of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaSize {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    iab: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSize]
  }
}

