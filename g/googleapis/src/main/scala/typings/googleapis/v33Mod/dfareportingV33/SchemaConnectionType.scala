package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about an internet connection type that can be targeted
  * by ads. Clients can use the connection type to target mobile vs. broadband
  * users.
  */
trait SchemaConnectionType extends StObject {
  
  /**
    * ID of this connection type.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionType&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this connection type.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaConnectionType {
  
  @scala.inline
  def apply(): SchemaConnectionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionType]
  }
  
  @scala.inline
  implicit class SchemaConnectionTypeMutableBuilder[Self <: SchemaConnectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
