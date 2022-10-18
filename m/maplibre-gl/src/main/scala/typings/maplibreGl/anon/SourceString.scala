package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceString extends StObject {
  
  var source: String
}
object SourceString {
  
  inline def apply(source: String): SourceString = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceString]
  }
  
  extension [Self <: SourceString](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
