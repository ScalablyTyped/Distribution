package typings.html2canvas

import org.scalablytyped.runtime.StringDictionary
import typings.html2canvas.mocksLoggerMod.Logger_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocksContextMod {
  
  @JSImport("html2canvas/dist/types/core/@/mocks/context", "Context")
  @js.native
  open class Context () extends StObject {
    
    val _cache: StringDictionary[js.Promise[Any]] = js.native
    
    val cache: Any = js.native
    
    val logger: Logger_ = js.native
  }
}
