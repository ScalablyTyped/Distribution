package typings.grommet.componentsAnchorMod

import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLAnchorElement
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Anchor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Anchor: ComponentClass[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ]), 
    ComponentState
  ] = js.native
}

