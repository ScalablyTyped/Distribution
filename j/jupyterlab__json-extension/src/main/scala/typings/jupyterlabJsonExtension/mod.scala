package typings.jupyterlabJsonExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/json-extension", JSImport.Default)
  @js.native
  val default: IExtension | js.Array[IExtension] = js.native
  
  @JSImport("@jupyterlab/json-extension", "MIME_TYPE")
  @js.native
  val MIME_TYPE: /* "application/json" */ String = js.native
  
  @JSImport("@jupyterlab/json-extension", "RenderedJSON")
  @js.native
  class RenderedJSON protected ()
    extends IRenderer
       with IPrintable {
    /**
      * Create a new widget for rendering JSON.
      */
    def this(options: IRendererOptions) = this()
    
    /* private */ var _mimeType: js.Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
  }
  
  @JSImport("@jupyterlab/json-extension", "rendererFactory")
  @js.native
  val rendererFactory: IRendererFactory = js.native
  
  type _To = IExtension | js.Array[IExtension]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IExtension | js.Array[IExtension] = default
}
