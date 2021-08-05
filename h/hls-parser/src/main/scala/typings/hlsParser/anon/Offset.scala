package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: Double
  
  var precise: Boolean
}
object Offset {
  
  inline def apply(offset: Double, precise: Boolean): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], precise = precise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPrecise(value: Boolean): Self = StObject.set(x, "precise", value.asInstanceOf[js.Any])
  }
}
