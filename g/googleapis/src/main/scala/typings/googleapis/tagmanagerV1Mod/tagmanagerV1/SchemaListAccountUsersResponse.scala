package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List AccountUsers Response.
  */
@js.native
trait SchemaListAccountUsersResponse extends StObject {
  
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[SchemaUserAccess]] = js.native
}
object SchemaListAccountUsersResponse {
  
  @scala.inline
  def apply(): SchemaListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountUsersResponse]
  }
  
  @scala.inline
  implicit class SchemaListAccountUsersResponseMutableBuilder[Self <: SchemaListAccountUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserAccess(value: js.Array[SchemaUserAccess]): Self = StObject.set(x, "userAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccessUndefined: Self = StObject.set(x, "userAccess", js.undefined)
    
    @scala.inline
    def setUserAccessVarargs(value: SchemaUserAccess*): Self = StObject.set(x, "userAccess", js.Array(value :_*))
  }
}
