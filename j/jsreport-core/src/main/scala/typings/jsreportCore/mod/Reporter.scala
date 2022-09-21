package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter
  extends StObject
     with ReporterInstance {
  
  def addPathToWatchForAutoCleanup(customPath: String): Unit = js.native
  
  def addRequestContextMetaConfig(property: Any, options: Any): Unit = js.native
  
  def afterConfigLoaded(cb: js.Function0[Unit]): Reporter = js.native
  
  def checkValidEntityName(c: String, doc: Any, req: Request): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def createError(message: String): Any = js.native
  def createError(message: String, options: Any): Any = js.native
  
  def createListenerCollection(): ListenerCollection = js.native
  
  def discover(): Reporter = js.native
  
  def ensureTempDirectoryExists(): js.Promise[TempDirectoryResult] = js.native
  
  def executeScript(inputs: Any, options: Any, req: Request): js.Promise[Any] = js.native
  
  def extensionsLoad(opts: Any): js.Promise[Reporter] = js.native
  
  def getAvailableRenderTimeout(req: Request, defaultValue: Double): Double = js.native
  
  def getPathsToWatchForAutoCleanup(): js.Array[String] = js.native
  
  def getRequestContextMetaConfig(property: Any): Any = js.native
  
  def init(): js.Promise[Reporter] = js.native
  
  def readTempFile(filename: String, opts: Any): js.Promise[ReadTempFileResult] = js.native
  
  def readTempFileStream(filename: String, opts: Any): js.Promise[ReadTempFileStreamResult] = js.native
  
  def render(request: Request): js.Promise[Response] = js.native
  def render(request: Request, parent: Request): js.Promise[Response] = js.native
  
  def silentLogs(logger: Any): Unit = js.native
  
  def use(`extension`: Extension): Reporter = js.native
  def use(`extension`: ExtensionDefinition): Reporter = js.native
  
  def writeTempFile(filenameFn: js.Function0[String], content: Any, opts: Any): js.Promise[WriteFileResult] = js.native
  
  def writeTempFileStream(filenameFn: js.Function0[String], opts: Any): js.Promise[WriteFileStreamResult] = js.native
}
