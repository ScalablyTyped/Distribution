package typings
package hlsDotJsLib.hlsDotJsMod

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
  var level: scala.Double
  /**
    * true if onProgress should report partial chunk of loaded content
    */
  var progressData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * end byte range offset
    */
  var rangeEnd: js.UndefOr[scala.Double] = js.undefined
  /**
    * start byte range offset
    */
  var rangeStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * loader response type (arraybuffer or default response type for playlist)
    */
  var responseType: java.lang.String
  /**
    * request type
    * - level, manifest
    */
  var `type`: java.lang.String
  /**
    * target URL
    */
  var url: java.lang.String
}

object LoaderContext {
  @scala.inline
  def apply(
    frag: Fragment,
    level: scala.Double,
    responseType: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    progressData: js.UndefOr[scala.Boolean] = js.undefined,
    rangeEnd: scala.Int | scala.Double = null,
    rangeStart: scala.Int | scala.Double = null
  ): LoaderContext = {
    val __obj = js.Dynamic.literal(frag = frag, level = level, responseType = responseType, url = url)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(progressData)) __obj.updateDynamic("progressData")(progressData)
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderContext]
  }
}

