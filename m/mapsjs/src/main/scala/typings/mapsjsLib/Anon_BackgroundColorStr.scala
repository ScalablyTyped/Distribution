package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorStr extends js.Object {
  var backgroundColorStr: js.UndefOr[java.lang.String] = js.undefined
  var bleedRatio: js.UndefOr[scala.Double] = js.undefined
  var imageType: js.UndefOr[java.lang.String] = js.undefined
  var layerFill: js.UndefOr[js.Object] = js.undefined
  var layerOutline: js.UndefOr[js.Object] = js.undefined
  var layerVisibility: js.UndefOr[js.Object] = js.undefined
  var layerWhere: js.UndefOr[js.Object] = js.undefined
  var mapCacheName: js.UndefOr[java.lang.String] = js.undefined
  var mapCacheOption: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var useQuadKeyForMapCacheName: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorStr {
  @scala.inline
  def apply(
    backgroundColorStr: java.lang.String = null,
    bleedRatio: scala.Int | scala.Double = null,
    imageType: java.lang.String = null,
    layerFill: js.Object = null,
    layerOutline: js.Object = null,
    layerVisibility: js.Object = null,
    layerWhere: js.Object = null,
    mapCacheName: java.lang.String = null,
    mapCacheOption: java.lang.String = null,
    tag: java.lang.String = null,
    useQuadKeyForMapCacheName: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Anon_BackgroundColorStr = {
    val __obj = js.Dynamic.literal()
    if (backgroundColorStr != null) __obj.updateDynamic("backgroundColorStr")(backgroundColorStr)
    if (bleedRatio != null) __obj.updateDynamic("bleedRatio")(bleedRatio.asInstanceOf[js.Any])
    if (imageType != null) __obj.updateDynamic("imageType")(imageType)
    if (layerFill != null) __obj.updateDynamic("layerFill")(layerFill)
    if (layerOutline != null) __obj.updateDynamic("layerOutline")(layerOutline)
    if (layerVisibility != null) __obj.updateDynamic("layerVisibility")(layerVisibility)
    if (layerWhere != null) __obj.updateDynamic("layerWhere")(layerWhere)
    if (mapCacheName != null) __obj.updateDynamic("mapCacheName")(mapCacheName)
    if (mapCacheOption != null) __obj.updateDynamic("mapCacheOption")(mapCacheOption)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (!js.isUndefined(useQuadKeyForMapCacheName)) __obj.updateDynamic("useQuadKeyForMapCacheName")(useQuadKeyForMapCacheName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_BackgroundColorStr]
  }
}

