package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.initSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "LevelKey")
@js.native
open class LevelKey protected ()
  extends StObject
     with DecryptData {
  def this(method: String, uri: String, format: String) = this()
  def this(method: String, uri: String, format: String, formatversions: js.Array[Double]) = this()
  def this(
    method: String,
    uri: String,
    format: String,
    formatversions: js.Array[Double],
    iv: js.typedarray.Uint8Array
  ) = this()
  def this(method: String, uri: String, format: String, formatversions: Unit, iv: js.typedarray.Uint8Array) = this()
  
  /* CompleteClass */
  var encrypted: Boolean = js.native
  
  def getDecryptData(sn: Double): LevelKey | Null = js.native
  @JSName("getDecryptData")
  def getDecryptData_initSegment(sn: initSegment): LevelKey | Null = js.native
  
  /* CompleteClass */
  var isCommonEncryption: Boolean = js.native
  
  def isSupported(): Boolean = js.native
  
  /* CompleteClass */
  var iv: js.typedarray.Uint8Array | Null = js.native
  
  /* CompleteClass */
  var key: js.typedarray.Uint8Array | Null = js.native
  
  /* CompleteClass */
  var keyFormat: String = js.native
  
  /* CompleteClass */
  var keyFormatVersions: js.Array[Double] = js.native
  
  /* CompleteClass */
  var keyId: js.typedarray.Uint8Array | Null = js.native
  
  /* CompleteClass */
  var method: String = js.native
  
  /* CompleteClass */
  var pssh: js.typedarray.Uint8Array | Null = js.native
  
  /* CompleteClass */
  var uri: String = js.native
}
/* static members */
object LevelKey {
  
  @JSImport("hls.js", "LevelKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearKeyUriToKeyIdMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearKeyUriToKeyIdMap")().asInstanceOf[Unit]
}
