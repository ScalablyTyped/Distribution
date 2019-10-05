package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsTextMod.TextProps
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLSpanElement
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Text")
@js.native
object Text extends TopLevel[
      FC[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]

