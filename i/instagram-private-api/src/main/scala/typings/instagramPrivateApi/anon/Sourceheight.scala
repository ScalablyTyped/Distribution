package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sourceheight extends StObject {
  
  var source_height: Double
  
  var source_width: Double
}
object Sourceheight {
  
  inline def apply(source_height: Double, source_width: Double): Sourceheight = {
    val __obj = js.Dynamic.literal(source_height = source_height.asInstanceOf[js.Any], source_width = source_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sourceheight]
  }
  
  extension [Self <: Sourceheight](x: Self) {
    
    inline def setSource_height(value: Double): Self = StObject.set(x, "source_height", value.asInstanceOf[js.Any])
    
    inline def setSource_width(value: Double): Self = StObject.set(x, "source_width", value.asInstanceOf[js.Any])
  }
}
