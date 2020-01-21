package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.anchorMod.AnchorProps
import typings.grommet.grommetStrings.href
import typings.grommet.routedAnchorMod.RoutedAnchorProps
import typings.grommet.utilsMod.Omit
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
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

