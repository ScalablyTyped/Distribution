package typings.matrixAppserviceBridge.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffectsRegistration extends StObject {
  
  /**
    * If true, the config will be required when generating a registration file.
    */
  var affectsRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default options for the config file.
    */
  var defaults: Record[String, Any]
  
  /**
    * Path to a schema YAML file (string) or the parsed schema file (object).
    */
  var schema: String | (Record[String, Any])
}
object AffectsRegistration {
  
  inline def apply(defaults: Record[String, Any], schema: String | (Record[String, Any])): AffectsRegistration = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectsRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffectsRegistration] (val x: Self) extends AnyVal {
    
    inline def setAffectsRegistration(value: Boolean): Self = StObject.set(x, "affectsRegistration", value.asInstanceOf[js.Any])
    
    inline def setAffectsRegistrationUndefined: Self = StObject.set(x, "affectsRegistration", js.undefined)
    
    inline def setDefaults(value: Record[String, Any]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String | (Record[String, Any])): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
