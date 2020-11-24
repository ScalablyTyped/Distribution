package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var connectTimeout: js.UndefOr[Double | Null] = js.native
  
  var connected: js.UndefOr[Boolean] = js.native
  
  var fetchMode: js.UndefOr[Double | Null] = js.native
  
  var odbc: js.UndefOr[ODBC] = js.native
  
  var queue: js.UndefOr[SimpleQueue | js.Array[_]] = js.native
  
  var systemNaming: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setConnectTimeoutNull: Self = this.set("connectTimeout", null)
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    
    @scala.inline
    def setFetchMode(value: Double): Self = this.set("fetchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchMode: Self = this.set("fetchMode", js.undefined)
    
    @scala.inline
    def setFetchModeNull: Self = this.set("fetchMode", null)
    
    @scala.inline
    def setOdbc(value: ODBC): Self = this.set("odbc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOdbc: Self = this.set("odbc", js.undefined)
    
    @scala.inline
    def setQueueVarargs(value: js.Any*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: SimpleQueue | js.Array[_]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setSystemNaming(value: Boolean): Self = this.set("systemNaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemNaming: Self = this.set("systemNaming", js.undefined)
  }
}
