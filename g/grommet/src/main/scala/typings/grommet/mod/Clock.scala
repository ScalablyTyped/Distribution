package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.clockMod.ClockProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGProps
import typings.std.HTMLDivElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Clock")
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

@JSImport("grommet/es6", "Clock")
@js.native
object Clock extends TopLevel[
      ComponentClass[
        ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
        ComponentState
      ]
    ]

