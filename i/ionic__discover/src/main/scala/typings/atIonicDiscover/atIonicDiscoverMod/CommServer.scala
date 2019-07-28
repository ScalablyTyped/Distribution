package typings.atIonicDiscover.atIonicDiscoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover", "CommServer")
@js.native
class CommServer protected ()
  extends typings.atIonicDiscover.distCommMod.CommServer {
  def this(
    namespace: String,
    /**
    * Unique identifier of the publisher.
    */
  id: String,
    /**
    * Port of communication server.
    */
  port: Double
  ) = this()
}

