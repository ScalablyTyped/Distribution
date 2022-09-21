package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceSpec extends StObject {
  
  /**
    * Template holds the latest specification for the Revision to be stamped out.
    */
  var template: js.UndefOr[SchemaRevisionTemplate] = js.undefined
  
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.undefined
}
object SchemaServiceSpec {
  
  inline def apply(): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpec]
  }
  
  extension [Self <: SchemaServiceSpec](x: Self) {
    
    inline def setTemplate(value: SchemaRevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTraffic(value: js.Array[SchemaTrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: SchemaTrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value*))
  }
}
