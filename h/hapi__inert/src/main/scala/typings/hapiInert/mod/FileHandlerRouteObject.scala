package typings.hapiInert.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiInert.hapiInertBooleans.`false`
import typings.hapiInert.hapiInertStrings.`inline`
import typings.hapiInert.hapiInertStrings.attachment
import typings.hapiInert.hapiInertStrings.hash
import typings.hapiInert.hapiInertStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileHandlerRouteObject extends ReplyFileHandlerOptions {
  /**
    * path - a path string or function as described above (required).
    */
  var path: String | RequestHandler[String]
}

object FileHandlerRouteObject {
  @scala.inline
  def apply(
    path: String | RequestHandler[String],
    confine: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    etagMethod: hash | simple | `false` = null,
    filename: String = null,
    lookupCompressed: js.UndefOr[Boolean] = js.undefined,
    lookupMap: StringDictionary[String] = null,
    mode: `false` | attachment | `inline` = null,
    start: Int | Double = null
  ): FileHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(confine)) __obj.updateDynamic("confine")(confine.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (etagMethod != null) __obj.updateDynamic("etagMethod")(etagMethod.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupCompressed)) __obj.updateDynamic("lookupCompressed")(lookupCompressed.asInstanceOf[js.Any])
    if (lookupMap != null) __obj.updateDynamic("lookupMap")(lookupMap.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerRouteObject]
  }
}

