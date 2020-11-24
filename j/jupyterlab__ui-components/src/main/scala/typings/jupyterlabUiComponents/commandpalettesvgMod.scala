package typings.jupyterlabUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/ui-components/lib/icon/widgets/commandpalettesvg", JSImport.Namespace)
@js.native
object commandpalettesvgMod extends js.Object {
  
  @js.native
  object CommandPaletteSvg extends js.Object {
    
    val defaultRenderer: Renderer = js.native
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.commandpaletteMod.CommandPalette.Renderer
  }
}
