package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.source_
import typings.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with SizeData {
  
  var kind: source_
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(kind = "source")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setKind(value: source_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
