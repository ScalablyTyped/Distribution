package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(auth: intercomDashClientLib.Anon_AppId) = this()
  def this(auth: intercomDashClientLib.Anon_Token) = this()
  def this(username: java.lang.String, password: java.lang.String) = this()
  var companies: Companies = js.native
  var contacts: Leads = js.native
  var events: Events = js.native
  var leads: Leads = js.native
  var tags: Tags = js.native
  var users: Users = js.native
}

