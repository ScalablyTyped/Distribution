package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAjaxFileStatic extends StObject {
  
  var DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ Any
  
  def send[T](option: IOption): IAjaxFilePromise[T]
}
object IAjaxFileStatic {
  
  inline def apply(
    DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ Any,
    send: IOption => IAjaxFilePromise[Any]
  ): IAjaxFileStatic = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[IAjaxFileStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAjaxFileStatic] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ Any): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setSend(value: IOption => IAjaxFilePromise[Any]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
