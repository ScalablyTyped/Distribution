package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "WorkerPool")
@js.native
open class WorkerPool () extends StObject {
  
  def acquire(mapId: String): js.Array[WorkerInterface] = js.native
  def acquire(mapId: Double): js.Array[WorkerInterface] = js.native
  
  var active: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in number | string ]: boolean} */ js.Any = js.native
  
  def isPreloaded(): Boolean = js.native
  
  def numActive(): Double = js.native
  
  def release(mapId: String): scala.Unit = js.native
  def release(mapId: Double): scala.Unit = js.native
  
  var workers: js.Array[WorkerInterface] = js.native
}
/* static members */
object WorkerPool {
  
  @JSImport("maplibre-gl", "WorkerPool")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "WorkerPool.workerCount")
  @js.native
  def workerCount: Double = js.native
  inline def workerCount_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])
}
