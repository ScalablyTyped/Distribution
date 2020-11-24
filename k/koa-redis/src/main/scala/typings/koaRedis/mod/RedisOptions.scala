package typings.koaRedis.mod

import typings.redis.mod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisOptions extends ClientOpts {
  
  var client: js.UndefOr[js.Any] = js.native
  
  var duplicate: js.UndefOr[Boolean] = js.native
}
object RedisOptions {
  
  @scala.inline
  def apply(): RedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedisOptions]
  }
  
  @scala.inline
  implicit class RedisOptionsOps[Self <: RedisOptions] (val x: Self) extends AnyVal {
    
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
    def setClient(value: js.Any): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setDuplicate(value: Boolean): Self = this.set("duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicate: Self = this.set("duplicate", js.undefined)
  }
}
