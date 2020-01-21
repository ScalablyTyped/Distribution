package typings.lodash.fpMod

import typings.lodash.mod.ReplaceFunction
import typings.lodash.mod.__
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReplace1x4 extends js.Object {
  def apply(pattern: String): LodashReplace1x5 = js.native
  def apply(pattern: String, replacement: String): String = js.native
  def apply(pattern: String, replacement: ReplaceFunction): String = js.native
  def apply(pattern: __, replacement: String): LodashReplace1x6 = js.native
  def apply(pattern: __, replacement: ReplaceFunction): LodashReplace1x6 = js.native
  def apply(pattern: RegExp): LodashReplace1x5 = js.native
  def apply(pattern: RegExp, replacement: String): String = js.native
  def apply(pattern: RegExp, replacement: ReplaceFunction): String = js.native
}

