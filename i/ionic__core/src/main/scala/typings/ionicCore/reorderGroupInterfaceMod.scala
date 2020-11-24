package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/reorder-group/reorder-group-interface", JSImport.Namespace)
@js.native
object reorderGroupInterfaceMod extends js.Object {
  
  @js.native
  trait ItemReorderEventDetail extends js.Object {
    
    def complete(): js.Any = js.native
    def complete(data: js.Array[_]): js.Any = js.native
    def complete(data: Boolean): js.Any = js.native
    
    var from: Double = js.native
    
    var to: Double = js.native
  }
}
