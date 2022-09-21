package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumerProject extends StObject {
  
  /**
    * Required. Project number of the consumer that is launching the service instance. It can own the network that is peered with Google or, be a service project in an XPN where the host project has the network.
    */
  var projectNum: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsumerProject {
  
  inline def apply(): SchemaConsumerProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerProject]
  }
  
  extension [Self <: SchemaConsumerProject](x: Self) {
    
    inline def setProjectNum(value: String): Self = StObject.set(x, "projectNum", value.asInstanceOf[js.Any])
    
    inline def setProjectNumNull: Self = StObject.set(x, "projectNum", null)
    
    inline def setProjectNumUndefined: Self = StObject.set(x, "projectNum", js.undefined)
  }
}
