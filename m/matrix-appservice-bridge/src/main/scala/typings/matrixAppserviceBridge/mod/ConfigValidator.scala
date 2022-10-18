package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.libComponentsConfigValidatorMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ConfigValidator")
@js.native
open class ConfigValidator protected ()
  extends typings.matrixAppserviceBridge.libComponentsConfigValidatorMod.ConfigValidator {
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
  
  inline def fromSchemaFile(filename: String): typings.matrixAppserviceBridge.libComponentsConfigValidatorMod.ConfigValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSchemaFile")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppserviceBridge.libComponentsConfigValidatorMod.ConfigValidator]
  
  @JSImport("matrix-appservice-bridge", "ConfigValidator.loadFromFile")
  @js.native
  def loadFromFile: Any = js.native
  inline def loadFromFile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadFromFile")(x.asInstanceOf[js.Any])
}
