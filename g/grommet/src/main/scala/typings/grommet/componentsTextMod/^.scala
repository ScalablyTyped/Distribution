package typings.grommet.componentsTextMod

import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLSpanElement
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FC
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Text: FC[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = js.native
}

