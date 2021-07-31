package typings.matrixAppserviceBridge

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configValidatorMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/config-validator", "ConfigValidator")
  @js.native
  class ConfigValidator protected () extends StObject {
    /**
      * Construct a validator of YAML files.
      * @param schema The JSON schema file object.
      */
    def this(schema: Schema) = this()
    
    var schema: js.Any = js.native
    
    /**
      * Validate the input config.
      * @param inputConfig The input config file path (string) or
      * parsed config (Object).
      * @param defaultConfig The default config options.
      * @return The input config with defaults applied.
      * @throws On validation errors
      */
    def validate(inputConfig: String): js.Any = js.native
    def validate(inputConfig: String, defaultConfig: Record[String, js.Any]): js.Any = js.native
    def validate(inputConfig: Schema): js.Any = js.native
    def validate(inputConfig: Schema, defaultConfig: Record[String, js.Any]): js.Any = js.native
  }
  /* static members */
  object ConfigValidator {
    
    @JSImport("matrix-appservice-bridge/lib/components/config-validator", "ConfigValidator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromSchemaFile(filename: String): ConfigValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSchemaFile")(filename.asInstanceOf[js.Any]).asInstanceOf[ConfigValidator]
    
    @JSImport("matrix-appservice-bridge/lib/components/config-validator", "ConfigValidator.loadFromFile")
    @js.native
    def loadFromFile: js.Any = js.native
    @scala.inline
    def loadFromFile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadFromFile")(x.asInstanceOf[js.Any])
  }
  
  type Schema = js.Any
}
