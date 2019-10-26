package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsTabMod.TabProps
import typings.grommet.grommetStrings.title
import typings.grommet.utilsMod.Omit
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Tab")
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

@JSImport("grommet", "Tab")
@js.native
object Tab extends TopLevel[
      ComponentClass[
        TabProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          title
        ]), 
        ComponentState
      ]
    ]

