package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginManager extends StObject {
  
  def addFileManager(fileManager: FileManager): Unit = js.native
  
  def addPreProcessor(preProcessor: PreProcessor): Unit = js.native
  def addPreProcessor(preProcessor: PreProcessor, priority: Double): Unit = js.native
}
