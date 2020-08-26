package typings.grommet.checkBoxGroupMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.boxMod.BoxProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/CheckBoxGroup", "CheckBoxGroup")
@js.native
class CheckBoxGroup protected ()
  extends Component[
      CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/es6/components/CheckBoxGroup", "CheckBoxGroup")
@js.native
object CheckBoxGroup extends TopLevel[
      ComponentClass[
        CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

