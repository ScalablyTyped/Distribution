package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultTuple extends StObject {
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def members(): js.Array[Any]
}
object OlapResultTuple {
  
  inline def apply(members: () => js.Array[Any]): OlapResultTuple = {
    val __obj = js.Dynamic.literal(members = js.Any.fromFunction0(members))
    __obj.asInstanceOf[OlapResultTuple]
  }
  
  extension [Self <: OlapResultTuple](x: Self) {
    
    inline def setMembers(value: () => js.Array[Any]): Self = StObject.set(x, "members", js.Any.fromFunction0(value))
  }
}
