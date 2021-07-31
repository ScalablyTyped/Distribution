package typings.instagramPrivateApi

import typings.tsCustomError.mod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igClientErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-client.error", "IgClientError")
  @js.native
  class IgClientError () extends CustomError {
    def this(message: String) = this()
  }
}
