package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists columns (dimensions and metrics) for a particular report type.
  */
trait SchemaColumns extends StObject {
  
  /**
    * List of attributes names returned by columns.
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Etag of collection. This etag can be compared with the last response etag
    * to check if response has changed.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * List of columns for a report type.
    */
  var items: js.UndefOr[js.Array[SchemaColumn]] = js.undefined
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of columns returned in the response.
    */
  var totalResults: js.UndefOr[Double] = js.undefined
}
object SchemaColumns {
  
  inline def apply(): SchemaColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumns]
  }
  
  extension [Self <: SchemaColumns](x: Self) {
    
    inline def setAttributeNames(value: js.Array[String]): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "attributeNames", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaColumn]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaColumn*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
