package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipTo extends StObject {
  
  var skipTo: js.UndefOr[String] = js.undefined
}
object SkipTo {
  
  inline def apply(): SkipTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipTo]
  }
  
  extension [Self <: SkipTo](x: Self) {
    
    inline def setSkipTo(value: String): Self = StObject.set(x, "skipTo", value.asInstanceOf[js.Any])
    
    inline def setSkipToUndefined: Self = StObject.set(x, "skipTo", js.undefined)
  }
}
