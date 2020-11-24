package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timings extends js.Object {
  
  /**
    * Time spent in a queue waiting for a network connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var blocked: js.UndefOr[Double] = js.native
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Time required to create TCP connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var connect: js.UndefOr[Double] = js.native
  
  /**
    * DNS resolution time. The time required to resolve a host name.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var dns: js.UndefOr[Double] = js.native
  
  /**
    * Time required to read entire response from the server (or cache).
    *
    * _Not optional and must have non-negative values._
    */
  var receive: Double = js.native
  
  /**
    * Time required to send HTTP request to the server.
    *
    * _Not optional and must have non-negative values._
    */
  var send: js.UndefOr[Double] = js.native
  
  /**
    * Time required for SSL/TLS negotiation.
    *
    * If this field is defined then the time is also included in the connect
    * field (to ensure backward compatibility with HAR 1.1).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var ssl: js.UndefOr[Double] = js.native
  
  /**
    * Waiting for a response from the server.
    *
    * _Not optional and must have non-negative values._
    */
  @JSName("wait")
  var wait_FTimings: Double = js.native
}
object Timings {
  
  @scala.inline
  def apply(receive: Double, wait: Double): Timings = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timings]
  }
  
  @scala.inline
  implicit class TimingsOps[Self <: Timings] (val x: Self) extends AnyVal {
    
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
    def setReceive(value: Double): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked(value: Double): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocked: Self = this.set("blocked", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setConnect(value: Double): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setDns(value: Double): Self = this.set("dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDns: Self = this.set("dns", js.undefined)
    
    @scala.inline
    def setSend(value: Double): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    
    @scala.inline
    def setSsl(value: Double): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
}
