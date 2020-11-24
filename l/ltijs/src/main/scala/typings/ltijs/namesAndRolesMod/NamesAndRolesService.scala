package typings.ltijs.namesAndRolesMod

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamesAndRolesService extends js.Object {
  
  def getMembers(idtoken: IdToken): js.Promise[MembersResult | `false`] = js.native
  def getMembers(idtoken: IdToken, filters: MemberFilters): js.Promise[MembersResult | `false`] = js.native
}
