package typings.ltx.libParserMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.libElementMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var Element: js.UndefOr[
    Instantiable2[
      /* name */ String, 
      js.UndefOr[String | StringDictionary[js.Any]], 
      typings.ltx.libElementMod.Element
    ]
  ] = js.undefined
  var Parser: js.UndefOr[
    Instantiable1[js.UndefOr[/* options */ ParserOptions], typings.ltx.libParserMod.Parser]
  ] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    Element: Instantiable2[/* name */ String, js.UndefOr[String | StringDictionary[js.Any]], Element] = null,
    Parser: Instantiable1[js.UndefOr[/* options */ ParserOptions], Parser] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (Element != null) __obj.updateDynamic("Element")(Element)
    if (Parser != null) __obj.updateDynamic("Parser")(Parser)
    __obj.asInstanceOf[ParserOptions]
  }
}

