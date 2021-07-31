package typings.instagramPrivateApi

import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igParseErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-parse.error", "IgParseError")
  @js.native
  class IgParseError protected () extends IgClientError {
    def this(body: String) = this()
    
    var body: String = js.native
  }
}
