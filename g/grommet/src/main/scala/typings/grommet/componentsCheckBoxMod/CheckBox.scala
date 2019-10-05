package typings.grommet.componentsCheckBoxMod

import org.scalablytyped.runtime.TopLevel
import typings.react.HTMLInputElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/CheckBox", "CheckBox")
@js.native
class CheckBox protected ()
  extends Component[
      CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
  def this(
    props: CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/CheckBox", "CheckBox")
@js.native
object CheckBox extends TopLevel[
      ComponentClass[
        CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
        ComponentState
      ]
    ]

