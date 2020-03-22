package typings.jupyterlabUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/widgets/commandpalettesvg", JSImport.Namespace)
@js.native
object commandpalettesvgMod extends js.Object {
  @js.native
  object CommandPaletteSvg extends js.Object {
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer
    
    val defaultRenderer: Renderer = js.native
  }
  
}

