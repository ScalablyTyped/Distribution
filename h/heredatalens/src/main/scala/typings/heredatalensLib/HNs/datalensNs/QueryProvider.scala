package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the source of the data for layers from a Data Lens query.
  * Providers define interfaces for layers to access data.  The input data can be stored locally or loaded from the network.
  * Data can be loaded by tiles or in one chunk. This provider loads query data with the Data Lens REST API.
  * Note that this provider must be used only for non-tiled queries.
  */
@JSGlobal("H.datalens.QueryProvider")
@js.native
class QueryProvider protected () extends Provider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures source query and data accessibility parameters
    */
  def this(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data) = this()
  def this(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data, options: heredatalensLib.HNs.datalensNs.QueryProviderNs.Options) = this()
  /**
    * Fetches new data from the Data Lens REST API.
    * When data is fetched, the update event is triggered so that the consuming layers are redrawn.
    */
  def reload(): scala.Unit = js.native
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: java.lang.String): scala.Unit = js.native
  def setQueryParams(): scala.Unit = js.native
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    * @param queryParams - Query dynamic parameters
    */
  def setQueryParams(queryParams: js.Any): scala.Unit = js.native
}

