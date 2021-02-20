package typings.matrixAppserviceBridge.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffectsRegistration extends StObject {
  
  var affectsRegistration: js.UndefOr[Boolean] = js.native
  
  var defaults: Record[String, _] = js.native
  
  var schema: String | (Record[String, _]) = js.native
}
object AffectsRegistration {
  
  @scala.inline
  def apply(defaults: Record[String, _], schema: String | (Record[String, _])): AffectsRegistration = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectsRegistration]
  }
  
  @scala.inline
  implicit class AffectsRegistrationMutableBuilder[Self <: AffectsRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectsRegistration(value: Boolean): Self = StObject.set(x, "affectsRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectsRegistrationUndefined: Self = StObject.set(x, "affectsRegistration", js.undefined)
    
    @scala.inline
    def setDefaults(value: Record[String, _]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String | (Record[String, _])): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
