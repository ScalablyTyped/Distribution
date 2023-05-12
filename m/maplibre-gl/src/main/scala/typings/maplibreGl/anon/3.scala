package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.source_
import typings.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with SizeData {
  
  var kind: source_
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(kind = "source")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setKind(value: source_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
