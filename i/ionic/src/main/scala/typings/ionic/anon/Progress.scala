package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: (/* loaded */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
