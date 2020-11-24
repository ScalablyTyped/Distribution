package typings.lovefield.mod.schema

import typings.lovefield.mod.raw.BackStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends js.Object {
  
  var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.native
  
  var storeType: js.UndefOr[DataStoreType] = js.native
  
  var webSqlDbSize: js.UndefOr[Double] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setOnUpgrade(value: /* rawDb */ BackStore => js.Promise[Unit]): Self = this.set("onUpgrade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpgrade: Self = this.set("onUpgrade", js.undefined)
    
    @scala.inline
    def setStoreType(value: DataStoreType): Self = this.set("storeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreType: Self = this.set("storeType", js.undefined)
    
    @scala.inline
    def setWebSqlDbSize(value: Double): Self = this.set("webSqlDbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSqlDbSize: Self = this.set("webSqlDbSize", js.undefined)
  }
}
