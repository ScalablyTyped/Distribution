package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/ByteArrayUtils", JSImport.Namespace)
@js.native
object byteArrayUtilsMod extends js.Object {
  
  def bin(string: String): ByteArray = js.native
  
  def getInteger24(number: Double): ByteArray = js.native
  
  def getInteger32(number: Double): ByteArray = js.native
  
  def getSynchsafeInteger32(number: Double): ByteArray = js.native
  
  def pad(array: js.Array[_], size: Double): js.Array[_] = js.native
}
