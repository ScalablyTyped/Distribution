package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedPropertyBundle extends StObject {
  
  /** The list of managed properties. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.native
}
object ManagedPropertyBundle {
  
  @scala.inline
  def apply(): ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPropertyBundle]
  }
  
  @scala.inline
  implicit class ManagedPropertyBundleMutableBuilder[Self <: ManagedPropertyBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedProperty(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    @scala.inline
    def setManagedPropertyVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
  }
}
