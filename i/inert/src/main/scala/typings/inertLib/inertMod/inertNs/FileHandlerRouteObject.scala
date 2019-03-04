package typings
package inertLib.inertMod.inertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileHandlerRouteObject extends ReplyFileHandlerOptions {
  /**
    * path - a path string or function as described above (required).
    */
  var path: java.lang.String | RequestHandler[java.lang.String]
}

object FileHandlerRouteObject {
  @scala.inline
  def apply(
    path: java.lang.String | RequestHandler[java.lang.String],
    confine: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    etagMethod: inertLib.inertLibStrings.hash | inertLib.inertLibStrings.simple | inertLib.inertLibNumbers.`false` = null,
    filename: java.lang.String = null,
    lookupCompressed: js.UndefOr[scala.Boolean] = js.undefined,
    lookupMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    mode: inertLib.inertLibNumbers.`false` | inertLib.inertLibStrings.attachment | inertLib.inertLibStrings.`inline` = null,
    start: scala.Int | scala.Double = null
  ): FileHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(confine)) __obj.updateDynamic("confine")(confine)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (etagMethod != null) __obj.updateDynamic("etagMethod")(etagMethod.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(lookupCompressed)) __obj.updateDynamic("lookupCompressed")(lookupCompressed)
    if (lookupMap != null) __obj.updateDynamic("lookupMap")(lookupMap)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerRouteObject]
  }
}

