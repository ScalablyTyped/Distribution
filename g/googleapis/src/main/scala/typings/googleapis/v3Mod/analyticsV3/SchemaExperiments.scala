package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An experiment collection lists Analytics experiments to which the user has
  * access. Each view (profile) can have a set of experiments. Each resource in
  * the Experiment collection corresponds to a single Analytics experiment.
  */
trait SchemaExperiments extends StObject {
  
  /**
    * A list of experiments.
    */
  var items: js.UndefOr[js.Array[SchemaExperiment]] = js.undefined
  
  /**
    * The maximum number of resources the response can contain, regardless of
    * the actual number of resources returned. Its value ranges from 1 to 1000
    * with a value of 1000 by default, or otherwise specified by the
    * max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Link to next page for this experiment collection.
    */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /**
    * Link to previous page for this experiment collection.
    */
  var previousLink: js.UndefOr[String] = js.undefined
  
  /**
    * The starting index of the resources, which is 1 by default or otherwise
    * specified by the start-index query parameter.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of results for the query, regardless of the number of
    * resources in the result.
    */
  var totalResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Email ID of the authenticated user
    */
  var username: js.UndefOr[String] = js.undefined
}
object SchemaExperiments {
  
  @scala.inline
  def apply(): SchemaExperiments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExperiments]
  }
  
  @scala.inline
  implicit class SchemaExperimentsMutableBuilder[Self <: SchemaExperiments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaExperiment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaExperiment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    @scala.inline
    def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
