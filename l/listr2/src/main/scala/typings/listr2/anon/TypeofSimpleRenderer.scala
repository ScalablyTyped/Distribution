package typings.listr2.anon

import typings.listr2.mod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSimpleRenderer extends StObject {
  
  /* static member */
  def formatTitle(): String = js.native
  def formatTitle(
    task: Task[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SimpleRenderer */ js.Any
    ]
  ): String = js.native
  
  /* static member */
  var nonTTY: Boolean = js.native
  
  /* static member */
  def now(): js.Date = js.native
  
  /* static member */
  var rendererOptions: Output = js.native
}
