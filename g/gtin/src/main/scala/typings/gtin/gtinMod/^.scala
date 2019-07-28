package typings.gtin.gtinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFormat(gtin: String): GtinFormat = js.native
  def getRealFormat(gtin: String): GtinFormat = js.native
  def isGTIN(gtin: String): Boolean = js.native
  def minify(gtin: String): String = js.native
  def validate(gtin: String): Boolean = js.native
}

