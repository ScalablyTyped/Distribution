package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponsePartition extends StObject {
  
  var time_bucket: NewsRepositoryInboxResponseTimeBucket = js.native
}
object NewsRepositoryInboxResponsePartition {
  
  @scala.inline
  def apply(time_bucket: NewsRepositoryInboxResponseTimeBucket): NewsRepositoryInboxResponsePartition = {
    val __obj = js.Dynamic.literal(time_bucket = time_bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponsePartition]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponsePartitionMutableBuilder[Self <: NewsRepositoryInboxResponsePartition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime_bucket(value: NewsRepositoryInboxResponseTimeBucket): Self = StObject.set(x, "time_bucket", value.asInstanceOf[js.Any])
  }
}
