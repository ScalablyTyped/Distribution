package typings.intlDashMessageformatDashParser.libParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParseOptions
  extends /* key */ StringDictionary[js.Any] {
  var filename: js.UndefOr[String] = js.undefined
  var startRule: js.UndefOr[String] = js.undefined
  var tracer: js.UndefOr[js.Any] = js.undefined
}

object IParseOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    filename: String = null,
    startRule: String = null,
    tracer: js.Any = null
  ): IParseOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (startRule != null) __obj.updateDynamic("startRule")(startRule)
    if (tracer != null) __obj.updateDynamic("tracer")(tracer)
    __obj.asInstanceOf[IParseOptions]
  }
}

