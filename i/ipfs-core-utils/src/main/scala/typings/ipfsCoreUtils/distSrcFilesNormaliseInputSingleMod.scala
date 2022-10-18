package typings.ipfsCoreUtils

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseInputSingleMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input-single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseInput(input: ImportCandidate): AsyncGenerator[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseInput")(input.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate, Unit, Any]]
  
  type ImportCandidate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate */ Any
}
