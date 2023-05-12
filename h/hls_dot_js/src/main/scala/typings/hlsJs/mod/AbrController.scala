package typings.hlsJs.mod

import typings.hlsJs.mod.Events.FRAG_BUFFERED
import typings.hlsJs.mod.Events.FRAG_LOADED
import typings.hlsJs.mod.Events.FRAG_LOADING
import typings.hlsJs.mod.Events.LEVEL_LOADED
import typings.hlsJs.mod.Events.LEVEL_SWITCHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "AbrController")
@js.native
open class AbrController protected ()
  extends StObject
     with AbrComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var _abandonRulesCheck: Any = js.native
  
  /* private */ var _nextAutoLevel: Any = js.native
  
  /* private */ var bitrateTestDelay: Any = js.native
  
  @JSName("bwEstimator")
  val bwEstimator_AbrController: EwmaBandWidthEstimator = js.native
  
  def clearTimer(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var findBestLevel: Any = js.native
  
  /* private */ var fragCurrent: Any = js.native
  
  /* private */ var getNextABRAutoLevel: Any = js.native
  
  /* private */ var getTimeToLoadFrag: Any = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* private */ var ignoreFragment: Any = js.native
  
  /* private */ var lastLevelLoadSec: Any = js.native
  
  /* private */ var lastLoadedFragLevel: Any = js.native
  
  /* CompleteClass */
  var nextAutoLevel: Double = js.native
  @JSName("nextAutoLevel")
  def nextAutoLevel_MAbrController: Double = js.native
  
  /* private */ var onCheck: Any = js.native
  
  /* protected */ def onFragBuffered(event: FRAG_BUFFERED, data: FragBufferedData): Unit = js.native
  
  /* protected */ def onFragLoaded(event: FRAG_LOADED, param1: FragLoadedData): Unit = js.native
  
  /* protected */ def onFragLoading(event: FRAG_LOADING, data: FragLoadingData): Unit = js.native
  
  /* protected */ def onLevelLoaded(event: LEVEL_LOADED, data: LevelLoadedData): Unit = js.native
  
  /* protected */ def onLevelSwitching(event: LEVEL_SWITCHING, data: LevelSwitchingData): Unit = js.native
  
  /* private */ var partCurrent: Any = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  /* private */ var timer: Any = js.native
  
  /* protected */ def unregisterListeners(): Unit = js.native
}
