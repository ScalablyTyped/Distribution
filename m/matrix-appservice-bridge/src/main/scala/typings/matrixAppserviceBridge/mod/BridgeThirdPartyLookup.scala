package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeThirdPartyLookup extends js.Object {
      // Function. Called for requests for 3PE query metadata.
  var getLocation: BridgeGetLocation
          // list of recognised protocol names. If present, lookups for unrecognised protocols will be automatically rejected.
  var getProtocol: BridgeGetProtocol
    // Function. Called for reverse parse requests on 3PL aliases.
  var getUser: BridgeGetUser
      // Function. Called for requests for 3PLs.
  var parseLocation: BridgeParseLocation
          // Function. Called for requests for 3PUs.
  var parseUser: BridgeParseUser
  var protocols: js.Array[String]
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
}

