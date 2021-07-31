package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedPropertyEntry extends StObject {
  
  /** The human-readable name of the value. Localized. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The machine-readable value of the entry, which should be used in the configuration. Not localized. */
  var value: js.UndefOr[String] = js.undefined
}
object ManagedPropertyEntry {
  
  @scala.inline
  def apply(): ManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPropertyEntry]
  }
  
  @scala.inline
  implicit class ManagedPropertyEntryMutableBuilder[Self <: ManagedPropertyEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
