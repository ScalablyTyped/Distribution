package typings.kendoUi.kendo.data

import typings.kendoUi.kendoUiStrings.create
import typings.kendoUi.kendoUiStrings.destroy
import typings.kendoUi.kendoUiStrings.read
import typings.kendoUi.kendoUiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransport extends StObject {
  
  var batch: js.UndefOr[
    DataSourceTransportBatch | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  
  var create: js.UndefOr[
    String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  
  var destroy: js.UndefOr[
    String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  
  var parameterMap: js.UndefOr[
    js.Function2[
      /* data */ DataSourceTransportParameterMapData, 
      /* type */ create | destroy | read | update, 
      Any
    ]
  ] = js.undefined
  
  var push: js.UndefOr[js.Function] = js.undefined
  
  var read: js.UndefOr[
    String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  
  var submit: js.UndefOr[js.Function] = js.undefined
  
  var update: js.UndefOr[
    String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
}
object DataSourceTransport {
  
  inline def apply(): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceTransport] (val x: Self) extends AnyVal {
    
    inline def setBatch(value: DataSourceTransportBatch | (js.Function1[/* options */ DataSourceTransportOptions, Unit])): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCreate(
      value: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(
      value: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setParameterMap(
      value: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => Any
    ): Self = StObject.set(x, "parameterMap", js.Any.fromFunction2(value))
    
    inline def setParameterMapUndefined: Self = StObject.set(x, "parameterMap", js.undefined)
    
    inline def setPush(value: js.Function): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setRead(
      value: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSignalr(value: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])): Self = StObject.set(x, "signalr", value.asInstanceOf[js.Any])
    
    inline def setSignalrFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "signalr", js.Any.fromFunction1(value))
    
    inline def setSignalrUndefined: Self = StObject.set(x, "signalr", js.undefined)
    
    inline def setSubmit(value: js.Function): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setUpdate(
      value: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
