package typings.grommet.componentsDropButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsButtonMod.ButtonProps
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
class DropButton protected ()
  extends Component[
      DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ])) = this()
  def this(
    props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
object DropButton extends TopLevel[
      ComponentClass[
        DropButtonProps with ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ]), 
        ComponentState
      ]
    ]

