package typings.hlsJs.mod

import typings.hlsJs.anon.Height
import typings.hlsJs.mod.Events.BUFFER_CODECS
import typings.hlsJs.mod.Events.FPS_DROP_LEVEL_CAPPING
import typings.hlsJs.mod.Events.MANIFEST_PARSED
import typings.hlsJs.mod.Events.MEDIA_ATTACHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "CapLevelController")
@js.native
open class CapLevelController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var autoLevelCapping: Any = js.native
  
  /* private */ var clientRect: Any = js.native
  
  def contentScaleFactor: Double = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  def detectPlayerSize(): Unit = js.native
  
  /* private */ var firstLevel: Any = js.native
  
  def getDimensions(): Height = js.native
  
  def getMaxLevel(capLevelIndex: Double): Double = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var isLevelAllowed: Any = js.native
  
  /* private */ var media: Any = js.native
  
  def mediaHeight: Double = js.native
  
  def mediaWidth: Double = js.native
  
  /* protected */ def onBufferCodecs(event: BUFFER_CODECS, data: BufferCodecsData): Unit = js.native
  
  /* protected */ def onFpsDropLevelCapping(event: FPS_DROP_LEVEL_CAPPING, data: FPSDropLevelCappingData): Unit = js.native
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  /* private */ var restrictedLevels: Any = js.native
  
  def setStreamController(streamController: StreamController): Unit = js.native
  
  def startCapping(): Unit = js.native
  
  def stopCapping(): Unit = js.native
  
  /* private */ var streamController: Any = js.native
  
  /* private */ var timer: Any = js.native
  
  /* protected */ def unregisterListener(): Unit = js.native
}
/* static members */
object CapLevelController {
  
  @JSImport("hls.js", "CapLevelController")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxLevelByMediaSize(levels: js.Array[Level], width: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLevelByMediaSize")(levels.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
}
