package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsTextAreaMod.TextAreaProps
import typings.react.HTMLTextAreaElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
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

@JSImport("grommet", "TextArea")
@js.native
object TextArea extends TopLevel[
      ComponentClass[
        TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]), 
        ComponentState
      ]
    ]

