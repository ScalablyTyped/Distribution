package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaI18nConfig extends StObject {
  
  /**
    * Required. The user-supplied path where country and language specific content will be looked for within the public directory.
    */
  var root: js.UndefOr[String | Null] = js.undefined
}
object SchemaI18nConfig {
  
  inline def apply(): SchemaI18nConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nConfig]
  }
  
  extension [Self <: SchemaI18nConfig](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
