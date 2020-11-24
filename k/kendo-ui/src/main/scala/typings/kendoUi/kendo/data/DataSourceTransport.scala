package typings.kendoUi.kendo.data

import typings.kendoUi.kendoUiStrings.create
import typings.kendoUi.kendoUiStrings.destroy
import typings.kendoUi.kendoUiStrings.read
import typings.kendoUi.kendoUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTransport extends js.Object {
  
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
  implicit class DataSourceTransportOps[Self <: DataSourceTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(
      value: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDestroyFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(
      value: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setParameterMap(
      value: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _
    ): Self = this.set("parameterMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParameterMap: Self = this.set("parameterMap", js.undefined)
    
    @scala.inline
    def setPush(value: js.Function): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setReadFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(
      value: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSignalrFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("signalr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignalr(value: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])): Self = this.set("signalr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalr: Self = this.set("signalr", js.undefined)
    
    @scala.inline
    def setSubmit(value: js.Function): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setUpdateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(
      value: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
