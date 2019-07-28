package typings.grommet.grommetMod

import typings.grommet.componentsTextAreaMod.TextAreaProps
import typings.react.HTMLTextAreaElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TextArea")
@js.native
class TextArea protected ()
  extends Component[
      TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])) = this()
  def this(
    props: TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]),
    context: js.Any
  ) = this()
}

