package typings.liftoff.liftoffMod

import org.scalablytyped.runtime.StringDictionary
import typings.fined.finedMod.PathSpec
import typings.interpret.interpretMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A method to handle bash/zsh/whatever completions.
    * @default null
    */
  var completions: js.UndefOr[js.Function1[/* completion */ String, _]] = js.undefined
  /**
    * An object of configuration files to find. Each property is keyed by the
    * default basename of the file being found, and the value is an object
    * of path arguments keyed by unique names.
    * @default null
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | PathSpec]]] = js.undefined
  /**
    * Sets the name of the configuration file Liftoff will attempt to find. Case-insensitive.
    * @default null
    */
  var configName: js.UndefOr[String] = js.undefined
  /**
    * Set extensions to include when searching for a configuration file.
    * If an external module is needed to load a given extension (e.g. .coffee),
    * the module name should be specified as the value for the key.
    * @default {".js":null,".json":null}
    */
  var extensions: js.UndefOr[Extensions] = js.undefined
  /**
    * Sets which module your application expects to find locally when being run.
    * @default null
    */
  var moduleName: js.UndefOr[String] = js.undefined
  /**
    * Sugar for setting processTitle, moduleName, configName automatically.
    * @default null
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Sets what the process title will be.
    * @default null
    */
  var processTitle: js.UndefOr[String] = js.undefined
  /**
    * Any flag specified here will be applied to node, not your program.
    * Useful for supporting invocations like myapp --harmony command,
    * where --harmony should be passed to node, not your program.
    * This functionality is implemented using flagged-respawn.
    * To support all v8flags, see `v8flags`.
    * @default null
    */
  var v8flags: js.UndefOr[
    js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    completions: /* completion */ String => _ = null,
    configFiles: StringDictionary[StringDictionary[String | PathSpec]] = null,
    configName: String = null,
    extensions: Extensions = null,
    moduleName: String = null,
    name: String = null,
    processTitle: String = null,
    v8flags: js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (completions != null) __obj.updateDynamic("completions")(js.Any.fromFunction1(completions))
    if (configFiles != null) __obj.updateDynamic("configFiles")(configFiles)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (processTitle != null) __obj.updateDynamic("processTitle")(processTitle)
    if (v8flags != null) __obj.updateDynamic("v8flags")(v8flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

