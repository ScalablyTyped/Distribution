package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraints extends StObject {
  
  var video: DimensionConstraints
}
object Constraints {
  
  inline def apply(video: DimensionConstraints): Constraints = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
    
    inline def setVideo(value: DimensionConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
