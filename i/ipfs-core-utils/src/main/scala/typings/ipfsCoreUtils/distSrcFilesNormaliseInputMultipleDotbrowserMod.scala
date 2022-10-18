package typings.ipfsCoreUtils

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseInputMultipleDotbrowserMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input-multiple.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseInput(input: ImportCandidateStream): AsyncGenerator[BrowserImportCandidate, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseInput")(input.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[BrowserImportCandidate, Unit, Unit]]
  
  type BrowserImportCandidate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.BrowserImportCandidate */ Any
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
}
