package typings.mapboxS3urls.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucketinhost extends js.Object {
  
  var `bucket-in-host`: String = js.native
  
  var `bucket-in-path`: String = js.native
  
  var s3: String = js.native
}
object Bucketinhost {
  
  @scala.inline
  def apply(`bucket-in-host`: String, `bucket-in-path`: String, s3: String): Bucketinhost = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.updateDynamic("bucket-in-host")(`bucket-in-host`.asInstanceOf[js.Any])
    __obj.updateDynamic("bucket-in-path")(`bucket-in-path`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucketinhost]
  }
  
  @scala.inline
  implicit class BucketinhostOps[Self <: Bucketinhost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setBucket-in-host`(value: String): Self = this.set("bucket-in-host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBucket-in-path`(value: String): Self = this.set("bucket-in-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3(value: String): Self = this.set("s3", value.asInstanceOf[js.Any])
  }
}
