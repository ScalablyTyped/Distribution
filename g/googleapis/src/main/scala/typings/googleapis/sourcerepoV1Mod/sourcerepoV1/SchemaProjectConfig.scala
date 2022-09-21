package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectConfig extends StObject {
  
  /**
    * Reject a Git push that contains a private key.
    */
  var enablePrivateKeyCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the project. Values are of the form `projects/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig] | Null] = js.undefined
}
object SchemaProjectConfig {
  
  inline def apply(): SchemaProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectConfig]
  }
  
  extension [Self <: SchemaProjectConfig](x: Self) {
    
    inline def setEnablePrivateKeyCheck(value: Boolean): Self = StObject.set(x, "enablePrivateKeyCheck", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateKeyCheckNull: Self = StObject.set(x, "enablePrivateKeyCheck", null)
    
    inline def setEnablePrivateKeyCheckUndefined: Self = StObject.set(x, "enablePrivateKeyCheck", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = StObject.set(x, "pubsubConfigs", value.asInstanceOf[js.Any])
    
    inline def setPubsubConfigsNull: Self = StObject.set(x, "pubsubConfigs", null)
    
    inline def setPubsubConfigsUndefined: Self = StObject.set(x, "pubsubConfigs", js.undefined)
  }
}
