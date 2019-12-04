package typings.lodash.fpMod

import typings.lodash.lodashMod.ReplaceFunction
import typings.lodash.lodashMod.__
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReplace extends js.Object {
  def apply(pattern: String): LodashReplace1x1 = js.native
  def apply(pattern: String, replacement: String): LodashReplace1x3 = js.native
  def apply(pattern: String, replacement: String, string: String): String = js.native
  def apply(pattern: String, replacement: ReplaceFunction): LodashReplace1x3 = js.native
  def apply(pattern: String, replacement: ReplaceFunction, string: String): String = js.native
  def apply(pattern: String, replacement: __, string: String): LodashReplace1x5 = js.native
  def apply(pattern: __, replacement: String): LodashReplace1x2 = js.native
  def apply(pattern: __, replacement: String, string: String): LodashReplace1x6 = js.native
  def apply(pattern: __, replacement: ReplaceFunction): LodashReplace1x2 = js.native
  def apply(pattern: __, replacement: ReplaceFunction, string: String): LodashReplace1x6 = js.native
  def apply(pattern: __, replacement: __, string: String): LodashReplace1x4 = js.native
  def apply(pattern: RegExp): LodashReplace1x1 = js.native
  def apply(pattern: RegExp, replacement: String): LodashReplace1x3 = js.native
  def apply(pattern: RegExp, replacement: String, string: String): String = js.native
  def apply(pattern: RegExp, replacement: ReplaceFunction): LodashReplace1x3 = js.native
  def apply(pattern: RegExp, replacement: ReplaceFunction, string: String): String = js.native
  def apply(pattern: RegExp, replacement: __, string: String): LodashReplace1x5 = js.native
}

