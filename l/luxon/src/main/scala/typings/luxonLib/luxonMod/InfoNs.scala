package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Info")
@js.native
object InfoNs extends js.Object {
  def eras(): js.Array[java.lang.String] = js.native
  def eras(length: luxonLib.luxonMod.EraLength): js.Array[java.lang.String] = js.native
  def eras(length: luxonLib.luxonMod.EraLength, options: luxonLib.luxonMod.InfoOptions): js.Array[java.lang.String] = js.native
  def features(): luxonLib.luxonMod.Features = js.native
  def hasDST(zone: java.lang.String): scala.Boolean = js.native
  def hasDST(zone: luxonLib.luxonMod.Zone): scala.Boolean = js.native
  def isValidIANAZone(zone: java.lang.String): scala.Boolean = js.native
  def meridiems(): js.Array[java.lang.String] = js.native
  def meridiems(options: luxonLib.luxonMod.InfoOptions): js.Array[java.lang.String] = js.native
  def months(): js.Array[java.lang.String] = js.native
  def months(length: luxonLib.luxonMod.UnitLength): js.Array[java.lang.String] = js.native
  def months(length: luxonLib.luxonMod.UnitLength, options: luxonLib.luxonMod.UnitOptions): js.Array[java.lang.String] = js.native
  def monthsFormat(): js.Array[java.lang.String] = js.native
  def monthsFormat(length: luxonLib.luxonMod.UnitLength): js.Array[java.lang.String] = js.native
  def monthsFormat(length: luxonLib.luxonMod.UnitLength, options: luxonLib.luxonMod.UnitOptions): js.Array[java.lang.String] = js.native
  def normalizeZone(): luxonLib.luxonMod.Zone = js.native
  def normalizeZone(input: java.lang.String): luxonLib.luxonMod.Zone = js.native
  def normalizeZone(input: luxonLib.luxonMod.Zone): luxonLib.luxonMod.Zone = js.native
  def normalizeZone(input: scala.Double): luxonLib.luxonMod.Zone = js.native
  def weekdays(): js.Array[java.lang.String] = js.native
  def weekdays(length: luxonLib.luxonMod.UnitLength): js.Array[java.lang.String] = js.native
  def weekdays(length: luxonLib.luxonMod.UnitLength, options: luxonLib.luxonMod.UnitOptions): js.Array[java.lang.String] = js.native
  def weekdaysFormat(): js.Array[java.lang.String] = js.native
  def weekdaysFormat(length: luxonLib.luxonMod.UnitLength): js.Array[java.lang.String] = js.native
  def weekdaysFormat(length: luxonLib.luxonMod.UnitLength, options: luxonLib.luxonMod.UnitOptions): js.Array[java.lang.String] = js.native
}

