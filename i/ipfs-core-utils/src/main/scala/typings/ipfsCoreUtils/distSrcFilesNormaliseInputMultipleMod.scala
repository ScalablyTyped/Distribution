package typings.ipfsCoreUtils

import typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseInputMultipleMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input-multiple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseInput(input: ImportCandidateStream): AsyncGenerator[ImportCandidate, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseInput")(input.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[ImportCandidate, Unit, Unit]]
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
}
