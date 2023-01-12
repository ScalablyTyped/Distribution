package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferingEventUIParam extends StObject {
  
  /**
    * Get buffered percentage.
    */
  var buffered: js.UndefOr[Double] = js.undefined
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.undefined
}
object BufferingEventUIParam {
  
  inline def apply(): BufferingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
