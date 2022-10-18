package typings.html2canvas

import typings.std.HTMLImageElement
import typings.std.Node
import typings.std.SVGForeignObjectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreFeaturesMod {
  
  @JSImport("html2canvas/dist/types/core/features", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FEATURES {
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_CORS_IMAGES")
    @js.native
    val SUPPORT_CORS_IMAGES: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_CORS_XHR")
    @js.native
    val SUPPORT_CORS_XHR: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_FOREIGNOBJECT_DRAWING")
    @js.native
    val SUPPORT_FOREIGNOBJECT_DRAWING: js.Promise[Boolean] = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_NATIVE_TEXT_SEGMENTATION")
    @js.native
    val SUPPORT_NATIVE_TEXT_SEGMENTATION: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_RANGE_BOUNDS")
    @js.native
    val SUPPORT_RANGE_BOUNDS: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_RESPONSE_TYPE")
    @js.native
    val SUPPORT_RESPONSE_TYPE: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_SVG_DRAWING")
    @js.native
    val SUPPORT_SVG_DRAWING: Boolean = js.native
    
    @JSImport("html2canvas/dist/types/core/features", "FEATURES.SUPPORT_WORD_BREAKING")
    @js.native
    val SUPPORT_WORD_BREAKING: Boolean = js.native
  }
  
  inline def createForeignObjectSVG(width: Double, height: Double, x: Double, y: Double, node: Node): SVGForeignObjectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createForeignObjectSVG")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[SVGForeignObjectElement]
  
  inline def loadSerializedSVG(svg: Node): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSerializedSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
}
