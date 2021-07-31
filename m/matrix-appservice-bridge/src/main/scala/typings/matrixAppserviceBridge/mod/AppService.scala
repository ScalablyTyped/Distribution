package typings.matrixAppserviceBridge.mod

import typings.matrixAppservice.anon.HomeserverToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppService")
@js.native
class AppService protected ()
  extends typings.matrixAppservice.mod.AppService {
  /**
    * Construct a new application service.
    * @constructor
    * @param {Object} config Configuration for this service.
    * @param {String} config.homeserverToken The incoming HS token to expect. Must
    * be set prior to calling listen(port).
    * @param {Number} config.httpMaxSizeBytes The max number of bytes allowed on an
    * incoming HTTP request. Default: 5000000.
    * @throws If a homeserver token is not supplied.
    */
  def this(config: HomeserverToken) = this()
}
