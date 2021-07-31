package typings.instagramPrivateApi.mod

import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api", "MediaEntity")
@js.native
class MediaEntity protected ()
  extends typings.instagramPrivateApi.entitiesMod.MediaEntity {
  def this(client: typings.instagramPrivateApi.clientMod.IgApiClient) = this()
}
/* static members */
object MediaEntity {
  
  @JSImport("instagram-private-api", "MediaEntity")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def oembed(url: String): js.Promise[MediaEntityOembedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("oembed")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaEntityOembedResponse]]
}
