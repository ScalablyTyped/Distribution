package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entityMod.Entity
import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/media.entity", "MediaEntity")
  @js.native
  class MediaEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object MediaEntity {
    
    @JSImport("instagram-private-api/dist/entities/media.entity", "MediaEntity.oembed")
    @js.native
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
}
