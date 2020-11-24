package typings.kss.mod

import typings.kss.kssBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kss", "KssStyleguide")
@js.native
class KssStyleguide () extends js.Object {
  def this(data: js.Any) = this()
  
  def autoInit(autoInit: Boolean): KssStyleguide = js.native
  
  def customPropertyNames(): js.Array[String] = js.native
  def customPropertyNames(names: String): KssStyleguide = js.native
  def customPropertyNames(names: js.Array[String]): KssStyleguide = js.native
  
  def hasNumericReferences(): Boolean = js.native
  
  def init(): KssStyleguide = js.native
  
  def referenceDelimiter(): String = js.native
  
  def sections(): js.Array[KssSection] = js.native
  def sections(query: String): `false` | KssSection | js.Array[KssSection] = js.native
  def sections(query: RegExp): `false` | KssSection | js.Array[KssSection] = js.native
  def sections(sections: js.Array[KssSection]): KssStyleguide = js.native
  def sections(sections: KssSection): KssStyleguide = js.native
  
  def toJSON(): js.Any = js.native
}
