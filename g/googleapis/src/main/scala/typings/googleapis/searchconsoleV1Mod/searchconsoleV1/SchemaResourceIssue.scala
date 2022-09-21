package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceIssue extends StObject {
  
  /**
    * Describes a blocked resource issue.
    */
  var blockedResource: js.UndefOr[SchemaBlockedResource] = js.undefined
}
object SchemaResourceIssue {
  
  inline def apply(): SchemaResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceIssue]
  }
  
  extension [Self <: SchemaResourceIssue](x: Self) {
    
    inline def setBlockedResource(value: SchemaBlockedResource): Self = StObject.set(x, "blockedResource", value.asInstanceOf[js.Any])
    
    inline def setBlockedResourceUndefined: Self = StObject.set(x, "blockedResource", js.undefined)
  }
}
