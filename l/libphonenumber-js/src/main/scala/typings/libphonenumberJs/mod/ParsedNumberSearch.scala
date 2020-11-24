package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "ParsedNumberSearch")
@js.native
class ParsedNumberSearch protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: `0`) = this()
  
  def hasNext(): Boolean = js.native
  
  def next(): js.UndefOr[NumberFoundLegacy] = js.native
}
