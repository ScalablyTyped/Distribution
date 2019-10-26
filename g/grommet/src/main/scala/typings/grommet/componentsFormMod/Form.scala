package typings.grommet.componentsFormMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FormHTMLAttributes
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Form", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement])) = this()
  def this(
    props: FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Form", "Form")
@js.native
object Form extends TopLevel[
      ComponentClass[
        FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
        ComponentState
      ]
    ]

