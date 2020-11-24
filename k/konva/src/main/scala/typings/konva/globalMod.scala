package typings.konva

import typings.konva.anon.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  
  val glob: js.Any = js.native
  
  @JSName("_parseUA")
  def parseUA(userAgent: js.Any): Browser = js.native
  
  @JSName("_registerNode")
  def registerNode(NodeClass: js.Any): Unit = js.native
  
  @js.native
  object Konva extends js.Object {
    
    var UA: Browser = js.native
    
    var _global: js.Any = js.native
    
    def _injectGlobal(Konva: js.Any): Unit = js.native
    
    def _parseUA(userAgent: js.Any): Browser = js.native
    
    var _pointerEventsEnabled: Boolean = js.native
    
    var angleDeg: Boolean = js.native
    
    var captureTouchEventsEnabled: Boolean = js.native
    
    var dblClickWindow: Double = js.native
    
    var document: js.Any = js.native
    
    var dragButtons: js.Array[Double] = js.native
    
    var dragDistance: Double = js.native
    
    var enableTrace: Boolean = js.native
    
    def getAngle(angle: js.Any): js.Any = js.native
    
    var hitOnDragEnabled: Boolean = js.native
    
    var inDblClickWindow: Boolean = js.native
    
    var isBrowser: Boolean = js.native
    
    def isDragReady(): Boolean = js.native
    
    def isDragging(): js.Any = js.native
    
    var isUnminified: Boolean = js.native
    
    var listenClickTap: Boolean = js.native
    
    var pixelRatio: js.Any = js.native
    
    var showWarnings: Boolean = js.native
    
    var version: String = js.native
  }
}
