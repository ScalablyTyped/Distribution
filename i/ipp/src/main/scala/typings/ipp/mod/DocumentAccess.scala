package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAccess extends StObject {
  
  var `access-oauth-token`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `access-oauth-uri`: js.UndefOr[String] = js.undefined
  
  var `access-password`: js.UndefOr[String] = js.undefined
  
  var `access-pin`: js.UndefOr[String] = js.undefined
  
  var `access-user-name`: js.UndefOr[String] = js.undefined
}
object DocumentAccess {
  
  inline def apply(): DocumentAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentAccess] (val x: Self) extends AnyVal {
    
    inline def `setAccess-oauth-token`(value: js.Array[String]): Self = StObject.set(x, "access-oauth-token", value.asInstanceOf[js.Any])
    
    inline def `setAccess-oauth-tokenUndefined`: Self = StObject.set(x, "access-oauth-token", js.undefined)
    
    inline def `setAccess-oauth-tokenVarargs`(value: String*): Self = StObject.set(x, "access-oauth-token", js.Array(value*))
    
    inline def `setAccess-oauth-uri`(value: String): Self = StObject.set(x, "access-oauth-uri", value.asInstanceOf[js.Any])
    
    inline def `setAccess-oauth-uriUndefined`: Self = StObject.set(x, "access-oauth-uri", js.undefined)
    
    inline def `setAccess-password`(value: String): Self = StObject.set(x, "access-password", value.asInstanceOf[js.Any])
    
    inline def `setAccess-passwordUndefined`: Self = StObject.set(x, "access-password", js.undefined)
    
    inline def `setAccess-pin`(value: String): Self = StObject.set(x, "access-pin", value.asInstanceOf[js.Any])
    
    inline def `setAccess-pinUndefined`: Self = StObject.set(x, "access-pin", js.undefined)
    
    inline def `setAccess-user-name`(value: String): Self = StObject.set(x, "access-user-name", value.asInstanceOf[js.Any])
    
    inline def `setAccess-user-nameUndefined`: Self = StObject.set(x, "access-user-name", js.undefined)
  }
}
