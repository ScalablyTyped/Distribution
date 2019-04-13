package typings
package kssLib.kssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kss", "KssStyleguide")
@js.native
class KssStyleguide () extends js.Object {
  def this(data: js.Any) = this()
  def autoInit(autoInit: scala.Boolean): KssStyleguide = js.native
  def customPropertyNames(): js.Array[java.lang.String] = js.native
  def customPropertyNames(names: java.lang.String): KssStyleguide = js.native
  def customPropertyNames(names: js.Array[java.lang.String]): KssStyleguide = js.native
  def hasNumericReferences(): scala.Boolean = js.native
  def init(): KssStyleguide = js.native
  def referenceDelimiter(): java.lang.String = js.native
  def sections(): js.Array[KssSection] = js.native
  def sections(query: java.lang.String): kssLib.kssLibNumbers.`false` | KssSection | js.Array[KssSection] = js.native
  def sections(query: stdLib.RegExp): kssLib.kssLibNumbers.`false` | KssSection | js.Array[KssSection] = js.native
  def sections(sections: js.Array[KssSection]): KssStyleguide = js.native
  def sections(sections: KssSection): KssStyleguide = js.native
  def toJSON(): js.Any = js.native
}

