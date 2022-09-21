package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMixin extends StObject {
  
  /**
    * The fully qualified name of the interface which is included.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If non-empty specifies a path under which inherited HTTP paths are rooted.
    */
  var root: js.UndefOr[String | Null] = js.undefined
}
object SchemaMixin {
  
  inline def apply(): SchemaMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMixin]
  }
  
  extension [Self <: SchemaMixin](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
