package typings.grommet.componentsListMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/List", "List")
@js.native
class List protected ()
  extends Component[
      ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
  def this(
    props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/List", "List")
@js.native
object List extends TopLevel[
      ComponentClass[
        ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
        ComponentState
      ]
    ]

