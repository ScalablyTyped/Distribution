package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerStatus extends StObject {
  
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a
    * stable state. A stable state means that: none of the instances in the
    * managed instance group is currently undergoing any type of change (for
    * example, creation, restart, or deletion); no future changes are scheduled
    * for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.native
}
object SchemaInstanceGroupManagerStatus {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerStatusMutableBuilder[Self <: SchemaInstanceGroupManagerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsStable(value: Boolean): Self = StObject.set(x, "isStable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStableUndefined: Self = StObject.set(x, "isStable", js.undefined)
  }
}
