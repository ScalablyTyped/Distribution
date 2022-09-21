package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedPropertyBundle extends StObject {
  
  /** The list of managed properties. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.undefined
}
object ManagedPropertyBundle {
  
  inline def apply(): ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPropertyBundle]
  }
  
  extension [Self <: ManagedPropertyBundle](x: Self) {
    
    inline def setManagedProperty(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    inline def setManagedPropertyVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value*))
  }
}
