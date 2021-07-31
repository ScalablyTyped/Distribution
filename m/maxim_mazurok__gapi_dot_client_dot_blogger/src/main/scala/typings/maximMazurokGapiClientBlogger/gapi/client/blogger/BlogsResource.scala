package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBlogger.anon.Accesstoken
import typings.maximMazurokGapiClientBlogger.anon.Alt
import typings.maximMazurokGapiClientBlogger.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlogsResource extends StObject {
  
  /** Gets a blog by id. */
  def get(): Request[Blog] = js.native
  def get(request: Accesstoken): Request[Blog] = js.native
  
  /** Gets a blog by url. */
  def getByUrl(): Request[Blog] = js.native
  def getByUrl(request: Alt): Request[Blog] = js.native
  
  /** Lists blogs by user. */
  def listByUser(): Request[BlogList] = js.native
  def listByUser(request: Callback): Request[BlogList] = js.native
}
