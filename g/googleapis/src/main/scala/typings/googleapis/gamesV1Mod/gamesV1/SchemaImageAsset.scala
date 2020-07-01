package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an image asset object.
  */
@js.native
trait SchemaImageAsset extends js.Object {
  /**
    * The height of the asset.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#imageAsset.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the asset.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the asset.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the asset.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaImageAsset {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    name: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaImageAsset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageAsset]
  }
}

