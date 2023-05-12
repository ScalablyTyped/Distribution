package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "ContentSteeringController")
@js.native
open class ContentSteeringController protected ()
  extends StObject
     with NetworkComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var audioTracks: Any = js.native
  
  /* private */ var clonePathways: Any = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var enabled: Any = js.native
  
  def filterParsedLevels(levels: js.Array[Level]): js.Array[Level] = js.native
  
  /* private */ var getLevelsForPathway: Any = js.native
  
  /* private */ val hls: Any = js.native
  
  /* private */ var levels: Any = js.native
  
  /* private */ var loadSteeringManifest: Any = js.native
  
  /* private */ var loader: Any = js.native
  
  /* private */ var log: Any = js.native
  
  /* private */ var onError: Any = js.native
  
  /* private */ var onManifestLoaded: Any = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* private */ var onManifestParsed: Any = js.native
  
  /* private */ var pathwayId: Any = js.native
  
  /* private */ var pathwayPriority: Any = js.native
  
  /* private */ var penalizedPathways: Any = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var reloadTimer: Any = js.native
  
  def removeLevel(levelToRemove: Level): Unit = js.native
  
  /* private */ var scheduleRefresh: Any = js.native
  
  def startLoad(): Unit = js.native
  /* CompleteClass */
  override def startLoad(startPosition: Double): Unit = js.native
  
  /* private */ var started: Any = js.native
  
  /* CompleteClass */
  override def stopLoad(): Unit = js.native
  
  /* private */ var subtitleTracks: Any = js.native
  
  /* private */ var timeToLoad: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
  
  /* private */ var updatePathwayPriority: Any = js.native
  
  /* private */ var updated: Any = js.native
  
  /* private */ var uri: Any = js.native
}
