package typings
package heredatalensLib.HNs.datalensNs

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
  extends heremapsLib.HNs.mapNs.providerNs.Provider {
  def this(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data) = this()
  def this(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data, options: heremapsLib.HNs.mapNs.providerNs.ProviderNs.Options) = this()
  /**
    * Retrieves the provider data.
    * @returns - JSON object
    */
  def getData(): heredatalensLib.HNs.datalensNs.ServiceNs.Data = js.native
  /**
    * Updates the provider data. When data is updated, the update event is triggered so that the consuming layers are redrawn.
    * @param data - JSON object
    */
  def setData(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data): scala.Unit = js.native
}

