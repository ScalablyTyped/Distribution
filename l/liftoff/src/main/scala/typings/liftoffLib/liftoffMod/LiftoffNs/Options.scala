package typings
package liftoffLib.liftoffMod.LiftoffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A method to handle bash/zsh/whatever completions.
    * @default null
    */
  var completions: js.UndefOr[js.Function1[/* completion */ java.lang.String, _]] = js.undefined
  /**
    * An object of configuration files to find. Each property is keyed by the
    * default basename of the file being found, and the value is an object
    * of path arguments keyed by unique names.
    * @default null
    */
  var configFiles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[java.lang.String | finedLib.finedMod.finedNs.PathSpec]
    ]
  ] = js.undefined
  /**
    * Sets the name of the configuration file Liftoff will attempt to find. Case-insensitive.
    * @default null
    */
  var configName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set extensions to include when searching for a configuration file.
    * If an external module is needed to load a given extension (e.g. .coffee),
    * the module name should be specified as the value for the key.
    * @default {".js":null,".json":null}
    */
  var extensions: js.UndefOr[interpretLib.interpretMod.Extensions] = js.undefined
  /**
    * Sets which module your application expects to find locally when being run.
    * @default null
    */
  var moduleName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sugar for setting processTitle, moduleName, configName automatically.
    * @default null
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets what the process title will be.
    * @default null
    */
  var processTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any flag specified here will be applied to node, not your program.
    * Useful for supporting invocations like myapp --harmony command,
    * where --harmony should be passed to node, not your program.
    * This functionality is implemented using flagged-respawn.
    * To support all v8flags, see `v8flags`.
    * @default null
    */
  var v8flags: js.UndefOr[
    js.Array[java.lang.String] | (js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    completions: js.Function1[/* completion */ java.lang.String, _] = null,
    configFiles: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[java.lang.String | finedLib.finedMod.finedNs.PathSpec]
    ] = null,
    configName: java.lang.String = null,
    extensions: interpretLib.interpretMod.Extensions = null,
    moduleName: java.lang.String = null,
    name: java.lang.String = null,
    processTitle: java.lang.String = null,
    v8flags: js.Array[java.lang.String] | (js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (completions != null) __obj.updateDynamic("completions")(completions)
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

