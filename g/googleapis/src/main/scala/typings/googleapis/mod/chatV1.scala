package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatV1 {
  
  /**
    * Hangouts Chat API
    *
    * Enables bots to fetch information and perform actions in Hangouts Chat.
    *
    * @example
    * const {google} = require('googleapis');
    * const chat = google.chat('v1');
    *
    * @namespace chat
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Chat
    */
  @JSImport("googleapis", "chat_v1.Chat")
  @js.native
  class Chat protected ()
    extends typings.googleapis.chatV1Mod.chatV1.Chat {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "chat_v1.Resource$Spaces")
  @js.native
  class ResourceSpaces protected ()
    extends typings.googleapis.chatV1Mod.chatV1.ResourceSpaces {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "chat_v1.Resource$Spaces$Members")
  @js.native
  class ResourceSpacesMembers protected ()
    extends typings.googleapis.chatV1Mod.chatV1.ResourceSpacesMembers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "chat_v1.Resource$Spaces$Messages")
  @js.native
  class ResourceSpacesMessages protected ()
    extends typings.googleapis.chatV1Mod.chatV1.ResourceSpacesMessages {
    def this(context: APIRequestContext) = this()
  }
}
