package typings.matrixAppservice.anon

import typings.matrixAppservice.appServiceRegistrationMod.RegexObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aliases extends js.Object {
  
  var aliases: js.UndefOr[js.Array[RegexObj]] = js.native
  
  var rooms: js.UndefOr[js.Array[RegexObj]] = js.native
  
  var users: js.UndefOr[js.Array[RegexObj]] = js.native
}
object Aliases {
  
  @scala.inline
  def apply(): Aliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit class AliasesOps[Self <: Aliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasesVarargs(value: RegexObj*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[RegexObj]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setRoomsVarargs(value: RegexObj*): Self = this.set("rooms", js.Array(value :_*))
    
    @scala.inline
    def setRooms(value: js.Array[RegexObj]): Self = this.set("rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRooms: Self = this.set("rooms", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: RegexObj*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[RegexObj]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
