package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSAlert extends js.Object {
  
  var `action-loc-key`: String = js.native
  
  var body: String = js.native
  
  var `launch-image`: String = js.native
  
  var `loc-args`: js.Array[String] = js.native
  
  var `loc-key`: String = js.native
  
  var title: String = js.native
  
  var `title-loc-args`: js.Array[String] = js.native
  
  var `title-loc-key`: String = js.native
}
object APNSAlert {
  
  @scala.inline
  def apply(
    `action-loc-key`: String,
    body: String,
    `launch-image`: String,
    `loc-args`: js.Array[String],
    `loc-key`: String,
    title: String,
    `title-loc-args`: js.Array[String],
    `title-loc-key`: String
  ): APNSAlert = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("action-loc-key")(`action-loc-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("launch-image")(`launch-image`.asInstanceOf[js.Any])
    __obj.updateDynamic("loc-args")(`loc-args`.asInstanceOf[js.Any])
    __obj.updateDynamic("loc-key")(`loc-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("title-loc-args")(`title-loc-args`.asInstanceOf[js.Any])
    __obj.updateDynamic("title-loc-key")(`title-loc-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSAlert]
  }
  
  @scala.inline
  implicit class APNSAlertOps[Self <: APNSAlert] (val x: Self) extends AnyVal {
    
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
    def `setAction-loc-key`(value: String): Self = this.set("action-loc-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLaunch-image`(value: String): Self = this.set("launch-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLoc-argsVarargs`(value: String*): Self = this.set("loc-args", js.Array(value :_*))
    
    @scala.inline
    def `setLoc-args`(value: js.Array[String]): Self = this.set("loc-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLoc-key`(value: String): Self = this.set("loc-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTitle-loc-argsVarargs`(value: String*): Self = this.set("title-loc-args", js.Array(value :_*))
    
    @scala.inline
    def `setTitle-loc-args`(value: js.Array[String]): Self = this.set("title-loc-args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTitle-loc-key`(value: String): Self = this.set("title-loc-key", value.asInstanceOf[js.Any])
  }
}
