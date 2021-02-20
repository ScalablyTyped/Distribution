package typings.instagramPrivateApi.mod

import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api", "MediaEntity")
@js.native
class MediaEntity protected ()
  extends typings.instagramPrivateApi.entitiesMod.MediaEntity {
  def this(client: typings.instagramPrivateApi.clientMod.IgApiClient) = this()
}
/* static members */
object MediaEntity {
  
  @JSImport("instagram-private-api", "MediaEntity.oembed")
  @js.native
  def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
}
