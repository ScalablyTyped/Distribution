package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTopicsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the topic to get.
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
