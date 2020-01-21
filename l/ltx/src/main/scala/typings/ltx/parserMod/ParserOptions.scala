package typings.ltx.parserMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var Element: js.UndefOr[
    Instantiable2[
      /* name */ String, 
      js.UndefOr[String | StringDictionary[js.Any]], 
      typings.ltx.elementMod.Element
    ]
  ] = js.undefined
  var Parser: js.UndefOr[
    Instantiable1[js.UndefOr[/* options */ ParserOptions], typings.ltx.parserMod.Parser]
  ] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    Element: Instantiable2[/* name */ String, js.UndefOr[String | StringDictionary[js.Any]], Element] = null,
    Parser: Instantiable1[js.UndefOr[/* options */ ParserOptions], Parser] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (Element != null) __obj.updateDynamic("Element")(Element.asInstanceOf[js.Any])
    if (Parser != null) __obj.updateDynamic("Parser")(Parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

