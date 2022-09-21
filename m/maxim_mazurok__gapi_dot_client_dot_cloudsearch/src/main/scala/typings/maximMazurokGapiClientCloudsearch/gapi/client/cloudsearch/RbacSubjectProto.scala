package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RbacSubjectProto extends StObject {
  
  /** Format "username" without "@domain", e.g., "bogdand". */
  var username: js.UndefOr[String] = js.undefined
}
object RbacSubjectProto {
  
  inline def apply(): RbacSubjectProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RbacSubjectProto]
  }
  
  extension [Self <: RbacSubjectProto](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
