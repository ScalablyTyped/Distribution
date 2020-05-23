package typings.intlMessageformatParser.parserMod

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    filename: String = null,
    startRule: String = null,
    tracer: js.Any = null
  ): IParseOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (startRule != null) __obj.updateDynamic("startRule")(startRule.asInstanceOf[js.Any])
    if (tracer != null) __obj.updateDynamic("tracer")(tracer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParseOptions]
  }
}

