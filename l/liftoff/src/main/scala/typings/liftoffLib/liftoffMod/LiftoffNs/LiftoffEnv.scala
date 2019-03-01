package typings
package liftoffLib.liftoffMod.LiftoffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftoffEnv extends js.Object {
  /**
    * the base directory of your configuration file (if found)
    */
  var configBase: js.UndefOr[java.lang.String]
  /**
    * an object of filepaths for each found config file (filepath values will be null if not found)
    */
  var configFiles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]]
  ]
  /**
    * the config files searched for
    */
  var configNameSearch: js.Array[java.lang.String]
  /**
    * the full path to your configuration file (if found)
    */
  var configPath: js.UndefOr[java.lang.String]
  /**
    * the current working directory
    */
  var cwd: java.lang.String
  /**
    * the contents of the local module's package.json (if found)
    */
  var modulePackage: js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]
  /**
    * the full path to the local module your project relies on (if found)
    */
  var modulePath: js.UndefOr[java.lang.String]
  /**
    * an array of modules that liftoff tried to pre-load
    */
  var require: js.Array[java.lang.String]
}

object LiftoffEnv {
  @scala.inline
  def apply(
    configNameSearch: js.Array[java.lang.String],
    cwd: java.lang.String,
    require: js.Array[java.lang.String],
    configBase: java.lang.String = null,
    configFiles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]] = null,
    configPath: java.lang.String = null,
    modulePackage: org.scalablytyped.runtime.StringDictionary[_] = null,
    modulePath: java.lang.String = null
  ): LiftoffEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configNameSearch")(configNameSearch)
    __obj.updateDynamic("cwd")(cwd)
    __obj.updateDynamic("require")(require)
    if (configBase != null) __obj.updateDynamic("configBase")(configBase)
    if (configFiles != null) __obj.updateDynamic("configFiles")(configFiles)
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (modulePackage != null) __obj.updateDynamic("modulePackage")(modulePackage)
    if (modulePath != null) __obj.updateDynamic("modulePath")(modulePath)
    __obj.asInstanceOf[LiftoffEnv]
  }
}

