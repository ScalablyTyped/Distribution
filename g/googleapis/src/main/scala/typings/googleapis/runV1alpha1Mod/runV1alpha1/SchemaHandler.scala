package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler defines a specific action that should be taken
  */
trait SchemaHandler extends StObject {
  
  /**
    * One and only one of the following should be specified. Exec specifies the
    * action to take. +optional
    */
  var exec: js.UndefOr[SchemaExecAction] = js.undefined
  
  /**
    * HTTPGet specifies the http request to perform. +optional
    */
  var httpGet: js.UndefOr[SchemaHTTPGetAction] = js.undefined
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
    * supported
    */
  var tcpSocket: js.UndefOr[SchemaTCPSocketAction] = js.undefined
}
object SchemaHandler {
  
  @scala.inline
  def apply(): SchemaHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHandler]
  }
  
  @scala.inline
  implicit class SchemaHandlerMutableBuilder[Self <: SchemaHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: SchemaExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setHttpGet(value: SchemaHTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: SchemaTCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
  }
}
