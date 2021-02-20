package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBlogger.anon.CommentId
import typings.maximMazurokGapiClientBlogger.anon.EndDate
import typings.maximMazurokGapiClientBlogger.anon.FetchBodies
import typings.maximMazurokGapiClientBlogger.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsResource extends StObject {
  
  /** Marks a comment as not spam by blog id, post id and comment id. */
  def approve(): Request[Comment] = js.native
  def approve(request: CommentId): Request[Comment] = js.native
  
  /** Deletes a comment by blog id, post id and comment id. */
  def delete(): Request[Unit] = js.native
  def delete(request: CommentId): Request[Unit] = js.native
  
  /** Gets a comment by id. */
  def get(): Request[Comment] = js.native
  def get(request: Fields): Request[Comment] = js.native
  
  /** Lists comments. */
  def list(): Request[CommentList] = js.native
  def list(request: EndDate): Request[CommentList] = js.native
  
  /** Lists comments by blog. */
  def listByBlog(): Request[CommentList] = js.native
  def listByBlog(request: FetchBodies): Request[CommentList] = js.native
  
  /** Marks a comment as spam by blog id, post id and comment id. */
  def markAsSpam(): Request[Comment] = js.native
  def markAsSpam(request: CommentId): Request[Comment] = js.native
  
  /** Removes the content of a comment by blog id, post id and comment id. */
  def removeContent(): Request[Comment] = js.native
  def removeContent(request: CommentId): Request[Comment] = js.native
}
