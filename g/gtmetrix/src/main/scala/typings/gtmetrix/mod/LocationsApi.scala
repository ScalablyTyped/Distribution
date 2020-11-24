package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsApi extends js.Object {
  
  def list(): js.Promise[js.Array[LocationInfo]] = js.native
  /**
    * Get a list of available test locations.
    */
  def list(callback: js.Function2[/* error */ MetricsError, /* data */ js.Array[LocationInfo], Unit]): Unit = js.native
}
