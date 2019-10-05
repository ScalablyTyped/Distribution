package typings.grommet.componentsAnchorMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.utilsMod.Omit
import typings.react.HTMLAnchorElement
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Anchor", "Anchor")
@js.native
class Anchor protected ()
  extends Component[
      AnchorProps with (Omit[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        color
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: AnchorProps with (Omit[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        color
      ])) = this()
  def this(
    props: AnchorProps with (Omit[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Anchor", "Anchor")
@js.native
object Anchor extends TopLevel[
      ComponentClass[
        AnchorProps with (Omit[
          DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
          color
        ]), 
        ComponentState
      ]
    ]

