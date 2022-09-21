package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHl7SchemaConfig extends StObject {
  
  /**
    * Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group.
    */
  var messageSchemaConfigs: js.UndefOr[StringDictionary[SchemaSchemaGroup] | Null] = js.undefined
  
  /**
    * Each VersionSource is tested and only if they all match is the schema used for the message.
    */
  var version: js.UndefOr[js.Array[SchemaVersionSource]] = js.undefined
}
object SchemaHl7SchemaConfig {
  
  inline def apply(): SchemaHl7SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHl7SchemaConfig]
  }
  
  extension [Self <: SchemaHl7SchemaConfig](x: Self) {
    
    inline def setMessageSchemaConfigs(value: StringDictionary[SchemaSchemaGroup]): Self = StObject.set(x, "messageSchemaConfigs", value.asInstanceOf[js.Any])
    
    inline def setMessageSchemaConfigsNull: Self = StObject.set(x, "messageSchemaConfigs", null)
    
    inline def setMessageSchemaConfigsUndefined: Self = StObject.set(x, "messageSchemaConfigs", js.undefined)
    
    inline def setVersion(value: js.Array[SchemaVersionSource]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: SchemaVersionSource*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
