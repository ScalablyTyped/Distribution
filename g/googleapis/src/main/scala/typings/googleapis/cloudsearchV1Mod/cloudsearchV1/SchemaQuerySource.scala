package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuerySource extends StObject {
  
  /**
    * Display name of the data source.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of all operators applicable for this source.
    */
  var operators: js.UndefOr[js.Array[SchemaQueryOperator]] = js.undefined
  
  /**
    * A short name or alias for the source. This value can be used with the 'source' operator.
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the source
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaQuerySource {
  
  inline def apply(): SchemaQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySource]
  }
  
  extension [Self <: SchemaQuerySource](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOperators(value: js.Array[SchemaQueryOperator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    inline def setOperatorsVarargs(value: SchemaQueryOperator*): Self = StObject.set(x, "operators", js.Array(value*))
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
