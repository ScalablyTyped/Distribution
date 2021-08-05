package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entityMod.Entity
import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/media.entity", "MediaEntity")
  @js.native
  class MediaEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object MediaEntity {
    
    @JSImport("instagram-private-api/dist/entities/media.entity", "MediaEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def oembed(url: String): js.Promise[MediaEntityOembedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("oembed")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaEntityOembedResponse]]
  }
}
