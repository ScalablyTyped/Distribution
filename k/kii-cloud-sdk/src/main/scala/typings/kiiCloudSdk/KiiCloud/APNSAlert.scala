package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSAlert extends StObject {
  
  var `action-loc-key`: String
  
  var body: String
  
  var `launch-image`: String
  
  var `loc-args`: js.Array[String]
  
  var `loc-key`: String
  
  var title: String
  
  var `title-loc-args`: js.Array[String]
  
  var `title-loc-key`: String
}
object APNSAlert {
  
  inline def apply(
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
  
  extension [Self <: APNSAlert](x: Self) {
    
    inline def `setAction-loc-key`(value: String): Self = StObject.set(x, "action-loc-key", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def `setLaunch-image`(value: String): Self = StObject.set(x, "launch-image", value.asInstanceOf[js.Any])
    
    inline def `setLoc-args`(value: js.Array[String]): Self = StObject.set(x, "loc-args", value.asInstanceOf[js.Any])
    
    inline def `setLoc-argsVarargs`(value: String*): Self = StObject.set(x, "loc-args", js.Array(value :_*))
    
    inline def `setLoc-key`(value: String): Self = StObject.set(x, "loc-key", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def `setTitle-loc-args`(value: js.Array[String]): Self = StObject.set(x, "title-loc-args", value.asInstanceOf[js.Any])
    
    inline def `setTitle-loc-argsVarargs`(value: String*): Self = StObject.set(x, "title-loc-args", js.Array(value :_*))
    
    inline def `setTitle-loc-key`(value: String): Self = StObject.set(x, "title-loc-key", value.asInstanceOf[js.Any])
  }
}
