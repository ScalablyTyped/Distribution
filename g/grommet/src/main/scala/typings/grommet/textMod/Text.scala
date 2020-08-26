package typings.grommet.textMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/Text", "Text")
@js.native
object Text extends TopLevel[
      FC[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]

