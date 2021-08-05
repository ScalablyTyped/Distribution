package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.configValidatorMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ConfigValidator")
@js.native
class ConfigValidator protected ()
  extends typings.matrixAppserviceBridge.configValidatorMod.ConfigValidator {
  /**
    * Construct a validator of YAML files.
    * @param schema The JSON schema file object.
    */
  def this(schema: Schema) = this()
}
/* static members */
object ConfigValidator {
  
  @JSImport("matrix-appservice-bridge", "ConfigValidator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSchemaFile(filename: String): typings.matrixAppserviceBridge.configValidatorMod.ConfigValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSchemaFile")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppserviceBridge.configValidatorMod.ConfigValidator]
  
  @JSImport("matrix-appservice-bridge", "ConfigValidator.loadFromFile")
  @js.native
  def loadFromFile: js.Any = js.native
  inline def loadFromFile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadFromFile")(x.asInstanceOf[js.Any])
}
