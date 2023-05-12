package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "TestRendererSerializer")
@js.native
open class TestRendererSerializer () extends StObject {
  def this(options: ListrTestRendererOptions) = this()
  
  def generate[T /* <: ListrTaskEventType */](
    event: T,
    data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any
  ): TestRendererSerializerOutput[T] = js.native
  def generate[T /* <: ListrTaskEventType */](
    event: T,
    data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any,
    task: ListrTestRendererTask
  ): TestRendererSerializerOutput[T] = js.native
  
  var options: js.UndefOr[ListrTestRendererOptions] = js.native
  
  def serialize[T /* <: ListrTaskEventType */](
    event: T,
    data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any
  ): String = js.native
  def serialize[T /* <: ListrTaskEventType */](
    event: T,
    data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any,
    task: ListrTestRendererTask
  ): String = js.native
}
