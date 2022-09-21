package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRbacSubjectProto extends StObject {
  
  /**
    * Format "username" without "@domain", e.g., "bogdand".
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaRbacSubjectProto {
  
  inline def apply(): SchemaRbacSubjectProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRbacSubjectProto]
  }
  
  extension [Self <: SchemaRbacSubjectProto](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
