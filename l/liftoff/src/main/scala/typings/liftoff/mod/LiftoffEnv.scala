package typings.liftoff.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftoffEnv extends js.Object {
  /**
    * the base directory of your configuration file (if found)
    */
  var configBase: js.UndefOr[String] = js.undefined
  /**
    * an object of filepaths for each found config file (filepath values will be null if not found)
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | Null]]] = js.undefined
  /**
    * the config files searched for
    */
  var configNameSearch: js.Array[String]
  /**
    * the full path to your configuration file (if found)
    */
  var configPath: js.UndefOr[String] = js.undefined
  /**
    * the current working directory
    */
  var cwd: String
  /**
    * the contents of the local module's package.json (if found)
    */
  var modulePackage: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * the full path to the local module your project relies on (if found)
    */
  var modulePath: js.UndefOr[String] = js.undefined
  /**
    * an array of modules that liftoff tried to pre-load
    */
  var require: js.Array[String]
}

object LiftoffEnv {
  @scala.inline
  def apply(
    configNameSearch: js.Array[String],
    cwd: String,
    require: js.Array[String],
    configBase: String = null,
    configFiles: StringDictionary[StringDictionary[String | Null]] = null,
    configPath: String = null,
    modulePackage: StringDictionary[js.Any] = null,
    modulePath: String = null
  ): LiftoffEnv = {
    val __obj = js.Dynamic.literal(configNameSearch = configNameSearch.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
    if (configBase != null) __obj.updateDynamic("configBase")(configBase.asInstanceOf[js.Any])
    if (configFiles != null) __obj.updateDynamic("configFiles")(configFiles.asInstanceOf[js.Any])
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (modulePackage != null) __obj.updateDynamic("modulePackage")(modulePackage.asInstanceOf[js.Any])
    if (modulePath != null) __obj.updateDynamic("modulePath")(modulePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftoffEnv]
  }
}

