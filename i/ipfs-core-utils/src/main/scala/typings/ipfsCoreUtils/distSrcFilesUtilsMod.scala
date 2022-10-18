package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesUtilsMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBlob(obj: Any): /* is std.Blob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlob")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Blob */ Boolean]
  
  inline def isBytes(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytes")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileObject(obj: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate * / any */ Boolean]
  
  inline def isReadableStream(value: Any): /* is std.ReadableStream<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadableStream")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ReadableStream<any> */ Boolean]
}
