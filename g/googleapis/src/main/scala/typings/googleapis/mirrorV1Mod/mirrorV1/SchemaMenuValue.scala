package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single value that is part of a MenuItem.
  */
@js.native
trait SchemaMenuValue extends StObject {
  
  /**
    * The name to display for the menu item. If you specify this property for a
    * built-in menu item, the default contextual voice command for that menu
    * item is not shown.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * URL of an icon to display with the menu item.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * The state that this value applies to. Allowed values are:   - DEFAULT -
    * Default value shown when displayed in the menuItems list.  - PENDING -
    * Value shown when the menuItem has been selected by the user but can still
    * be cancelled.  - CONFIRMED - Value shown when the menuItem has been
    * selected by the user and can no longer be cancelled.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaMenuValue {
  
  @scala.inline
  def apply(): SchemaMenuValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMenuValue]
  }
  
  @scala.inline
  implicit class SchemaMenuValueMutableBuilder[Self <: SchemaMenuValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
