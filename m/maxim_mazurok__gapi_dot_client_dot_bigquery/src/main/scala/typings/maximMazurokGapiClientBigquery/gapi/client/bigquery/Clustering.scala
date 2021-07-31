package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clustering extends StObject {
  
  /**
    * [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the
    * order of columns you specify is important. The order of the specified columns determines the sort order of the data.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}
object Clustering {
  
  @scala.inline
  def apply(): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clustering]
  }
  
  @scala.inline
  implicit class ClusteringMutableBuilder[Self <: Clustering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
