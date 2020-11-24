package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the Fragment object contains fragment related info
  */
@js.native
trait Fragment extends js.Object {
  
  /**
    * continuity count
    */
  var cc: Double = js.native
  
  /**
    * fragment duration
    */
  var duration: Double = js.native
  
  /**
    * fragment level identifier
    */
  var level: Double = js.native
  
  /**
    * stream start date and time
    */
  var programDateTime: Double = js.native
  
  /**
    * fragment sequence number
    */
  var sn: Double = js.native
  
  /**
    * fragment start offset
    */
  var start: Double = js.native
  
  /**
    * list of tags associated with the fragment
    */
  var tagList: js.Array[js.Array[String]] = js.native
  
  /**
    * fragment title
    */
  var title: String = js.native
  
  /**
    * fragment url
    */
  var url: String = js.native
}
object Fragment {
  
  @scala.inline
  def apply(
    cc: Double,
    duration: Double,
    level: Double,
    programDateTime: Double,
    sn: Double,
    start: Double,
    tagList: js.Array[js.Array[String]],
    title: String,
    url: String
  ): Fragment = {
    val __obj = js.Dynamic.literal(cc = cc.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], programDateTime = programDateTime.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tagList = tagList.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    
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
    def setCc(value: Double): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTime(value: Double): Self = this.set("programDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSn(value: Double): Self = this.set("sn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListVarargs(value: js.Array[String]*): Self = this.set("tagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: js.Array[js.Array[String]]): Self = this.set("tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
