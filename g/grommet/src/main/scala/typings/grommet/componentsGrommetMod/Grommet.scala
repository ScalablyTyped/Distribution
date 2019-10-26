package typings.grommet.componentsGrommetMod

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

@JSImport("grommet/components/Grommet", "Grommet")
@js.native
class Grommet protected ()
  extends Component[
      GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Grommet", "Grommet")
@js.native
object Grommet extends TopLevel[
      ComponentClass[
        GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

