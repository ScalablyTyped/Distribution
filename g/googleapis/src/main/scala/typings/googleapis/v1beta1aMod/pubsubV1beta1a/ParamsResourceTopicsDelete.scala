package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTopicsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the topic to delete.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object ParamsResourceTopicsDelete {
  
  inline def apply(): ParamsResourceTopicsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTopicsDelete]
  }
  
  extension [Self <: ParamsResourceTopicsDelete](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
