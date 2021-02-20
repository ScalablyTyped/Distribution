package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultTuple extends StObject {
  
  /**
    * Returns an array of $.ig.OlapResultTuple objects which form the axis.
    */
  def members(): js.Array[_] = js.native
}
object OlapResultTuple {
  
  @scala.inline
  def apply(members: () => js.Array[_]): OlapResultTuple = {
    val __obj = js.Dynamic.literal(members = js.Any.fromFunction0(members))
    __obj.asInstanceOf[OlapResultTuple]
  }
  
  @scala.inline
  implicit class OlapResultTupleMutableBuilder[Self <: OlapResultTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: () => js.Array[_]): Self = StObject.set(x, "members", js.Any.fromFunction0(value))
  }
}
