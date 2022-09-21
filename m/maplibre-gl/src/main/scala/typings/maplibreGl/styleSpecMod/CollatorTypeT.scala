package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.maplibreGlStrings.collator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollatorTypeT
  extends StObject
     with Type {
  
  var kind: collator
}
object CollatorTypeT {
  
  inline def apply(): CollatorTypeT = {
    val __obj = js.Dynamic.literal(kind = "collator")
    __obj.asInstanceOf[CollatorTypeT]
  }
  
  extension [Self <: CollatorTypeT](x: Self) {
    
    inline def setKind(value: collator): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
