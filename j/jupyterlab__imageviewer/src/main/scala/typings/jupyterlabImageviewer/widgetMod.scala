package typings.jupyterlabImageviewer

import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    var _colorinversion: js.Any = js.native
    
    var _img: js.Any = js.native
    
    var _matrix: js.Any = js.native
    
    var _mimeType: js.Any = js.native
    
    /**
      * Handle a change to the title.
      */
    var _onTitleChanged: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Render the widget content.
      */
    var _render: js.Any = js.native
    
    var _scale: js.Any = js.native
    
    /**
      * Update the image CSS style, including the transform and filter.
      */
    var _updateStyle: js.Any = js.native
    
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
