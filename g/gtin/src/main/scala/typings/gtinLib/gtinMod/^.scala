package typings
package gtinLib.gtinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFormat(gtin: java.lang.String): gtinLib.gtinMod.GtinFormat = js.native
  def getRealFormat(gtin: java.lang.String): gtinLib.gtinMod.GtinFormat = js.native
  def isGTIN(gtin: java.lang.String): scala.Boolean = js.native
  def minify(gtin: java.lang.String): java.lang.String = js.native
  def validate(gtin: java.lang.String): scala.Boolean = js.native
}

