package typings.matrixAppserviceBridge.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  var conflict: js.Array[RegExp]
  
  var exempt: js.Array[RegExp]
}
object Conflict {
  
  @scala.inline
  def apply(conflict: js.Array[RegExp], exempt: js.Array[RegExp]): Conflict = {
    val __obj = js.Dynamic.literal(conflict = conflict.asInstanceOf[js.Any], exempt = exempt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictMutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflict(value: js.Array[RegExp]): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictVarargs(value: RegExp*): Self = StObject.set(x, "conflict", js.Array(value :_*))
    
    @scala.inline
    def setExempt(value: js.Array[RegExp]): Self = StObject.set(x, "exempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptVarargs(value: RegExp*): Self = StObject.set(x, "exempt", js.Array(value :_*))
  }
}
