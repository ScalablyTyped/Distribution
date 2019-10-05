package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsAnchorMod.AnchorProps
import typings.grommet.componentsRoutedAnchorMod.RoutedAnchorProps
import typings.grommet.grommetStrings.href
import typings.grommet.utilsMod.Omit
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RoutedAnchor")
@js.native
class RoutedAnchor protected ()
  extends Component[RoutedAnchorProps with (Omit[AnchorProps, href]), ComponentState, js.Any] {
  def this(props: RoutedAnchorProps with (Omit[AnchorProps, href])) = this()
  def this(props: RoutedAnchorProps with (Omit[AnchorProps, href]), context: js.Any) = this()
}

@JSImport("grommet", "RoutedAnchor")
@js.native
object RoutedAnchor extends TopLevel[ComponentClass[RoutedAnchorProps with (Omit[AnchorProps, href]), ComponentState]]

