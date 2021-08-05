package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the Fragment object contains fragment related info
  */
trait Fragment extends StObject {
  
  /**
    * continuity count
    */
  var cc: Double
  
  /**
    * fragment duration
    */
  var duration: Double
  
  /**
    * fragment level identifier
    */
  var level: Double
  
  /**
    * stream start date and time
    */
  var programDateTime: Double
  
  /**
    * fragment sequence number
    */
  var sn: Double
  
  /**
    * fragment start offset
    */
  var start: Double
  
  /**
    * list of tags associated with the fragment
    */
  var tagList: js.Array[js.Array[String]]
  
  /**
    * fragment title
    */
  var title: String
  
  /**
    * fragment url
    */
  var url: String
}
object Fragment {
  
  inline def apply(
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
  
  extension [Self <: Fragment](x: Self) {
    
    inline def setCc(value: Double): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setProgramDateTime(value: Double): Self = StObject.set(x, "programDateTime", value.asInstanceOf[js.Any])
    
    inline def setSn(value: Double): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "tagList", value.asInstanceOf[js.Any])
    
    inline def setTagListVarargs(value: js.Array[String]*): Self = StObject.set(x, "tagList", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
