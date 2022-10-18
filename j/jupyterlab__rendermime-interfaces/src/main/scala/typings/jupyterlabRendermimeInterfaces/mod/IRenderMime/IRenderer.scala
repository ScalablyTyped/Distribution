package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget which displays the contents of a mime model.
  */
@js.native
trait IRenderer extends Widget {
  
  /**
    * Render a mime model.
    *
    * @param model - The mime model to render.
    *
    * @returns A promise which resolves when rendering is complete.
    *
    * #### Notes
    * This method may be called multiple times during the lifetime
    * of the widget to update it if and when new data is available.
    */
  def renderModel(model: IMimeModel): js.Promise[Unit] = js.native
  
  /**
    * The application language translator.
    */
  var translator: js.UndefOr[ITranslator] = js.native
}
