package typings.jsmediatags.flactagcontentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/FLACTagContents", "MetadataBlock")
@js.native
class MetadataBlock protected () extends js.Object {
  def this(`type`: Double, data: ByteArray) = this()
  
  var _data: js.Array[Double] = js.native
  
  var _final: Boolean = js.native
  
  var _type: Double = js.native
  
  def setFinal(): Unit = js.native
  
  def toArray(): Unit = js.native
}
