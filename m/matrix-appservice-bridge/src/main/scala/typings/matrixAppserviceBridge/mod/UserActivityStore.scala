package typings.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserActivityStore")
@js.native
open class UserActivityStore protected ()
  extends typings.matrixAppserviceBridge.libComponentsUserActivityStoreMod.UserActivityStore {
  /**
    * Construct a store suitable for user bridging information.
    * @param db The connected NEDB database instance
    */
  def this(db: typings.nedb.mod.^[Any]) = this()
}
