package typings.heredatalens.H.datalens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the source of the data for layers from a Data Lens query.
  * Providers define interfaces for layers to access data.  The input data can be stored locally or loaded from the network.
  * Data can be loaded by tiles or in one chunk. This provider loads query data with the Data Lens REST API.
  * Note that this provider must be used only for non-tiled queries.
  */
@js.native
trait QueryProvider extends Provider {
  
  /**
    * Fetches new data from the Data Lens REST API.
    * When data is fetched, the update event is triggered so that the consuming layers are redrawn.
    */
  def reload(): Unit = js.native
  
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: String): Unit = js.native
  
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    * @param queryParams - Query dynamic parameters
    */
  def setQueryParams(): Unit = js.native
  def setQueryParams(queryParams: js.Any): Unit = js.native
}
object QueryProvider {
  
  /**
    * Configures source query and data accessibility parameters for QueryProvider
    * Specifies the query credentials and dynamic parameters required for fetching query data with the Data Lens REST API. Other options from Provider.Options are available.
    */
  @js.native
  trait Options extends StObject {
    
    /** The ID of the Data Lens REST API query */
    var queryId: String = js.native
    
    /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
    var queryParams: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(queryId: String): Options = {
      val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: js.Any): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    }
  }
}
