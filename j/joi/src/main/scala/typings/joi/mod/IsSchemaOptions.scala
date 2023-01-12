package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSchemaOptions extends StObject {
  
  /**
    * If true, will identify schemas from older versions of joi, otherwise will throw an error.
    *
    * @default false
    */
  var legacy: Boolean
}
object IsSchemaOptions {
  
  inline def apply(legacy: Boolean): IsSchemaOptions = {
    val __obj = js.Dynamic.literal(legacy = legacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSchemaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSchemaOptions] (val x: Self) extends AnyVal {
    
    inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
  }
}
