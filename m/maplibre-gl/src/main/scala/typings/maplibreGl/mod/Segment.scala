package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  var primitiveLength: Double
  
  var primitiveOffset: Double
  
  var sortKey: js.UndefOr[Double] = js.undefined
  
  var vaos: StringDictionary[VertexArrayObject]
  
  var vertexLength: Double
  
  var vertexOffset: Double
}
object Segment {
  
  inline def apply(
    primitiveLength: Double,
    primitiveOffset: Double,
    vaos: StringDictionary[VertexArrayObject],
    vertexLength: Double,
    vertexOffset: Double
  ): Segment = {
    val __obj = js.Dynamic.literal(primitiveLength = primitiveLength.asInstanceOf[js.Any], primitiveOffset = primitiveOffset.asInstanceOf[js.Any], vaos = vaos.asInstanceOf[js.Any], vertexLength = vertexLength.asInstanceOf[js.Any], vertexOffset = vertexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    inline def setPrimitiveLength(value: Double): Self = StObject.set(x, "primitiveLength", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveOffset(value: Double): Self = StObject.set(x, "primitiveOffset", value.asInstanceOf[js.Any])
    
    inline def setSortKey(value: Double): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    inline def setVaos(value: StringDictionary[VertexArrayObject]): Self = StObject.set(x, "vaos", value.asInstanceOf[js.Any])
    
    inline def setVertexLength(value: Double): Self = StObject.set(x, "vertexLength", value.asInstanceOf[js.Any])
    
    inline def setVertexOffset(value: Double): Self = StObject.set(x, "vertexOffset", value.asInstanceOf[js.Any])
  }
}
