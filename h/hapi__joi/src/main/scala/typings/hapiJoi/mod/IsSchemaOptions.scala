package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSchemaOptions extends StObject {
  
  /**
    * If true, will identify schemas from older versions of joi, otherwise will throw an error.
    *
    * @default false
    */
  var legacy: Boolean = js.native
}
object IsSchemaOptions {
  
  @scala.inline
  def apply(legacy: Boolean): IsSchemaOptions = {
    val __obj = js.Dynamic.literal(legacy = legacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSchemaOptions]
  }
  
  @scala.inline
  implicit class IsSchemaOptionsMutableBuilder[Self <: IsSchemaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
  }
}
