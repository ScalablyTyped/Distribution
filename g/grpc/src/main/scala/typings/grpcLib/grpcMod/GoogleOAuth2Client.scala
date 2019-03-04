package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleOAuth2Client extends js.Object {
  def getRequestMetadata(
    optUri: java.lang.String,
    metadataCallback: js.Function2[/* err */ nodeLib.Error, /* headers */ js.Any, scala.Unit]
  ): scala.Unit
}

object GoogleOAuth2Client {
  @scala.inline
  def apply(
    getRequestMetadata: js.Function2[
      java.lang.String, 
      js.Function2[/* err */ nodeLib.Error, /* headers */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = getRequestMetadata)
  
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
}

