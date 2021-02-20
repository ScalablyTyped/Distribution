package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var _type: String = js.native
  
  var id: String = js.native
  
  var instruction: String = js.native
  
  var length: Double = js.native
  
  var note: js.Array[String] = js.native
  
  var position: Latitude = js.native
  
  var shape: js.Array[String] = js.native
  
  var travelTime: Double = js.native
}
object Id {
  
  @scala.inline
  def apply(
    _type: String,
    id: String,
    instruction: String,
    length: Double,
    note: js.Array[String],
    position: Latitude,
    shape: js.Array[String],
    travelTime: Double
  ): Id = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteVarargs(value: String*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Latitude): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: js.Array[String]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value :_*))
    
    @scala.inline
    def setTravelTime(value: Double): Self = StObject.set(x, "travelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
  }
}
