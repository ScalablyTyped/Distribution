package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igNotFoundErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-not-found.error", "IgNotFoundError")
  @js.native
  class IgNotFoundError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[js.Any]) = this()
  }
}
