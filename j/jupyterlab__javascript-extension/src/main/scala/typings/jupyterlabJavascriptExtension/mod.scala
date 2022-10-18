package typings.jupyterlabJavascriptExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabRendermime.mod.RenderedJavaScript
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/javascript-extension", JSImport.Default)
  @js.native
  val default: IExtension = js.native
  
  @JSImport("@jupyterlab/javascript-extension", "APPLICATION_JAVASCRIPT_MIMETYPE")
  @js.native
  val APPLICATION_JAVASCRIPT_MIMETYPE: /* "application/javascript" */ String = js.native
  
  @JSImport("@jupyterlab/javascript-extension", "ExperimentalRenderedJavascript")
  @js.native
  open class ExperimentalRenderedJavascript protected () extends RenderedJavaScript {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/javascript-extension", "TEXT_JAVASCRIPT_MIMETYPE")
  @js.native
  val TEXT_JAVASCRIPT_MIMETYPE: /* "text/javascript" */ String = js.native
  
  @JSImport("@jupyterlab/javascript-extension", "rendererFactory")
  @js.native
  val rendererFactory: IRendererFactory = js.native
  
  type _To = IExtension
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IExtension = default
}
