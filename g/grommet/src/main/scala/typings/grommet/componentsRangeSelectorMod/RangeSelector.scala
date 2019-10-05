package typings.grommet.componentsRangeSelectorMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLDivElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RangeSelector", "RangeSelector")
@js.native
class RangeSelector protected ()
  extends Component[
      RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])) = this()
  def this(
    props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/RangeSelector", "RangeSelector")
@js.native
object RangeSelector extends TopLevel[
      ComponentClass[
        RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
        ComponentState
      ]
    ]

