package typings
package ltxLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var Element: js.UndefOr[
    org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]], 
      ltxLib.libElementMod.Element
    ]
  ] = js.undefined
  var Parser: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ ParserOptions], Parser]
  ] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    Element: org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]], 
      ltxLib.libElementMod.Element
    ] = null,
    Parser: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ ParserOptions], Parser] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (Element != null) __obj.updateDynamic("Element")(Element)
    if (Parser != null) __obj.updateDynamic("Parser")(Parser)
    __obj.asInstanceOf[ParserOptions]
  }
}

