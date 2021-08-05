package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponsePartition extends StObject {
  
  var time_bucket: NewsRepositoryInboxResponseTimeBucket
}
object NewsRepositoryInboxResponsePartition {
  
  inline def apply(time_bucket: NewsRepositoryInboxResponseTimeBucket): NewsRepositoryInboxResponsePartition = {
    val __obj = js.Dynamic.literal(time_bucket = time_bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponsePartition]
  }
  
  extension [Self <: NewsRepositoryInboxResponsePartition](x: Self) {
    
    inline def setTime_bucket(value: NewsRepositoryInboxResponseTimeBucket): Self = StObject.set(x, "time_bucket", value.asInstanceOf[js.Any])
  }
}
