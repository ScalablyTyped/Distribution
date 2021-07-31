package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hangouts chat search advanced options
  */
trait SchemaHangoutsChatOptions extends StObject {
  
  /**
    * Set to true to include rooms.
    */
  var includeRooms: js.UndefOr[Boolean] = js.undefined
}
object SchemaHangoutsChatOptions {
  
  @scala.inline
  def apply(): SchemaHangoutsChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatOptions]
  }
  
  @scala.inline
  implicit class SchemaHangoutsChatOptionsMutableBuilder[Self <: SchemaHangoutsChatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeRooms(value: Boolean): Self = StObject.set(x, "includeRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRoomsUndefined: Self = StObject.set(x, "includeRooms", js.undefined)
  }
}
