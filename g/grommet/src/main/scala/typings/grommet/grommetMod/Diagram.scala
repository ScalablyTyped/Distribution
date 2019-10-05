package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsDiagramMod.DiagramProps
import typings.react.SVGSVGElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Diagram")
@js.native
class Diagram protected ()
  extends Component[DiagramProps with SVGProps[SVGSVGElement], ComponentState, js.Any] {
  def this(props: DiagramProps with SVGProps[SVGSVGElement]) = this()
  def this(props: DiagramProps with SVGProps[SVGSVGElement], context: js.Any) = this()
}

@JSImport("grommet", "Diagram")
@js.native
object Diagram extends TopLevel[ComponentClass[DiagramProps with SVGProps[SVGSVGElement], ComponentState]]

