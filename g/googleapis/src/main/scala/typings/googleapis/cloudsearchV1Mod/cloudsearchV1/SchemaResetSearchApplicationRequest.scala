package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResetSearchApplicationRequest extends StObject {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
}
object SchemaResetSearchApplicationRequest {
  
  @scala.inline
  def apply(): SchemaResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetSearchApplicationRequest]
  }
  
  @scala.inline
  implicit class SchemaResetSearchApplicationRequestMutableBuilder[Self <: SchemaResetSearchApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
  }
}
