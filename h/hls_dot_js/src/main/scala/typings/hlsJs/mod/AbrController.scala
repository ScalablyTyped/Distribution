package typings.hlsJs.mod

import typings.hlsJs.mod.Events.ERROR
import typings.hlsJs.mod.Events.FRAG_BUFFERED
import typings.hlsJs.mod.Events.FRAG_LOADED
import typings.hlsJs.mod.Events.FRAG_LOADING
import typings.hlsJs.mod.Events.LEVEL_LOADED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbrController
  extends StObject
     with ComponentAPI {
  
  /* private */ var _abandonRulesCheck: Any = js.native
  
  /* private */ var _nextAutoLevel: Any = js.native
  
  /* private */ var bitrateTestDelay: Any = js.native
  
  val bwEstimator: EwmaBandWidthEstimator = js.native
  
  def clearTimer(): Unit = js.native
  
  /* private */ var findBestLevel: Any = js.native
  
  /* private */ var fragCurrent: Any = js.native
  
  /* private */ var getNextABRAutoLevel: Any = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* private */ var lastLoadedFragLevel: Any = js.native
  
  def nextAutoLevel: Double = js.native
  def nextAutoLevel_=(nextLevel: Double): Unit = js.native
  
  /* private */ var onCheck: Any = js.native
  
  /* protected */ def onError(event: ERROR, data: ErrorData): Unit = js.native
  
  /* protected */ def onFragBuffered(event: FRAG_BUFFERED, data: FragBufferedData): Unit = js.native
  
  /* protected */ def onFragLoaded(event: FRAG_LOADED, hasFragPart: FragLoadedData): Unit = js.native
  
  /* protected */ def onFragLoading(event: FRAG_LOADING, data: FragLoadingData): Unit = js.native
  
  /* protected */ def onLevelLoaded(event: LEVEL_LOADED, data: LevelLoadedData): Unit = js.native
  
  /* private */ var partCurrent: Any = js.native
  
  /* protected */ def registerListeners(): Unit = js.native
  
  /* private */ var timer: Any = js.native
  
  /* protected */ def unregisterListeners(): Unit = js.native
}
