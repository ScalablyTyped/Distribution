package typings.grommet.componentsParagraphMod

import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLParagraphElement
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Paragraph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Paragraph: FC[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = js.native
}

