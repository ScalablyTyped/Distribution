package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderContext extends js.Object {
  /**
    * fragment object
    */
  var frag: Fragment
  /**
    * level id
    */
  var level: Double
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[Boolean] = js.undefined
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[Double] = js.undefined
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[Double] = js.undefined
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: String
  /**
    * request type
    * - level, manifest
    */
  var `type`: String
  /**
    * target URL
    */
  var url: String
}

object LoaderContext {
  @scala.inline
  def apply(
    frag: Fragment,
    level: Double,
    responseType: String,
    `type`: String,
    url: String,
    progressData: js.UndefOr[Boolean] = js.undefined,
    rangeEnd: js.UndefOr[Double] = js.undefined,
    rangeStart: js.UndefOr[Double] = js.undefined
  ): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(progressData)) __obj.updateDynamic("progressData")(progressData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeEnd)) __obj.updateDynamic("rangeEnd")(rangeEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeStart)) __obj.updateDynamic("rangeStart")(rangeStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
}

