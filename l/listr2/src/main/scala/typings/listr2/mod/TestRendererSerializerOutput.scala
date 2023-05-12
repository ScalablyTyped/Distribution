package typings.listr2.mod

import typings.listr2.anon.PartialRecordTestRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRendererSerializerOutput[T /* <: ListrTaskEventType */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any
  
  var event: T
  
  var task: js.UndefOr[PartialRecordTestRenderer] = js.undefined
}
object TestRendererSerializerOutput {
  
  inline def apply[T /* <: ListrTaskEventType */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any,
    event: T
  ): TestRendererSerializerOutput[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRendererSerializerOutput[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestRendererSerializerOutput[?], T /* <: ListrTaskEventType */] (val x: Self & TestRendererSerializerOutput[T]) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: listr2.listr2.ListrTaskEventMap[T] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setTask(value: PartialRecordTestRenderer): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
