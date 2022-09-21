package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMultiOutputInfo extends StObject {
  
  /**
    * The id of the tag the user code will emit to this output by; this should correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaMultiOutputInfo {
  
  inline def apply(): SchemaMultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiOutputInfo]
  }
  
  extension [Self <: SchemaMultiOutputInfo](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
