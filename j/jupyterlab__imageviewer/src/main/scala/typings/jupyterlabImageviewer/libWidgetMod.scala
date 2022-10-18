package typings.jupyterlabImageviewer

import typings.jupyterlabApputils.libPrintingMod.Printing.IPrintable
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewer")
  @js.native
  open class ImageViewer protected ()
    extends Widget
       with IPrintable {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
    
    /* private */ var _colorinversion: Any = js.native
    
    /* private */ var _img: Any = js.native
    
    /* private */ var _matrix: Any = js.native
    
    /* private */ var _mimeType: Any = js.native
    
    /**
      * Handle a change to the title.
      */
    /* private */ var _onTitleChanged: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /**
      * Render the widget content.
      */
    /* private */ var _render: Any = js.native
    
    /* private */ var _scale: Any = js.native
    
    /**
      * Update the image CSS style, including the transform and filter.
      */
    /* private */ var _updateStyle: Any = js.native
    
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
    /* CompleteClass */
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
  open class ImageViewerFactory protected () extends ABCWidgetFactory[IDocumentWidget[ImageViewer, IModel], IModel] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[ImageViewer, IModel]]) = this()
  }
}
