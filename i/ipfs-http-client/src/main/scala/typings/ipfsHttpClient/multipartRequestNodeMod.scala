package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Headers
import typings.std.AbortController
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartRequestNodeMod {
  
  /**
    *
    * @param {Object} source
    * @param {AbortController} abortController
    * @param {Headers|Record<string, string>} [headers]
    * @param {string} [boundary]
    */
  @scala.inline
  def apply(source: js.Any, abortController: AbortController): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  @scala.inline
  def apply(source: js.Any, abortController: AbortController, headers: Unit, boundary: String): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  @scala.inline
  def apply(source: js.Any, abortController: AbortController, headers: typings.std.Headers): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  @scala.inline
  def apply(source: js.Any, abortController: AbortController, headers: typings.std.Headers, boundary: String): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  @scala.inline
  def apply(source: js.Any, abortController: AbortController, headers: Record[String, String]): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  @scala.inline
  def apply(
    source: js.Any,
    abortController: AbortController,
    headers: Record[String, String],
    boundary: String
  ): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  
  @JSImport("ipfs-http-client/dist/src/lib/multipart-request.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
