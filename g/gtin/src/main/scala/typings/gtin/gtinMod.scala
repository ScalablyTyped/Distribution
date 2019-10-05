package typings.gtin

import typings.gtin.gtinMod.GtinFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtin", JSImport.Namespace)
@js.native
object gtinMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.gtin.gtinStrings.`GTIN-8`
    - typings.gtin.gtinStrings.`GTIN-12`
    - typings.gtin.gtinStrings.`GTIN-13`
    - typings.gtin.gtinStrings.`GTIN-14`
  */
  trait GtinFormat extends js.Object
  
  def getFormat(gtin: String): GtinFormat = js.native
  def getRealFormat(gtin: String): GtinFormat = js.native
  def isGTIN(gtin: String): Boolean = js.native
  def minify(gtin: String): String = js.native
  def validate(gtin: String): Boolean = js.native
  @js.native
  object upce extends js.Object {
    def compress(gtin: String): String | Null = js.native
    def expand(gtin: String): String = js.native
  }
  
}

