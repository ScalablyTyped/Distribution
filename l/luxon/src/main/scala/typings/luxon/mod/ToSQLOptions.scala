package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToSQLOptions extends StObject {
  
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  
  var includeZone: js.UndefOr[Boolean] = js.undefined
}
object ToSQLOptions {
  
  @scala.inline
  def apply(): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToSQLOptions]
  }
  
  @scala.inline
  implicit class ToSQLOptionsMutableBuilder[Self <: ToSQLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
    
    @scala.inline
    def setIncludeZone(value: Boolean): Self = StObject.set(x, "includeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeZoneUndefined: Self = StObject.set(x, "includeZone", js.undefined)
  }
}
