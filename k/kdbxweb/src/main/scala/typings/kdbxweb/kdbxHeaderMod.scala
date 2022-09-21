package typings.kdbxweb

import typings.kdbxweb.binaryStreamMod.BinaryStream
import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.kdbxwebNumbers.`4`
import typings.kdbxweb.varDictionaryMod.VarDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxHeaderMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-header", "KdbxHeader")
  @js.native
  open class KdbxHeader () extends StObject {
    
    var compression: js.UndefOr[Double] = js.native
    
    /* private */ var createKdfParameters: Any = js.native
    
    var crsAlgorithm: js.UndefOr[Double] = js.native
    
    var dataCipherUuid: js.UndefOr[KdbxUuid] = js.native
    
    var encryptionIV: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    var endPos: js.UndefOr[Double] = js.native
    
    def generateSalts(): Unit = js.native
    
    /* private */ var hasPublicCustomData: Any = js.native
    
    var kdfParameters: js.UndefOr[VarDictionary] = js.native
    
    var keyEncryptionRounds: js.UndefOr[Double] = js.native
    
    var masterSeed: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    var protectedStreamKey: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    var publicCustomData: js.UndefOr[VarDictionary] = js.native
    
    /* private */ var readBinary: Any = js.native
    
    /* private */ var readCipherID: Any = js.native
    
    /* private */ var readCompressionFlags: Any = js.native
    
    /* private */ var readEncryptionIV: Any = js.native
    
    /* private */ var readField: Any = js.native
    
    /* private */ var readFieldSize: Any = js.native
    
    def readInnerHeader(stm: BinaryStream, ctx: KdbxContext): Unit = js.native
    
    /* private */ var readInnerRandomStreamID: Any = js.native
    
    /* private */ var readInnerRandomStreamKey: Any = js.native
    
    /* private */ var readKdfParameters: Any = js.native
    
    /* private */ var readMasterSeed: Any = js.native
    
    /* private */ var readProtectedStreamKey: Any = js.native
    
    /* private */ var readPublicCustomData: Any = js.native
    
    /* private */ var readSignature: Any = js.native
    
    /* private */ var readStreamStartBytes: Any = js.native
    
    /* private */ var readTransformRounds: Any = js.native
    
    /* private */ var readTransformSeed: Any = js.native
    
    /* private */ var readVersion: Any = js.native
    
    def setKdf(kdf: String): Unit = js.native
    
    def setVersion(version: Double): Unit = js.native
    
    var streamStartBytes: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    var transformSeed: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    /* private */ var validate: Any = js.native
    
    /* private */ var validateInner: Any = js.native
    
    var versionMajor: Double = js.native
    
    var versionMinor: Double = js.native
    
    def write(stm: BinaryStream): Unit = js.native
    
    /* private */ var writeBinary: Any = js.native
    
    /* private */ var writeCipherID: Any = js.native
    
    /* private */ var writeCompressionFlags: Any = js.native
    
    /* private */ var writeEncryptionIV: Any = js.native
    
    /* private */ var writeEndOfHeader: Any = js.native
    
    /* private */ var writeField: Any = js.native
    
    /* private */ var writeFieldBytes: Any = js.native
    
    /* private */ var writeFieldSize: Any = js.native
    
    def writeInnerHeader(stm: BinaryStream, ctx: KdbxContext): Unit = js.native
    
    /* private */ var writeInnerRandomStreamID: Any = js.native
    
    /* private */ var writeInnerRandomStreamKey: Any = js.native
    
    /* private */ var writeKdfParameters: Any = js.native
    
    /* private */ var writeMasterSeed: Any = js.native
    
    /* private */ var writeProtectedStreamKey: Any = js.native
    
    /* private */ var writePublicCustomData: Any = js.native
    
    /* private */ var writeSignature: Any = js.native
    
    /* private */ var writeStreamStartBytes: Any = js.native
    
    /* private */ var writeTransformRounds: Any = js.native
    
    /* private */ var writeTransformSeed: Any = js.native
    
    /* private */ var writeVersion: Any = js.native
  }
  /* static members */
  object KdbxHeader {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-header", "KdbxHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kdbxweb/dist/types/format/kdbx-header", "KdbxHeader.MaxFileVersion")
    @js.native
    val MaxFileVersion: `4` = js.native
    
    inline def create(): KdbxHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[KdbxHeader]
    
    inline def read(stm: BinaryStream, ctx: KdbxContext): KdbxHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(stm.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[KdbxHeader]
  }
}
