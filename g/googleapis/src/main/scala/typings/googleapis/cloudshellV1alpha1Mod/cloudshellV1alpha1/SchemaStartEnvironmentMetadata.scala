package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message included in the metadata field of operations returned from
  * StartEnvironment.
  */
trait SchemaStartEnvironmentMetadata extends StObject {
  
  /**
    * Current state of the environment being started.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaStartEnvironmentMetadata {
  
  inline def apply(): SchemaStartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentMetadata]
  }
  
  extension [Self <: SchemaStartEnvironmentMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
