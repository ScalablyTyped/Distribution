package typings.grommet.componentsButtonMod

import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Button: ComponentClass[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ]), 
    ComponentState
  ] = js.native
}

