package typings.hlsJs.mod

import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bufferable extends StObject {
  
  var buffered: TimeRanges
}
object Bufferable {
  
  inline def apply(buffered: TimeRanges): Bufferable = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bufferable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bufferable] (val x: Self) extends AnyVal {
    
    inline def setBuffered(value: TimeRanges): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
  }
}
