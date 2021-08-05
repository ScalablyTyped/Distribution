package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseTimeBucket extends StObject {
  
  var headers: js.Array[String]
  
  var indices: js.Array[Double]
}
object NewsRepositoryInboxResponseTimeBucket {
  
  inline def apply(headers: js.Array[String], indices: js.Array[Double]): NewsRepositoryInboxResponseTimeBucket = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseTimeBucket]
  }
  
  extension [Self <: NewsRepositoryInboxResponseTimeBucket](x: Self) {
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
  }
}
