package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An environment variable to set for an action.
  */
trait SchemaEnvVariable extends StObject {
  
  /**
    * Deprecated, do not use.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the environment variable.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the variable.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaEnvVariable {
  
  inline def apply(): SchemaEnvVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVariable]
  }
  
  extension [Self <: SchemaEnvVariable](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
