package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRepositoryInfoResponseBiographyWithEntities extends js.Object {
  
  var entities: js.Array[_] = js.native
  
  var raw_text: String = js.native
}
object UserRepositoryInfoResponseBiographyWithEntities {
  
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): UserRepositoryInfoResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseBiographyWithEntities]
  }
  
  @scala.inline
  implicit class UserRepositoryInfoResponseBiographyWithEntitiesOps[Self <: UserRepositoryInfoResponseBiographyWithEntities] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: js.Any*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[_]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_text(value: String): Self = this.set("raw_text", value.asInstanceOf[js.Any])
  }
}
