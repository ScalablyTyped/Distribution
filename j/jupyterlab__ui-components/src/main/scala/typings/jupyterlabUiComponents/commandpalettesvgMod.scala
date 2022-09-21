package typings.jupyterlabUiComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandpalettesvgMod {
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/commandpalettesvg", "CommandPaletteSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.mod.CommandPalette.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/commandpalettesvg", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
  }
}
