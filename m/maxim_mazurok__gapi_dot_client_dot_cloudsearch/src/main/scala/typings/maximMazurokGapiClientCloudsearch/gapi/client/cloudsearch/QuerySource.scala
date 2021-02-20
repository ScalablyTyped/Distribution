package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySource extends StObject {
  
  /** Display name of the data source. */
  var displayName: js.UndefOr[String] = js.native
  
  /** List of all operators applicable for this source. */
  var operators: js.UndefOr[js.Array[QueryOperator]] = js.native
  
  /** A short name or alias for the source. This value can be used with the 'source' operator. */
  var shortName: js.UndefOr[String] = js.native
  
  /** Name of the source */
  var source: js.UndefOr[Source] = js.native
}
object QuerySource {
  
  @scala.inline
  def apply(): QuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySource]
  }
  
  @scala.inline
  implicit class QuerySourceMutableBuilder[Self <: QuerySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setOperators(value: js.Array[QueryOperator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    @scala.inline
    def setOperatorsVarargs(value: QueryOperator*): Self = StObject.set(x, "operators", js.Array(value :_*))
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
