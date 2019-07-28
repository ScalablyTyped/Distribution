package typings.jsonDashSchemaDashRefDashParser

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchemaDashRefDashParser.jsonDashSchemaDashRefDashParserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json
  extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
  var json: js.UndefOr[ParserOptions | Boolean] = js.undefined
  var text: js.UndefOr[(ParserOptions with Anon_Encoding) | Boolean] = js.undefined
  var yaml: js.UndefOr[ParserOptions | Boolean] = js.undefined
}

object Anon_Json {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] = null,
    json: ParserOptions | Boolean = null,
    text: (ParserOptions with Anon_Encoding) | Boolean = null,
    yaml: ParserOptions | Boolean = null
  ): Anon_Json = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

