package typings.kdbxweb

import typings.kdbxweb.distTypesFormatKdbxContextMod.KdbxContext
import typings.kdbxweb.distTypesFormatKdbxMod.Kdbx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormatKdbxFormatMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-format", "KdbxFormat")
  @js.native
  open class KdbxFormat protected () extends StObject {
    def this(kdbx: Kdbx) = this()
    
    /* private */ var checkHeaderHashV3: Any = js.native
    
    /* private */ var cleanXml: Any = js.native
    
    /* private */ var computeKeysV4: Any = js.native
    
    val ctx: KdbxContext = js.native
    
    /* private */ var decryptData: Any = js.native
    
    /* private */ var decryptXmlV3: Any = js.native
    
    /* private */ var encryptData: Any = js.native
    
    /* private */ var encryptXmlV3: Any = js.native
    
    /* private */ var getHeaderHash: Any = js.native
    
    /* private */ var getHeaderHmac: Any = js.native
    
    /* private */ var getMasterKeyV3: Any = js.native
    
    /* private */ var getProtectSaltGenerator: Any = js.native
    
    val kdbx: Kdbx = js.native
    
    def load(data: js.typedarray.ArrayBuffer): js.Promise[Kdbx] = js.native
    
    /* private */ var loadV3: Any = js.native
    
    /* private */ var loadV4: Any = js.native
    
    def loadXml(xmlStr: String): js.Promise[Kdbx] = js.native
    
    var preserveXml: Boolean = js.native
    
    def save(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* private */ var saveV3: Any = js.native
    
    /* private */ var saveV4: Any = js.native
    
    def saveXml(): js.Promise[String] = js.native
    def saveXml(prettyPrint: Boolean): js.Promise[String] = js.native
    
    /* private */ var setProtectedValues: Any = js.native
    
    /* private */ var transformDataV4Aes: Any = js.native
    
    /* private */ var transformDataV4ChaCha20: Any = js.native
    
    /* private */ var trimStartBytesV3: Any = js.native
  }
}
