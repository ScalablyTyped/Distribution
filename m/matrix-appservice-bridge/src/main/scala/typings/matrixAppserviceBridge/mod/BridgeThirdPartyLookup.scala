package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeThirdPartyLookup extends js.Object {
      // Function. Called for requests for 3PE query metadata.
  var getLocation: BridgeGetLocation = js.native
          // list of recognised protocol names. If present, lookups for unrecognised protocols will be automatically rejected.
  var getProtocol: BridgeGetProtocol = js.native
    // Function. Called for reverse parse requests on 3PL aliases.
  var getUser: BridgeGetUser = js.native
      // Function. Called for requests for 3PLs.
  var parseLocation: BridgeParseLocation = js.native
          // Function. Called for requests for 3PUs.
  var parseUser: BridgeParseUser = js.native
  var protocols: js.Array[String] = js.native
}

object BridgeThirdPartyLookup {
  @scala.inline
  def apply(
    getLocation: BridgeGetLocation,
    getProtocol: BridgeGetProtocol,
    getUser: BridgeGetUser,
    parseLocation: BridgeParseLocation,
    parseUser: BridgeParseUser,
    protocols: js.Array[String]
  ): BridgeThirdPartyLookup = {
    val __obj = js.Dynamic.literal(getLocation = getLocation.asInstanceOf[js.Any], getProtocol = getProtocol.asInstanceOf[js.Any], getUser = getUser.asInstanceOf[js.Any], parseLocation = parseLocation.asInstanceOf[js.Any], parseUser = parseUser.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeThirdPartyLookup]
  }
  @scala.inline
  implicit class BridgeThirdPartyLookupOps[Self <: BridgeThirdPartyLookup] (val x: Self) extends AnyVal {
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
    def setGetLocation(value: BridgeGetLocation): Self = this.set("getLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetProtocol(value: BridgeGetProtocol): Self = this.set("getProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUser(value: BridgeGetUser): Self = this.set("getUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseLocation(value: BridgeParseLocation): Self = this.set("parseLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseUser(value: BridgeParseUser): Self = this.set("parseUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
  }
  
}

