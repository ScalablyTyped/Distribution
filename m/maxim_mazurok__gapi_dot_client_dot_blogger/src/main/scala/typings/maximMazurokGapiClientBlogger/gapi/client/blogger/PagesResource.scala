package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBlogger.anon.IsDraft
import typings.maximMazurokGapiClientBlogger.anon.Key
import typings.maximMazurokGapiClientBlogger.anon.MaxResults
import typings.maximMazurokGapiClientBlogger.anon.Oauthtoken
import typings.maximMazurokGapiClientBlogger.anon.PageId
import typings.maximMazurokGapiClientBlogger.anon.PrettyPrint
import typings.maximMazurokGapiClientBlogger.anon.Publish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends StObject {
  
  /** Deletes a page by blog id and page id. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Gets a page by blog id and page id. */
  def get(): Request[Page] = js.native
  def get(request: Oauthtoken): Request[Page] = js.native
  
  /** Inserts a page. */
  def insert(request: IsDraft): Request[Page] = js.native
  def insert(request: PrettyPrint, body: Page): Request[Page] = js.native
  
  /** Lists pages. */
  def list(): Request[PageList] = js.native
  def list(request: MaxResults): Request[PageList] = js.native
  
  /** Patches a page. */
  def patch(request: PageId): Request[Page] = js.native
  def patch(request: Publish, body: Page): Request[Page] = js.native
  
  /** Publishes a page. */
  def publish(): Request[Page] = js.native
  def publish(request: Key): Request[Page] = js.native
  
  /** Reverts a published or scheduled page to draft state. */
  def revert(): Request[Page] = js.native
  def revert(request: Key): Request[Page] = js.native
  
  /** Updates a page by blog id and page id. */
  def update(request: PageId): Request[Page] = js.native
  def update(request: Publish, body: Page): Request[Page] = js.native
}
