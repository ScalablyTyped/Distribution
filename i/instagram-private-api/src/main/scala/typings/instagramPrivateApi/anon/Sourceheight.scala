package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sourceheight extends StObject {
  
  var source_height: Double = js.native
  
  var source_width: Double = js.native
}
object Sourceheight {
  
  @scala.inline
  def apply(source_height: Double, source_width: Double): Sourceheight = {
    val __obj = js.Dynamic.literal(source_height = source_height.asInstanceOf[js.Any], source_width = source_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sourceheight]
  }
  
  @scala.inline
  implicit class SourceheightMutableBuilder[Self <: Sourceheight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource_height(value: Double): Self = StObject.set(x, "source_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_width(value: Double): Self = StObject.set(x, "source_width", value.asInstanceOf[js.Any])
  }
}
