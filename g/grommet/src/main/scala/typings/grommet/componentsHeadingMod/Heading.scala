package typings.grommet.componentsHeadingMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLHeadingElement
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Heading", "Heading")
@js.native
object Heading extends TopLevel[
      FC[
        HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
      ]
    ]

