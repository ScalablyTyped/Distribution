package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.boxMod.BoxProps
import typings.grommet.radioButtonGroupMod.RadioButtonGroupProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "RadioButtonGroup")
@js.native
class RadioButtonGroup protected ()
  extends Component[
      RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/es6", "RadioButtonGroup")
@js.native
object RadioButtonGroup extends TopLevel[
      ComponentClass[
        RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

