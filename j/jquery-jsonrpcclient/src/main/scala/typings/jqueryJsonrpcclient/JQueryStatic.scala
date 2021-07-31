package typings.jqueryJsonrpcclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var JsonRpcClient: JsonRpcClientFactory
}
object JQueryStatic {
  
  @scala.inline
  def apply(JsonRpcClient: JsonRpcClientFactory): JQueryStatic = {
    val __obj = js.Dynamic.literal(JsonRpcClient = JsonRpcClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonRpcClient(value: JsonRpcClientFactory): Self = StObject.set(x, "JsonRpcClient", value.asInstanceOf[js.Any])
  }
}
