package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColorStr extends js.Object {
  var backgroundColorStr: js.UndefOr[String] = js.undefined
  var bleedRatio: js.UndefOr[Double] = js.undefined
  var imageType: js.UndefOr[String] = js.undefined
  var layerFill: js.UndefOr[js.Object] = js.undefined
  var layerOutline: js.UndefOr[js.Object] = js.undefined
  var layerVisibility: js.UndefOr[js.Object] = js.undefined
  var layerWhere: js.UndefOr[js.Object] = js.undefined
  var mapCacheName: js.UndefOr[String] = js.undefined
  var mapCacheOption: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var useQuadKeyForMapCacheName: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object AnonBackgroundColorStr {
  @scala.inline
  def apply(
    backgroundColorStr: String = null,
    bleedRatio: Int | Double = null,
    imageType: String = null,
    layerFill: js.Object = null,
    layerOutline: js.Object = null,
    layerVisibility: js.Object = null,
    layerWhere: js.Object = null,
    mapCacheName: String = null,
    mapCacheOption: String = null,
    tag: String = null,
    useQuadKeyForMapCacheName: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): AnonBackgroundColorStr = {
    val __obj = js.Dynamic.literal()
    if (backgroundColorStr != null) __obj.updateDynamic("backgroundColorStr")(backgroundColorStr.asInstanceOf[js.Any])
    if (bleedRatio != null) __obj.updateDynamic("bleedRatio")(bleedRatio.asInstanceOf[js.Any])
    if (imageType != null) __obj.updateDynamic("imageType")(imageType.asInstanceOf[js.Any])
    if (layerFill != null) __obj.updateDynamic("layerFill")(layerFill.asInstanceOf[js.Any])
    if (layerOutline != null) __obj.updateDynamic("layerOutline")(layerOutline.asInstanceOf[js.Any])
    if (layerVisibility != null) __obj.updateDynamic("layerVisibility")(layerVisibility.asInstanceOf[js.Any])
    if (layerWhere != null) __obj.updateDynamic("layerWhere")(layerWhere.asInstanceOf[js.Any])
    if (mapCacheName != null) __obj.updateDynamic("mapCacheName")(mapCacheName.asInstanceOf[js.Any])
    if (mapCacheOption != null) __obj.updateDynamic("mapCacheOption")(mapCacheOption.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuadKeyForMapCacheName)) __obj.updateDynamic("useQuadKeyForMapCacheName")(useQuadKeyForMapCacheName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColorStr]
  }
}

