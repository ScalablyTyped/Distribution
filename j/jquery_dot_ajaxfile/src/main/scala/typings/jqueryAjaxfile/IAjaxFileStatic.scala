package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAjaxFileStatic extends StObject {
  
  var DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any
  
  def send[T](option: IOption): IAjaxFilePromise[T]
}
object IAjaxFileStatic {
  
  @scala.inline
  def apply(
    DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any,
    send: IOption => IAjaxFilePromise[js.Any]
  ): IAjaxFileStatic = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[IAjaxFileStatic]
  }
  
  @scala.inline
  implicit class IAjaxFileStaticMutableBuilder[Self <: IAjaxFileStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: IOption => IAjaxFilePromise[js.Any]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
