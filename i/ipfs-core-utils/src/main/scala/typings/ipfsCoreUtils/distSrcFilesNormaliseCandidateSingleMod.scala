package typings.ipfsCoreUtils

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesNormaliseCandidateSingleMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-candidate-single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseCandidateSingle(
    input: ImportCandidate,
    normaliseContent: js.Function1[/* content */ ToContent, js.Promise[AsyncIterable[js.typedarray.Uint8Array]]]
  ): AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ImportCandidate */ Any, 
    Unit, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("normaliseCandidateSingle")(input.asInstanceOf[js.Any], normaliseContent.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ImportCandidate */ Any, 
    Unit, 
    Any
  ]]
  
  type ImportCandidate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidate */ Any
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
  
  type ImporterImportCandidate = typings.ipfsUnixfsImporter.mod.ImportCandidate
  
  type ToContent = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ToContent */ Any
}
