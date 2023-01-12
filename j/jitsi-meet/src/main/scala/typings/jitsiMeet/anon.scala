package typings.jitsiMeet

import typings.jitsiMeet.mod.ScreenSharingSourceTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var jid: String
  }
  object Id {
    
    inline def apply(id: String, jid: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jid = jid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdString extends StObject {
    
    var id: String
  }
  object IdString {
    
    inline def apply(id: String): IdString = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdString] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Local extends StObject {
    
    var id: String
    
    var local: Boolean
  }
  object Local {
    
    inline def apply(id: String, local: Boolean): Local = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Local]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var text: String
  }
  object Name {
    
    inline def apply(name: String, text: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<jitsi-meet.jitsi-meet.ExternalAPICommands, std.Array<any>> */
  trait RecordExternalAPICommands extends StObject {
    
    var avatarUrl: js.Array[Any]
    
    var displayName: js.Array[Any]
    
    var email: js.Array[Any]
    
    var hangup: js.Array[Any]
    
    var muteEveryone: js.Array[Any]
    
    var password: js.Array[Any]
    
    var sendEndpointTextMessage: js.Array[Any]
    
    var sendTones: js.Array[Any]
    
    var setLargeVideoParticipant: js.Array[Any]
    
    var setVideoQuality: js.Array[Any]
    
    var startRecording: js.Array[Any]
    
    var stopRecording: js.Array[Any]
    
    var subject: js.Array[Any]
    
    var toggleAudio: js.Array[Any]
    
    var toggleChat: js.Array[Any]
    
    var toggleFilmStrip: js.Array[Any]
    
    var toggleLobby: js.Array[Any]
    
    var toggleShareScreen: js.Array[Any]
    
    var toggleTileView: js.Array[Any]
    
    var toggleVideo: js.Array[Any]
  }
  object RecordExternalAPICommands {
    
    inline def apply(
      avatarUrl: js.Array[Any],
      displayName: js.Array[Any],
      email: js.Array[Any],
      hangup: js.Array[Any],
      muteEveryone: js.Array[Any],
      password: js.Array[Any],
      sendEndpointTextMessage: js.Array[Any],
      sendTones: js.Array[Any],
      setLargeVideoParticipant: js.Array[Any],
      setVideoQuality: js.Array[Any],
      startRecording: js.Array[Any],
      stopRecording: js.Array[Any],
      subject: js.Array[Any],
      toggleAudio: js.Array[Any],
      toggleChat: js.Array[Any],
      toggleFilmStrip: js.Array[Any],
      toggleLobby: js.Array[Any],
      toggleShareScreen: js.Array[Any],
      toggleTileView: js.Array[Any],
      toggleVideo: js.Array[Any]
    ): RecordExternalAPICommands = {
      val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hangup = hangup.asInstanceOf[js.Any], muteEveryone = muteEveryone.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], sendEndpointTextMessage = sendEndpointTextMessage.asInstanceOf[js.Any], sendTones = sendTones.asInstanceOf[js.Any], setLargeVideoParticipant = setLargeVideoParticipant.asInstanceOf[js.Any], setVideoQuality = setVideoQuality.asInstanceOf[js.Any], startRecording = startRecording.asInstanceOf[js.Any], stopRecording = stopRecording.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], toggleAudio = toggleAudio.asInstanceOf[js.Any], toggleChat = toggleChat.asInstanceOf[js.Any], toggleFilmStrip = toggleFilmStrip.asInstanceOf[js.Any], toggleLobby = toggleLobby.asInstanceOf[js.Any], toggleShareScreen = toggleShareScreen.asInstanceOf[js.Any], toggleTileView = toggleTileView.asInstanceOf[js.Any], toggleVideo = toggleVideo.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordExternalAPICommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordExternalAPICommands] (val x: Self) extends AnyVal {
      
      inline def setAvatarUrl(value: js.Array[Any]): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrlVarargs(value: Any*): Self = StObject.set(x, "avatarUrl", js.Array(value*))
      
      inline def setDisplayName(value: js.Array[Any]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameVarargs(value: Any*): Self = StObject.set(x, "displayName", js.Array(value*))
      
      inline def setEmail(value: js.Array[Any]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailVarargs(value: Any*): Self = StObject.set(x, "email", js.Array(value*))
      
      inline def setHangup(value: js.Array[Any]): Self = StObject.set(x, "hangup", value.asInstanceOf[js.Any])
      
      inline def setHangupVarargs(value: Any*): Self = StObject.set(x, "hangup", js.Array(value*))
      
      inline def setMuteEveryone(value: js.Array[Any]): Self = StObject.set(x, "muteEveryone", value.asInstanceOf[js.Any])
      
      inline def setMuteEveryoneVarargs(value: Any*): Self = StObject.set(x, "muteEveryone", js.Array(value*))
      
      inline def setPassword(value: js.Array[Any]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordVarargs(value: Any*): Self = StObject.set(x, "password", js.Array(value*))
      
      inline def setSendEndpointTextMessage(value: js.Array[Any]): Self = StObject.set(x, "sendEndpointTextMessage", value.asInstanceOf[js.Any])
      
      inline def setSendEndpointTextMessageVarargs(value: Any*): Self = StObject.set(x, "sendEndpointTextMessage", js.Array(value*))
      
      inline def setSendTones(value: js.Array[Any]): Self = StObject.set(x, "sendTones", value.asInstanceOf[js.Any])
      
      inline def setSendTonesVarargs(value: Any*): Self = StObject.set(x, "sendTones", js.Array(value*))
      
      inline def setSetLargeVideoParticipant(value: js.Array[Any]): Self = StObject.set(x, "setLargeVideoParticipant", value.asInstanceOf[js.Any])
      
      inline def setSetLargeVideoParticipantVarargs(value: Any*): Self = StObject.set(x, "setLargeVideoParticipant", js.Array(value*))
      
      inline def setSetVideoQuality(value: js.Array[Any]): Self = StObject.set(x, "setVideoQuality", value.asInstanceOf[js.Any])
      
      inline def setSetVideoQualityVarargs(value: Any*): Self = StObject.set(x, "setVideoQuality", js.Array(value*))
      
      inline def setStartRecording(value: js.Array[Any]): Self = StObject.set(x, "startRecording", value.asInstanceOf[js.Any])
      
      inline def setStartRecordingVarargs(value: Any*): Self = StObject.set(x, "startRecording", js.Array(value*))
      
      inline def setStopRecording(value: js.Array[Any]): Self = StObject.set(x, "stopRecording", value.asInstanceOf[js.Any])
      
      inline def setStopRecordingVarargs(value: Any*): Self = StObject.set(x, "stopRecording", js.Array(value*))
      
      inline def setSubject(value: js.Array[Any]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectVarargs(value: Any*): Self = StObject.set(x, "subject", js.Array(value*))
      
      inline def setToggleAudio(value: js.Array[Any]): Self = StObject.set(x, "toggleAudio", value.asInstanceOf[js.Any])
      
      inline def setToggleAudioVarargs(value: Any*): Self = StObject.set(x, "toggleAudio", js.Array(value*))
      
      inline def setToggleChat(value: js.Array[Any]): Self = StObject.set(x, "toggleChat", value.asInstanceOf[js.Any])
      
      inline def setToggleChatVarargs(value: Any*): Self = StObject.set(x, "toggleChat", js.Array(value*))
      
      inline def setToggleFilmStrip(value: js.Array[Any]): Self = StObject.set(x, "toggleFilmStrip", value.asInstanceOf[js.Any])
      
      inline def setToggleFilmStripVarargs(value: Any*): Self = StObject.set(x, "toggleFilmStrip", js.Array(value*))
      
      inline def setToggleLobby(value: js.Array[Any]): Self = StObject.set(x, "toggleLobby", value.asInstanceOf[js.Any])
      
      inline def setToggleLobbyVarargs(value: Any*): Self = StObject.set(x, "toggleLobby", js.Array(value*))
      
      inline def setToggleShareScreen(value: js.Array[Any]): Self = StObject.set(x, "toggleShareScreen", value.asInstanceOf[js.Any])
      
      inline def setToggleShareScreenVarargs(value: Any*): Self = StObject.set(x, "toggleShareScreen", js.Array(value*))
      
      inline def setToggleTileView(value: js.Array[Any]): Self = StObject.set(x, "toggleTileView", value.asInstanceOf[js.Any])
      
      inline def setToggleTileViewVarargs(value: Any*): Self = StObject.set(x, "toggleTileView", js.Array(value*))
      
      inline def setToggleVideo(value: js.Array[Any]): Self = StObject.set(x, "toggleVideo", value.asInstanceOf[js.Any])
      
      inline def setToggleVideoVarargs(value: Any*): Self = StObject.set(x, "toggleVideo", js.Array(value*))
    }
  }
  
  trait SourceType extends StObject {
    
    var sourceType: js.UndefOr[ScreenSharingSourceTypes] = js.undefined
  }
  object SourceType {
    
    inline def apply(): SourceType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceType] (val x: Self) extends AnyVal {
      
      inline def setSourceType(value: ScreenSharingSourceTypes): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
}
