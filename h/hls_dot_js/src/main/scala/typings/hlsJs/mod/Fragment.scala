package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the Fragment object contains fragment related info
  */
@js.native
trait Fragment extends StObject {
  
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
  implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCc(value: Double): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramDateTime(value: Double): Self = StObject.set(x, "programDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSn(value: Double): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListVarargs(value: js.Array[String]*): Self = StObject.set(x, "tagList", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
