package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The operation metadata returned for the batchend services operation.
  */
trait SchemaOperationMetadata extends StObject {
  
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaOperationMetadata {
  
  inline def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  extension [Self <: SchemaOperationMetadata](x: Self) {
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
  }
}
