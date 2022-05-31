package typings.jupyterlabImageviewer

import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewer")
  @js.native
  class ImageViewer protected ()
    extends Widget
       with IPrintable {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
    
    /* private */ var _colorinversion: js.Any = js.native
    
    /* private */ var _img: js.Any = js.native
    
    /* private */ var _matrix: js.Any = js.native
    
    /* private */ var _mimeType: js.Any = js.native
    
    /**
      * Handle a change to the title.
      */
    /* private */ var _onTitleChanged: js.Any = js.native
    
    /* private */ var _ready: js.Any = js.native
    
    /**
      * Render the widget content.
      */
    /* private */ var _render: js.Any = js.native
    
    /* private */ var _scale: js.Any = js.native
    
    /**
      * Update the image CSS style, including the transform and filter.
      */
    /* private */ var _updateStyle: js.Any = js.native
    
    /**
      * The color inversion of the image.
      */
    def colorinversion: Double = js.native
    def colorinversion_=(value: Double): Unit = js.native
    
    /**
      * The image widget's context.
      */
    val context: Context = js.native
    
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
      * Flip the image horizontally.
      */
    def flipHorizontal(): Unit = js.native
    
    /**
      * Flip the image vertically.
      */
    def flipVertical(): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
    /**
      * A promise that resolves when the image viewer is ready.
      */
    def ready: js.Promise[Unit] = js.native
    
    /**
      * Reset rotation and flip transformations.
      */
    def resetRotationFlip(): Unit = js.native
    
    /**
      * Rotate the image clockwise (right).
      */
    def rotateClockwise(): Unit = js.native
    
    /**
      * Rotate the image counter-clockwise (left).
      */
    def rotateCounterclockwise(): Unit = js.native
    
    /**
      * The scale factor for the image.
      */
    def scale: Double = js.native
    def scale_=(value: Double): Unit = js.native
  }
  
  @JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewerFactory")
  @js.native
  class ImageViewerFactory protected () extends ABCWidgetFactory[IDocumentWidget[ImageViewer, IModel], IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[ImageViewer, IModel]]) = this()
  }
}
