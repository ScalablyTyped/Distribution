package typings.kendoUi.kendo.data

import typings.kendoUi.kendoUiStrings.create
import typings.kendoUi.kendoUiStrings.destroy
import typings.kendoUi.kendoUiStrings.read
import typings.kendoUi.kendoUiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransport extends StObject {
  
  var create: js.UndefOr[
    String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  
  var destroy: js.UndefOr[
    String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  
  var parameterMap: js.UndefOr[
    js.Function2[
      /* data */ DataSourceTransportParameterMapData, 
      /* type */ create | destroy | read | update, 
      _
    ]
  ] = js.native
  
  var push: js.UndefOr[js.Function] = js.native
  
  var read: js.UndefOr[
    String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  
  var submit: js.UndefOr[js.Function] = js.native
  
  var update: js.UndefOr[
    String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
}
object DataSourceTransport {
  
  @scala.inline
  def apply(): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransport]
  }
  
  @scala.inline
  implicit class DataSourceTransportMutableBuilder[Self <: DataSourceTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(
      value: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setParameterMap(
      value: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _
    ): Self = StObject.set(x, "parameterMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParameterMapUndefined: Self = StObject.set(x, "parameterMap", js.undefined)
    
    @scala.inline
    def setPush(value: js.Function): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setRead(
      value: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSignalr(value: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])): Self = StObject.set(x, "signalr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalrFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "signalr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignalrUndefined: Self = StObject.set(x, "signalr", js.undefined)
    
    @scala.inline
    def setSubmit(value: js.Function): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
