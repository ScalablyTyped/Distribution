package typings
package gulpDashUglifyLib.composerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uglify extends js.Object {
  @JSName("minify")
  var minify_Original: gulpDashUglifyLib.Anon_File = js.native
  def minify(files: java.lang.String): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
  def minify(files: java.lang.String, options: uglifyDashJsLib.uglifyDashJsMod.MinifyOptions): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String]): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
  def minify(files: js.Array[java.lang.String], options: uglifyDashJsLib.uglifyDashJsMod.MinifyOptions): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
  def minify(files: org.scalablytyped.runtime.StringDictionary[java.lang.String]): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
  def minify(
    files: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    options: uglifyDashJsLib.uglifyDashJsMod.MinifyOptions
  ): uglifyDashJsLib.uglifyDashJsMod.MinifyOutput = js.native
}

