package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseTimeBucket extends StObject {
  
  var headers: js.Array[String] = js.native
  
  var indices: js.Array[Double] = js.native
}
object NewsRepositoryInboxResponseTimeBucket {
  
  @scala.inline
  def apply(headers: js.Array[String], indices: js.Array[Double]): NewsRepositoryInboxResponseTimeBucket = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseTimeBucket]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseTimeBucketMutableBuilder[Self <: NewsRepositoryInboxResponseTimeBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
  }
}
