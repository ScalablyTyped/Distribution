package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a property relative to the kind expressions.
  */
trait SchemaPropertyReference extends StObject {
  
  /**
    * The name of the property. If name includes &quot;.&quot;s, it may be
    * interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPropertyReference {
  
  inline def apply(): SchemaPropertyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyReference]
  }
  
  extension [Self <: SchemaPropertyReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
