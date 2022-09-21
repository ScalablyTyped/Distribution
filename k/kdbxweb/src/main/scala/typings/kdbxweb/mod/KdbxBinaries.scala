package typings.kdbxweb.mod

import typings.kdbxweb.kdbxBinariesMod.KdbxBinaryOrRef
import typings.kdbxweb.kdbxBinariesMod.KdbxBinaryWithHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "KdbxBinaries")
@js.native
open class KdbxBinaries ()
  extends typings.kdbxweb.kdbxBinariesMod.KdbxBinaries
/* static members */
object KdbxBinaries {
  
  @JSImport("kdbxweb", "KdbxBinaries")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kdbxweb", "KdbxBinaries.getBinaryHash")
  @js.native
  def getBinaryHash: Any = js.native
  inline def getBinaryHash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBinaryHash")(x.asInstanceOf[js.Any])
  
  inline def isKdbxBinaryRef(): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryRef")().asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean]
  inline def isKdbxBinaryRef(binary: KdbxBinaryOrRef): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryRef")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean]
  
  inline def isKdbxBinaryWithHash(): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")().asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
  inline def isKdbxBinaryWithHash(binary: KdbxBinaryOrRef): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
  inline def isKdbxBinaryWithHash(binary: KdbxBinaryWithHash): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
}
