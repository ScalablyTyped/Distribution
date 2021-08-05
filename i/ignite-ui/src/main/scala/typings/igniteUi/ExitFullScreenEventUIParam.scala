package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitFullScreenEventUIParam extends StObject {
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ExitFullScreenEventUIParam {
  
  inline def apply(): ExitFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitFullScreenEventUIParam]
  }
  
  extension [Self <: ExitFullScreenEventUIParam](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
