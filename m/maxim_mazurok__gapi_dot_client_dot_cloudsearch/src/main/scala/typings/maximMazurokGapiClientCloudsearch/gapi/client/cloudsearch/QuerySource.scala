package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySource extends StObject {
  
  /** Display name of the data source. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** List of all operators applicable for this source. */
  var operators: js.UndefOr[js.Array[QueryOperator]] = js.undefined
  
  /** A short name or alias for the source. This value can be used with the 'source' operator. */
  var shortName: js.UndefOr[String] = js.undefined
  
  /** The name of the source */
  var source: js.UndefOr[Source] = js.undefined
}
object QuerySource {
  
  inline def apply(): QuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuerySource] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOperators(value: js.Array[QueryOperator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    inline def setOperatorsVarargs(value: QueryOperator*): Self = StObject.set(x, "operators", js.Array(value*))
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
