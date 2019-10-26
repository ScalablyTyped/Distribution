package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsCalendarMod.CalendarProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Calendar")
@js.native
class Calendar protected ()
  extends Component[
      CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Calendar")
@js.native
object Calendar extends TopLevel[
      ComponentClass[
        CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

