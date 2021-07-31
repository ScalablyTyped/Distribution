package typings.ipfsHttpClient

import org.scalablytyped.runtime.Shortcut
import typings.ipfsHttpClient.anon.Body
import typings.std.AbortController
import typings.std.Headers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartRequestMod extends Shortcut {
  
  @JSImport("ipfs-http-client/dist/src/lib/multipart-request", JSImport.Namespace)
  @js.native
  val ^ : (js.Function3[
    /* source */ js.UndefOr[String], 
    /* abortController */ js.Any, 
    /* headers */ js.UndefOr[js.Object], 
    js.Promise[Body]
  ]) | (js.Function4[
    /* source */ js.Any, 
    /* abortController */ AbortController, 
    /* headers */ js.UndefOr[Headers | (Record[String, String])], 
    /* boundary */ js.UndefOr[String], 
    js.Promise[typings.ipfsHttpClient.anon.Headers]
  ]) = js.native
  
  type _To = (js.Function3[
    /* source */ js.UndefOr[String], 
    /* abortController */ js.Any, 
    /* headers */ js.UndefOr[js.Object], 
    js.Promise[Body]
  ]) | (js.Function4[
    /* source */ js.Any, 
    /* abortController */ AbortController, 
    /* headers */ js.UndefOr[Headers | (Record[String, String])], 
    /* boundary */ js.UndefOr[String], 
    js.Promise[typings.ipfsHttpClient.anon.Headers]
  ])
  
  /* This means you don't have to write `^`, but can instead just say `multipartRequestMod.foo` */
  override def _to: (js.Function3[
    /* source */ js.UndefOr[String], 
    /* abortController */ js.Any, 
    /* headers */ js.UndefOr[js.Object], 
    js.Promise[Body]
  ]) | (js.Function4[
    /* source */ js.Any, 
    /* abortController */ AbortController, 
    /* headers */ js.UndefOr[Headers | (Record[String, String])], 
    /* boundary */ js.UndefOr[String], 
    js.Promise[typings.ipfsHttpClient.anon.Headers]
  ]) = ^
}
