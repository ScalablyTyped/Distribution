package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeT
  extends StObject
     with Type {
  
  var kind: string
}
object StringTypeT {
  
  inline def apply(): StringTypeT = {
    val __obj = js.Dynamic.literal(kind = "string")
    __obj.asInstanceOf[StringTypeT]
  }
  
  extension [Self <: StringTypeT](x: Self) {
    
    inline def setKind(value: string): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
