package typings.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWhoisData extends js.Object {
  
  /** Channels */
  var channels: js.Array[String] = js.native
  
  /** Hostnamej */
  var host: String = js.native
  
  /** Nickname */
  var nick: String = js.native
  
  /** Is this user an operator? */
  var operator: String = js.native
  
  /** Real name" */
  var realname: String = js.native
  
  /** Server */
  var server: String = js.native
  
  /** Server description string */
  var serverinfo: String = js.native
  
  /** Username */
  var user: String = js.native
}
object IWhoisData {
  
  @scala.inline
  def apply(
    channels: js.Array[String],
    host: String,
    nick: String,
    operator: String,
    realname: String,
    server: String,
    serverinfo: String,
    user: String
  ): IWhoisData = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], realname = realname.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], serverinfo = serverinfo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWhoisData]
  }
  
  @scala.inline
  implicit class IWhoisDataOps[Self <: IWhoisData] (val x: Self) extends AnyVal {
    
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
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealname(value: String): Self = this.set("realname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinfo(value: String): Self = this.set("serverinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
