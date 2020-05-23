package typings.hlsParser.mod.types

import typings.hlsParser.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePlaylistConstructorProperties extends js.Object {
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Offset] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object BasePlaylistConstructorProperties {
  @scala.inline
  def apply(
    independentSegments: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    start: Offset = null,
    uri: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): BasePlaylistConstructorProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(independentSegments)) __obj.updateDynamic("independentSegments")(independentSegments.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorProperties]
  }
}

