package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Version")
@js.native
class Version protected ()
  extends typings.jsqrcode.Version {
  def this(
    versionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    ecBlocks1: typings.jsqrcode.ECBlocks,
    ecBlocks2: typings.jsqrcode.ECBlocks,
    ecBlocks3: typings.jsqrcode.ECBlocks,
    ecBlocks4: typings.jsqrcode.ECBlocks
  ) = this()
}
/* static members */
@JSGlobal("Version")
@js.native
object Version extends js.Object {
  
  val VERSIONS: js.Array[typings.jsqrcode.Version] = js.native
  
  val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
  
  def decodeVersionInformation(versionBits: Double): typings.jsqrcode.Version = js.native
  
  def getProvisionalVersionForDimension(dimension: Double): typings.jsqrcode.Version = js.native
  
  def getVersionForNumber(versionNumber: Double): typings.jsqrcode.Version = js.native
}
