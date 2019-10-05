package typings.grommet.componentsButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Button", "Button")
@js.native
class Button protected ()
  extends Component[
      ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ])) = this()
  def this(
    props: ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Button", "Button")
@js.native
object Button extends TopLevel[
      ComponentClass[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ]), 
        ComponentState
      ]
    ]

