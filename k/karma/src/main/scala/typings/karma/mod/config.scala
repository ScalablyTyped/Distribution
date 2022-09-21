package typings.karma.mod

import typings.karma.anon.ParseOptionspromiseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("karma", "config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseConfig(configFilePath: String, cliOptions: ConfigOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  inline def parseConfig(configFilePath: String, cliOptions: ConfigOptions, parseOptions: ParseOptionspromiseConfig): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
  inline def parseConfig(configFilePath: String, cliOptions: ConfigOptions, parseOptions: ParseOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  inline def parseConfig(configFilePath: Null, cliOptions: ConfigOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  inline def parseConfig(configFilePath: Null, cliOptions: ConfigOptions, parseOptions: ParseOptionspromiseConfig): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
  inline def parseConfig(configFilePath: Null, cliOptions: ConfigOptions, parseOptions: ParseOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  inline def parseConfig(configFilePath: Unit, cliOptions: ConfigOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  inline def parseConfig(configFilePath: Unit, cliOptions: ConfigOptions, parseOptions: ParseOptionspromiseConfig): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
  inline def parseConfig(configFilePath: Unit, cliOptions: ConfigOptions, parseOptions: ParseOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any], parseOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
  
  inline def parseConfig_Promise(configFilePath: String, cliOptions: ConfigOptions): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
  inline def parseConfig_Promise(configFilePath: Null, cliOptions: ConfigOptions): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
  inline def parseConfig_Promise(configFilePath: Unit, cliOptions: ConfigOptions): js.Promise[Config_] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config_]]
}
