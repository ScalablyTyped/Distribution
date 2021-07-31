package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryIndex extends StObject {
  
  var dirty: Boolean
  
  var name: String
  
  var values: js.Array[Double]
}
object BinaryIndex {
  
  @scala.inline
  def apply(dirty: Boolean, name: String, values: js.Array[Double]): BinaryIndex = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryIndex]
  }
  
  @scala.inline
  implicit class BinaryIndexMutableBuilder[Self <: BinaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
