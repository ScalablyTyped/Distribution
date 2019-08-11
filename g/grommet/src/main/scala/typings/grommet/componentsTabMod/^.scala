package typings.grommet.componentsTabMod

import typings.grommet.grommetStrings.title
import typings.grommet.utilsMod.Omit
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Tab", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Tab: ComponentClass[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ]), 
    ComponentState
  ] = js.native
}

