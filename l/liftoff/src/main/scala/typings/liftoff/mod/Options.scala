package typings.liftoff.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fined.mod.PathSpec
import typings.interpret.mod.Extensions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A method to handle bash/zsh/whatever completions.
    * @default null
    */
  var completions: js.UndefOr[js.Function1[/* completion */ String, _]] = js.native
  /**
    * An object of configuration files to find. Each property is keyed by the
    * default basename of the file being found, and the value is an object
    * of path arguments keyed by unique names.
    * @default null
    */
  var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | PathSpec]]] = js.native
  /**
    * Sets the name of the configuration file Liftoff will attempt to find. Case-insensitive.
    * @default null
    */
  var configName: js.UndefOr[String] = js.native
  /**
    * Set extensions to include when searching for a configuration file.
    * If an external module is needed to load a given extension (e.g. .coffee),
    * the module name should be specified as the value for the key.
    * @default {".js":null,".json":null}
    */
  var extensions: js.UndefOr[Extensions_] = js.native
  /**
    * Sets which module your application expects to find locally when being run.
    * @default null
    */
  var moduleName: js.UndefOr[String] = js.native
  /**
    * Sugar for setting processTitle, moduleName, configName automatically.
    * @default null
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sets what the process title will be.
    * @default null
    */
  var processTitle: js.UndefOr[String] = js.native
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
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletions(value: /* completion */ String => _): Self = this.set("completions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompletions: Self = this.set("completions", js.undefined)
    @scala.inline
    def setConfigFiles(value: StringDictionary[StringDictionary[String | PathSpec]]): Self = this.set("configFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFiles: Self = this.set("configFiles", js.undefined)
    @scala.inline
    def setConfigName(value: String): Self = this.set("configName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigName: Self = this.set("configName", js.undefined)
    @scala.inline
    def setExtensions(value: Extensions_): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleName: Self = this.set("moduleName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProcessTitle(value: String): Self = this.set("processTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessTitle: Self = this.set("processTitle", js.undefined)
    @scala.inline
    def setV8flagsVarargs(value: String*): Self = this.set("v8flags", js.Array(value :_*))
    @scala.inline
    def setV8flagsFunction1(value: /* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit] => Unit): Self = this.set("v8flags", js.Any.fromFunction1(value))
    @scala.inline
    def setV8flags(
      value: js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
    ): Self = this.set("v8flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV8flags: Self = this.set("v8flags", js.undefined)
  }
  
}

