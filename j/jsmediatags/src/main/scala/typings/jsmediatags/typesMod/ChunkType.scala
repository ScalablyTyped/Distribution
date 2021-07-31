package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkType extends StObject {
  
  var data: DataType
  
  var offset: Double
}
object ChunkType {
  
  @scala.inline
  def apply(data: DataType, offset: Double): ChunkType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkType]
  }
  
  @scala.inline
  implicit class ChunkTypeMutableBuilder[Self <: ChunkType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
