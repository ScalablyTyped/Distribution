package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsClockMod.ClockProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.SVGProps
import typings.std.HTMLDivElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Clock")
@js.native
class Clock protected ()
  extends Component[
      ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])) = this()
  def this(
    props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Clock")
@js.native
object Clock extends TopLevel[
      ComponentClass[
        ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
        ComponentState
      ]
    ]

