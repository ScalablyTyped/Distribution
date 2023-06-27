package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.mod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overloads extends StObject {
  
  var overloads: js.Array[js.Tuple2[Signature, typings.maplibreMaplibreGlStyleSpec.mod.Evaluate]]
  
  var `type`: typings.maplibreMaplibreGlStyleSpec.mod.Type
}
object Overloads {
  
  inline def apply(
    overloads: js.Array[js.Tuple2[Signature, typings.maplibreMaplibreGlStyleSpec.mod.Evaluate]],
    `type`: typings.maplibreMaplibreGlStyleSpec.mod.Type
  ): Overloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overloads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overloads] (val x: Self) extends AnyVal {
    
    inline def setOverloads(value: js.Array[js.Tuple2[Signature, typings.maplibreMaplibreGlStyleSpec.mod.Evaluate]]): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    inline def setOverloadsVarargs(value: (js.Tuple2[Signature, typings.maplibreMaplibreGlStyleSpec.mod.Evaluate])*): Self = StObject.set(x, "overloads", js.Array(value*))
    
    inline def setType(value: typings.maplibreMaplibreGlStyleSpec.mod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
