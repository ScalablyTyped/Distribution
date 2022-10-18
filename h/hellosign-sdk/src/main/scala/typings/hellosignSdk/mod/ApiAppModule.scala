package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiAppModule extends StObject {
  
  def create(clientId: String, options: ApiAppRequestOptions): js.Promise[ApiAppResponse] = js.native
  
  def delete(clientId: String): js.Promise[BaseResponse] = js.native
  
  def get(clientId: String): js.Promise[ApiAppResponse] = js.native
  
  def list(): js.Promise[ApiAppListResponse] = js.native
  def list(params: Page): js.Promise[ApiAppListResponse] = js.native
  
  def update(clientId: String, options: ApiAppRequestOptions): js.Promise[ApiAppResponse] = js.native
}
