package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result count information
  */
trait SchemaResultCounts extends StObject {
  
  /**
    * Result count information for each source with results.
    */
  var sourceResultCounts: js.UndefOr[js.Array[SchemaSourceResultCount]] = js.undefined
}
object SchemaResultCounts {
  
  inline def apply(): SchemaResultCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultCounts]
  }
  
  extension [Self <: SchemaResultCounts](x: Self) {
    
    inline def setSourceResultCounts(value: js.Array[SchemaSourceResultCount]): Self = StObject.set(x, "sourceResultCounts", value.asInstanceOf[js.Any])
    
    inline def setSourceResultCountsUndefined: Self = StObject.set(x, "sourceResultCounts", js.undefined)
    
    inline def setSourceResultCountsVarargs(value: SchemaSourceResultCount*): Self = StObject.set(x, "sourceResultCounts", js.Array(value :_*))
  }
}
