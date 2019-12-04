package typings.gulpDashUglify

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyDashJs.uglifyDashJsMod.MinifyOptions
import typings.uglifyDashJs.uglifyDashJsMod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_File extends js.Object {
  def apply(files: String): MinifyOutput = js.native
  def apply(files: String, options: MinifyOptions): MinifyOutput = js.native
  def apply(files: js.Array[String]): MinifyOutput = js.native
  def apply(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def apply(files: StringDictionary[String]): MinifyOutput = js.native
  def apply(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
}

