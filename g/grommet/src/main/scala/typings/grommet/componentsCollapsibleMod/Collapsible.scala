package typings.grommet.componentsCollapsibleMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Collapsible", "Collapsible")
@js.native
class Collapsible protected ()
  extends Component[
      CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Collapsible", "Collapsible")
@js.native
object Collapsible extends TopLevel[
      ComponentClass[
        CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

