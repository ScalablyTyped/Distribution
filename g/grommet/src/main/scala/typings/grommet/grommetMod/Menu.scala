package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsMenuMod.MenuProps
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Menu")
@js.native
class Menu protected ()
  extends Component[
      MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement])) = this()
  def this(
    props: MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Menu")
@js.native
object Menu extends TopLevel[
      ComponentClass[
        MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
        ComponentState
      ]
    ]

