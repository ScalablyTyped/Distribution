package typings.hlsJs.mod

import typings.hlsJs.anon.Height
import typings.hlsJs.mod.Events.BUFFER_CODECS
import typings.hlsJs.mod.Events.FPS_DROP_LEVEL_CAPPING
import typings.hlsJs.mod.Events.MANIFEST_PARSED
import typings.hlsJs.mod.Events.MEDIA_ATTACHING
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapLevelController
  extends StObject
     with ComponentAPI {
  
  var autoLevelCapping: Double = js.native
  
  var clientRect: Height | Null = js.native
  
  def contentScaleFactor: Double = js.native
  
  def detectPlayerSize(): Unit = js.native
  
  var firstLevel: Double = js.native
  
  def getDimensions(): Height = js.native
  
  def getMaxLevel(capLevelIndex: Double): Double = js.native
  
  /* private */ var hls: Any = js.native
  
  var media: HTMLVideoElement | Null = js.native
  
  def mediaHeight: Double = js.native
  
  def mediaWidth: Double = js.native
  
  /* protected */ def onBufferCodecs(event: BUFFER_CODECS, data: BufferCodecsData): Unit = js.native
  
  /* protected */ def onFpsDropLevelCapping(event: FPS_DROP_LEVEL_CAPPING, data: FPSDropLevelCappingData): Unit = js.native
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit = js.native
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  var restrictedLevels: js.Array[Double] = js.native
  
  def setStreamController(streamController: StreamController): Unit = js.native
  
  def startCapping(): Unit = js.native
  
  def stopCapping(): Unit = js.native
  
  /* private */ var streamController: Any = js.native
  
  var timer: js.UndefOr[Double] = js.native
  
  /* protected */ def unregisterListener(): Unit = js.native
}
