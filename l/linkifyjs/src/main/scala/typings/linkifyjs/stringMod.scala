package typings.linkifyjs

import typings.linkifyjs.linkifyjsMod.LinkifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linkifyjs/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  def default(str: String): String = js.native
  def default(str: String, options: LinkifyOptions): String = js.native
  def linkifyStr(str: String): String = js.native
  def linkifyStr(str: String, options: LinkifyOptions): String = js.native
}

