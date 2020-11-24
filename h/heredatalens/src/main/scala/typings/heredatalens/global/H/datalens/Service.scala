package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.Service.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HERE Maps API and Data Lens JavaScript API can be used to visualize data from different network sources.
  * For each network source type, a service class is required. The service also stores API connection credentials.
  * The service instance must be configured with a service.Platform instance.
  */
@JSGlobal("H.datalens.Service")
@js.native
/**
  * Constructor
  * @param options - Overrides the configuration from the service.Platform instance
  */
class Service ()
  extends typings.heredatalens.H.datalens.Service {
  def this(options: Options) = this()
}
