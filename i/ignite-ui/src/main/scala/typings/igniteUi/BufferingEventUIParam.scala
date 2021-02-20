package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferingEventUIParam extends StObject {
  
  /**
    * Get buffered percentage.
    */
  var buffered: js.UndefOr[Double] = js.native
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.native
}
object BufferingEventUIParam {
  
  @scala.inline
  def apply(): BufferingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingEventUIParam]
  }
  
  @scala.inline
  implicit class BufferingEventUIParamMutableBuilder[Self <: BufferingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
