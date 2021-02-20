package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAccess extends StObject {
  
  var `access-oauth-token`: js.UndefOr[js.Array[String]] = js.native
  
  var `access-oauth-uri`: js.UndefOr[String] = js.native
  
  var `access-password`: js.UndefOr[String] = js.native
  
  var `access-pin`: js.UndefOr[String] = js.native
  
  var `access-user-name`: js.UndefOr[String] = js.native
}
object DocumentAccess {
  
  @scala.inline
  def apply(): DocumentAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccess]
  }
  
  @scala.inline
  implicit class DocumentAccessMutableBuilder[Self <: DocumentAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAccess-oauth-token`(value: js.Array[String]): Self = StObject.set(x, "access-oauth-token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccess-oauth-tokenUndefined`: Self = StObject.set(x, "access-oauth-token", js.undefined)
    
    @scala.inline
    def `setAccess-oauth-tokenVarargs`(value: String*): Self = StObject.set(x, "access-oauth-token", js.Array(value :_*))
    
    @scala.inline
    def `setAccess-oauth-uri`(value: String): Self = StObject.set(x, "access-oauth-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccess-oauth-uriUndefined`: Self = StObject.set(x, "access-oauth-uri", js.undefined)
    
    @scala.inline
    def `setAccess-password`(value: String): Self = StObject.set(x, "access-password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccess-passwordUndefined`: Self = StObject.set(x, "access-password", js.undefined)
    
    @scala.inline
    def `setAccess-pin`(value: String): Self = StObject.set(x, "access-pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccess-pinUndefined`: Self = StObject.set(x, "access-pin", js.undefined)
    
    @scala.inline
    def `setAccess-user-name`(value: String): Self = StObject.set(x, "access-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccess-user-nameUndefined`: Self = StObject.set(x, "access-user-name", js.undefined)
  }
}
