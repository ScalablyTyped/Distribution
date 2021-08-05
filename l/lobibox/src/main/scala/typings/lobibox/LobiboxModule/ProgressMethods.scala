package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressMethods extends StObject {
  
  var getProgress: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var setProgress: js.UndefOr[js.Function1[/* progress */ Double, this.type]] = js.undefined
}
object ProgressMethods {
  
  inline def apply(): ProgressMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressMethods]
  }
  
  extension [Self <: ProgressMethods](x: Self) {
    
    inline def setGetProgress(value: () => Double): Self = StObject.set(x, "getProgress", js.Any.fromFunction0(value))
    
    inline def setGetProgressUndefined: Self = StObject.set(x, "getProgress", js.undefined)
    
    inline def setSetProgress(value: /* progress */ Double => ProgressMethods): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    
    inline def setSetProgressUndefined: Self = StObject.set(x, "setProgress", js.undefined)
  }
}
