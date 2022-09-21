package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the topic to get.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceTopicsGet {
  
  inline def apply(): ParamsResourceTopicsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicsGet]
  }
  
  extension [Self <: ParamsResourceTopicsGet](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
