package typings.grommet.componentsTabMod

import typings.grommet.grommetStrings.title
import typings.grommet.utilsMod.Omit
import typings.react.HTMLButtonElement
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Tab", "Tab")
@js.native
class Tab protected ()
  extends Component[
      TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ])) = this()
  def this(
    props: TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]),
    context: js.Any
  ) = this()
}

