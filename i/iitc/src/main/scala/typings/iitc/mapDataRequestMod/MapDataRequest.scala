package typings.iitc.mapDataRequestMod

import typings.iitc.dataCacheMod.DataCache
import typings.iitc.mapDataDebugMod.RenderDebugTiles
import typings.iitc.mapDataRenderMod.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iitc/core/map_data_request", "MapDataRequest")
@js.native
class MapDataRequest () extends js.Object {
  
  /**
    * delay before processing the queue after failed requests
    * longer delay before doing anything after errors (other than TIMEOUT)
    * @default 5
    */
  var BAD_REQUEST_RUN_QUEUE_DELAY: Double = js.native
  
   // = 5; //refresh time used after resuming from idle
  /**
    * after one of the above, there's an additional delay between preparing the refresh (clearing out of bounds,
    * processing cache, etc) and actually sending the first network requests
    * delay after preparing the data download before tile requests are sent
    * @default 1
    */
  var DOWNLOAD_DELAY: Double = js.native
  
  /**
    * delay before processing the queue after empty responses
    * also long delay - empty responses are likely due to some server issues
    * @default 5
    */
  var EMPTY_RESPONSE_RUN_QUEUE_DELAY: Double = js.native
  
  /**
    * minimum refresh time is based on the time to complete a data fetch, times this value
    * @default 2
    */
  var FETCH_TO_REFRESH_FACTOR: Double = js.native
  
   // = 3; //refresh time used on first load of IITC
  var IDLE_RESUME_REFRESH: Double = js.native
  
  /**
    * no more than this many requests in parallel. stock site seems to rely on browser limits (6, usually), sending
    * many requests at once.
    * using our own queue limit ensures that other requests (e.g. chat, portal details) don't get delayed
    * @default 5
    */
  var MAX_REQUESTS: Double = js.native
  
  /**
    * number of times to retry a tile after an error (including "error: TIMEOUT" now - as stock intel does)
    * TODO? different retry counters for TIMEOUT vs other errors..?
    * @default 5
    */
  var MAX_TILE_RETRIES: Double = js.native
  
  // refresh timers
  var MOVE_REFRESH: Double = js.native
  
  /**
    * this many tiles in one request
    * @default 25
    */
  var NUM_TILES_PER_REQUEST: Double = js.native
  
  /**
    * refresh time to use for close views z>12 when not idle and not moving
    * @default 300
    */
  var REFRESH_CLOSE: Double = js.native
  
  /**
    * refresh time for far views z <= 12
    * @default 900
    */
  var REFRESH_FAR: Double = js.native
  
  /**
    * render queue
    * number of items to process in each render pass. there are pros and cons to smaller and larger values
    * (however, if using leaflet canvas rendering, it makes sense to push as much as possible through every time)
    */
  var RENDER_BATCH_SIZE: Double = js.native
  
  /**
    * delay before repeating the render loop. this gives a better chance for user interaction
    * 0.1sec desktop, 0.2sec mobile
    */
  var RENDER_PAUSE: Double = js.native
  
  /**
    * a short delay between one request finishing and the queue being run for the next request.
    * @default 0
    */
  var RUN_QUEUE_DELAY: Double = js.native
  
   // = 3; //time, after a map move (pan/zoom) before starting the refresh processing
  var STARTUP_REFRESH: Double = js.native
  
  /**
    * delay before processing the queue after error==TIMEOUT requests. this is 'expected', so minimal extra delay over the regular RUN_QUEUE_DELAY
    * @default 0
    */
  var TIMEOUT_REQUEST_RUN_QUEUE_DELAY: Double = js.native
  
  var activeRequestCount: Double = js.native
  
  var cache: DataCache = js.native
  
  var cachedTileCount: Double = js.native
  
  def clearTimeout(): Unit = js.native
  
  var debugTiles: RenderDebugTiles = js.native
  
  def delayProcessRequestQueue(delayInSeconds: Double): Unit = js.native
  
  var failedTileCount: Double = js.native
  
  /** store the parameters used for fetching the data. used to prevent unneeded refreshes after move/zoom */
  var fetchedDataParams: js.Any = js.native
  
  def getStatus(): MapDataRequestStatus = js.native
  
  /* private */ def handleResponse(data: js.Any, tiles: js.Array[String], success: Boolean): Unit = js.native
  
  var idle: Boolean = js.native
  
  def idleResume(): Unit = js.native
  
  def mapMoveEnd(): Unit = js.native
  
  def mapMoveStart(): Unit = js.native
  
  def pauseRenderQueue(pauseInSeconds: Double): Unit = js.native
  
  def processRenderQueue(): Unit = js.native
  
  def processRequestQueue(): Unit = js.native
  
  def pushRenderQueue(id: String, data: js.Any, status: js.Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def refreshOnTimeout(delayInSeconds: Double): Unit = js.native
  
  var render: Render = js.native
  
  var renderQueue: js.Array[js.Any] = js.native
  
  var renderQueuePaused: Boolean = js.native
  
  var renderQueueTimer: js.UndefOr[Double] = js.native
  
  var requestedTileCount: Double = js.native
  
  def requeueTile(id: String, error: Boolean): Unit = js.native
  
  def resetRenderQueue(): Unit = js.native
  
  def sendTileRequest(tiles: js.Array[String]): Unit = js.native
  
  def setStatus(short: String): Unit = js.native
  def setStatus(short: String, long: js.UndefOr[scala.Nothing], progress: Double): Unit = js.native
  def setStatus(short: String, long: String): Unit = js.native
  def setStatus(short: String, long: String, progress: Double): Unit = js.native
  
  var staleTileCount: Double = js.native
  
  def start(): Unit = js.native
  
  def startQueueTimer(delayInSecond: Double): Unit = js.native
  
  var status: MapDataRequestStatus = js.native
  
  var successTileCount: Double = js.native
}
