package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.worldMapMod.WorldMapProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "WorldMap")
@js.native
class WorldMap protected ()
  extends Component[WorldMapProps with SVGProps[SVGSVGElement], ComponentState, js.Any] {
  def this(props: WorldMapProps with SVGProps[SVGSVGElement]) = this()
  def this(props: WorldMapProps with SVGProps[SVGSVGElement], context: js.Any) = this()
}

@JSImport("grommet/es6", "WorldMap")
@js.native
object WorldMap extends TopLevel[ComponentClass[WorldMapProps with SVGProps[SVGSVGElement], ComponentState]]

