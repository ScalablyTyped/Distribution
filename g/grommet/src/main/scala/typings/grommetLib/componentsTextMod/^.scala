package typings
package grommetLib.componentsTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Text: reactLib.reactMod.FC[
    TextProps with (grommetLib.utilsMod.Omit[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.HTMLAttributes[reactLib.HTMLSpanElement], 
        reactLib.HTMLSpanElement
      ], 
      grommetLib.grommetLibStrings.color
    ])
  ] = js.native
}

