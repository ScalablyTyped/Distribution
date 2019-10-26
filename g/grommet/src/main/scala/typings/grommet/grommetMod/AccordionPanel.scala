package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsAccordionPanelMod.AccordionPanelProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "AccordionPanel")
@js.native
class AccordionPanel protected ()
  extends Component[
      AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "AccordionPanel")
@js.native
object AccordionPanel extends TopLevel[
      ComponentClass[
        AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

