package typings.maplibreGl.mod

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceStatics extends StObject {
  
  var workerSourceURL: js.UndefOr[URL] = js.undefined
}
object SourceStatics {
  
  inline def apply(): SourceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceStatics]
  }
  
  extension [Self <: SourceStatics](x: Self) {
    
    inline def setWorkerSourceURL(value: URL): Self = StObject.set(x, "workerSourceURL", value.asInstanceOf[js.Any])
    
    inline def setWorkerSourceURLUndefined: Self = StObject.set(x, "workerSourceURL", js.undefined)
  }
}
