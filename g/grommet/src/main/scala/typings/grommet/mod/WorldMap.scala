package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.color
import typings.grommet.worldMapMod.WorldMapProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SVGProps
import typings.std.Omit
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet", "WorldMap")
@js.native
class WorldMap protected ()
  extends Component[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), ComponentState, js.Any] {
  def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color])) = this()
  def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), context: js.Any) = this()
}
@JSImport("grommet", "WorldMap")
@js.native
object WorldMap extends TopLevel[
      ComponentClass[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), ComponentState]
    ]
