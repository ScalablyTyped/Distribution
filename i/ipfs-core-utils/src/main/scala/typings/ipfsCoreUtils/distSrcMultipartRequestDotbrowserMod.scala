package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Body
import typings.std.AbortController
import typings.std.Headers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultipartRequestDotbrowserMod {
  
  @JSImport("ipfs-core-utils/dist/src/multipart-request.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController, headers: Headers): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController, headers: Record[String, String]): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
}
