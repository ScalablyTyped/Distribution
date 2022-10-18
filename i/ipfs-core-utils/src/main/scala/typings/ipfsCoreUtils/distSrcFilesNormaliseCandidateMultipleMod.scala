package typings.ipfsCoreUtils

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseCandidateMultipleMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-candidate-multiple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseCandidateMultiple(
    input: ImportCandidateStream,
    normaliseContent: js.Function1[/* content */ ToContent, js.Promise[AsyncIterable[js.typedarray.Uint8Array]]]
  ): AsyncGenerator[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("normaliseCandidateMultiple")(input.asInstanceOf[js.Any], normaliseContent.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate, Unit, Unit]]
  
  type ImportCandidate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate */ Any
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
  
  type ImporterImportCandidate = typings.ipfsUnixfsImporter.mod.ImportCandidate
  
  type ToContent = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ToContent */ Any
}
