package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait SchemaHandler extends js.Object {
  
  /**
    * One and only one of the following should be specified. Exec specifies the
    * action to take. +optional
    */
  var exec: js.UndefOr[SchemaExecAction] = js.native
  
  /**
    * HTTPGet specifies the http request to perform. +optional
    */
  var httpGet: js.UndefOr[SchemaHTTPGetAction] = js.native
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
    * supported
    */
  var tcpSocket: js.UndefOr[SchemaTCPSocketAction] = js.native
}
object SchemaHandler {
  
  @scala.inline
  def apply(): SchemaHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHandler]
  }
  
  @scala.inline
  implicit class SchemaHandlerOps[Self <: SchemaHandler] (val x: Self) extends AnyVal {
    
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
    def setExec(value: SchemaExecAction): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setHttpGet(value: SchemaHTTPGetAction): Self = this.set("httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpGet: Self = this.set("httpGet", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: SchemaTCPSocketAction): Self = this.set("tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpSocket: Self = this.set("tcpSocket", js.undefined)
  }
}
