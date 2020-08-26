package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.map.provider.Provider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider allows you to supply data stored locally or fetched using external tools.
  */
@JSGlobal("H.datalens.Provider")
@js.native
/**
  * Constructor
  * @param data - JSON object
  * @param options - Configures data accessibility parameters
  */
class Provider ()
  extends typings.heredatalens.H.datalens.Provider {
  def this(data: Data) = this()
  def this(data: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(data: Data, options: Options) = this()
}

