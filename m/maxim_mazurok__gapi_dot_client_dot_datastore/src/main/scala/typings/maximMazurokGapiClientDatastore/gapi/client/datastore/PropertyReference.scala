package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyReference extends StObject {
  
  /** The name of the property. If name includes "."s, it may be interpreted as a property name path. */
  var name: js.UndefOr[String] = js.undefined
}
object PropertyReference {
  
  @scala.inline
  def apply(): PropertyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyReference]
  }
  
  @scala.inline
  implicit class PropertyReferenceMutableBuilder[Self <: PropertyReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
