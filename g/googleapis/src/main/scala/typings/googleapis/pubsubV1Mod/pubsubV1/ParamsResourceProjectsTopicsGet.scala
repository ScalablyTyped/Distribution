package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTopicsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the topic to get. Format is `projects/{project\}/topics/{topic\}`.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTopicsGet {
  
  inline def apply(): ParamsResourceProjectsTopicsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTopicsGet]
  }
  
  extension [Self <: ParamsResourceProjectsTopicsGet](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
