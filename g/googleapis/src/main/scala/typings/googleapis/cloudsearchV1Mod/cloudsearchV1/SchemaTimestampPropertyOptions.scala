package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for timestamp properties.
  */
trait SchemaTimestampPropertyOptions extends StObject {
  
  /**
    * If set, describes how the timestamp should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaTimestampOperatorOptions] = js.undefined
}
object SchemaTimestampPropertyOptions {
  
  inline def apply(): SchemaTimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampPropertyOptions]
  }
  
  extension [Self <: SchemaTimestampPropertyOptions](x: Self) {
    
    inline def setOperatorOptions(value: SchemaTimestampOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    inline def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
  }
}
