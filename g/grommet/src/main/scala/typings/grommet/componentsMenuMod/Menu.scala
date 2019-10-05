package typings.grommet.componentsMenuMod

import org.scalablytyped.runtime.TopLevel
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Menu", "Menu")
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

@JSImport("grommet/components/Menu", "Menu")
@js.native
object Menu extends TopLevel[
      ComponentClass[
        MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
        ComponentState
      ]
    ]

