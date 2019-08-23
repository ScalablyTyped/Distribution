package typings.intercomDashClient.intercomDashClientMod

import typings.intercomDashClient.Anon_AppApiKey
import typings.intercomDashClient.Anon_Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(auth: Anon_AppApiKey) = this()
  def this(auth: Anon_Token) = this()
  def this(username: String, password: String) = this()
  var companies: Companies = js.native
  var contacts: Leads = js.native
  var events: Events = js.native
  var leads: Leads = js.native
  var tags: Tags = js.native
  var users: Users = js.native
  var visitors: Visitors = js.native
}

