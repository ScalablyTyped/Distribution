package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query options for hangouts chat holds.
  */
@js.native
trait SchemaHeldHangoutsChatQuery extends StObject {
  
  /**
    * If true, include rooms the user has participated in.
    */
  var includeRooms: js.UndefOr[Boolean] = js.native
}
object SchemaHeldHangoutsChatQuery {
  
  @scala.inline
  def apply(): SchemaHeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldHangoutsChatQuery]
  }
  
  @scala.inline
  implicit class SchemaHeldHangoutsChatQueryMutableBuilder[Self <: SchemaHeldHangoutsChatQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
