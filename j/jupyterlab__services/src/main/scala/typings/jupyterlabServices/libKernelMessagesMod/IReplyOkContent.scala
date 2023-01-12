package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReplyOkContent extends StObject {
  
  var status: ok
}
object IReplyOkContent {
  
  inline def apply(): IReplyOkContent = {
    val __obj = js.Dynamic.literal(status = "ok")
    __obj.asInstanceOf[IReplyOkContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IReplyOkContent] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ok): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
