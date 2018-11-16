package typings
package gulpDashUglifyLib.composerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uglify extends js.Object {
  @JSName("minify")
  var minify_Original: js.Function2[
    /* files */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
    /* options */ uglifyDashJsLib.uglifyDashJsMod.MinifyOptions, 
    uglifyDashJsLib.uglifyDashJsMod.MinifyOutput
  ] = js.native
  def minify(
    files: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    options: uglifyDashJsLib.uglifyDashJsMod.MinifyOptions
  ): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
}

