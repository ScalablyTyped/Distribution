package typings.licenseCheckerWebpackPlugin.mod

import typings.licenseCheckerWebpackPlugin.anon.PartialDependency
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * SPDX expression with allowed licenses.
    *
    * Default: `"(Apache-2.0 OR BSD-2-Clause OR BSD-3-Clause OR MIT)"`
    */
  var allow: String = js.native
  
  /**
    * Whether to emit errors instead of warnings.
    *
    * Default: `false`
    */
  var emitError: Boolean = js.native
  
  /**
    * Regular expression that matches the file paths of dependencies to check.
    */
  var filter: RegExp = js.native
  
  /**
    * Array of dependencies to ignore, in the format `["<dependency name>@<version range>"]`.
    * For example, `["assignment@^2.0.0"]`.
    *
    * Default: `[]`
    */
  var ignore: js.Array[String] = js.native
  
  /**
    * Name of the third-party notices file with all licensing information.
    *
    * Default: `"ThirdPartyNotices.txt"`
    */
  var outputFilename: String = js.native
  
  /**
    * Path to a `.ejs` template, or function that will generate the contents
    * of the third-party notices file.
    */
  var outputWriter: String | OutputWriter = js.native
  
  /**
    * Object of dependencies to override, in the format `{"<dependency name>@<version range>": { ... }}`.
    * For example, `{"assignment@^2.0.0": { licenseName: "MIT" }}`.
    *
    * Default: `{}`
    */
  var `override`: Record[String, PartialDependency] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    allow: String,
    emitError: Boolean,
    filter: RegExp,
    ignore: js.Array[String],
    outputFilename: String,
    outputWriter: String | OutputWriter,
    `override`: Record[String, PartialDependency]
  ): Options = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], emitError = emitError.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], outputFilename = outputFilename.asInstanceOf[js.Any], outputWriter = outputWriter.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
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
    def setAllow(value: String): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitError(value: Boolean): Self = this.set("emitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: RegExp): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilename(value: String): Self = this.set("outputFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = this.set("outputWriter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutputWriter(value: String | OutputWriter): Self = this.set("outputWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverride(value: Record[String, PartialDependency]): Self = this.set("override", value.asInstanceOf[js.Any])
  }
}
