package typings.hlsDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndependentSegments extends js.Object {
  var independentSegments: Boolean
  var isMasterPlaylist: Boolean
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Anon_Offset] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Anon_IndependentSegments {
  @scala.inline
  def apply(
    independentSegments: Boolean,
    isMasterPlaylist: Boolean,
    source: String = null,
    start: Anon_Offset = null,
    uri: String = null,
    version: Int | Double = null
  ): Anon_IndependentSegments = {
    val __obj = js.Dynamic.literal(independentSegments = independentSegments.asInstanceOf[js.Any], isMasterPlaylist = isMasterPlaylist.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndependentSegments]
  }
}

