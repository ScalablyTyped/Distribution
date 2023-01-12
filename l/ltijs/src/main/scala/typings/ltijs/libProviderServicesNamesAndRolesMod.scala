package typings.ltijs

import typings.ltijs.anon.Id
import typings.ltijs.libIdTokenMod.IdToken
import typings.ltijs.libIdTokenMod.UserInfo
import typings.ltijs.ltijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProviderServicesNamesAndRolesMod {
  
  trait Member
    extends StObject
       with UserInfo {
    
    var lis_person_sourcedid: String
    
    var middle_name: String
    
    var picture: String
    
    var roles: js.Array[String]
    
    var status: String
    
    var user_id: String
  }
  object Member {
    
    inline def apply(
      email: String,
      family_name: String,
      given_name: String,
      lis_person_sourcedid: String,
      middle_name: String,
      name: String,
      picture: String,
      roles: js.Array[String],
      status: String,
      user_id: String
    ): Member = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], lis_person_sourcedid = lis_person_sourcedid.asInstanceOf[js.Any], middle_name = middle_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Member]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
      
      inline def setLis_person_sourcedid(value: String): Self = StObject.set(x, "lis_person_sourcedid", value.asInstanceOf[js.Any])
      
      inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MemberFilters extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pages: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object MemberFilters {
    
    inline def apply(): MemberFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberFilters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemberFilters] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait MembersResult extends StObject {
    
    var context: Id
    
    var id: String
    
    var members: js.Array[Member]
    
    var next: js.UndefOr[String] = js.undefined
  }
  object MembersResult {
    
    inline def apply(context: Id, id: String, members: js.Array[Member]): MembersResult = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembersResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MembersResult] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Id): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[Member]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait NamesAndRolesService extends StObject {
    
    def getMembers(idtoken: IdToken): js.Promise[MembersResult | `false`] = js.native
    def getMembers(idtoken: IdToken, filters: MemberFilters): js.Promise[MembersResult | `false`] = js.native
  }
}
