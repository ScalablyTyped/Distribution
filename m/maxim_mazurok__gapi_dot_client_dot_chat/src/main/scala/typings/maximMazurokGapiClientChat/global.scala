package typings.maximMazurokGapiClientChat

import typings.maximMazurokGapiClientChat.gapi.client.chat.MediaResource
import typings.maximMazurokGapiClientChat.gapi.client.chat.SpacesResource
import typings.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.chat
import typings.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object chat {
        
        @JSGlobal("gapi.client.chat.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.chat.spaces")
        @js.native
        val spaces: SpacesResource = js.native
      }
      
      /** Load Hangouts Chat API v1 */
      @scala.inline
      def load(name: chat, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: chat, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
