package typings.jupyterlabServices.libKernelMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputReply
  extends StObject
     with IReplyOkContent {
  
  var value: String
}
object IInputReply {
  
  inline def apply(value: String): IInputReply = {
    val __obj = js.Dynamic.literal(status = "ok", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputReply]
  }
  
  extension [Self <: IInputReply](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
