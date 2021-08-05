package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializer is information about an initializer that has not yet completed.
  */
trait SchemaInitializer extends StObject {
  
  /**
    * name of the process that is responsible for initializing this object.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaInitializer {
  
  inline def apply(): SchemaInitializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializer]
  }
  
  extension [Self <: SchemaInitializer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
