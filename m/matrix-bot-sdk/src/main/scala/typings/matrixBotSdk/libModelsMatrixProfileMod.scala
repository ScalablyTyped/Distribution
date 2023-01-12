package typings.matrixBotSdk

import typings.matrixBotSdk.mod.MentionPill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsMatrixProfileMod {
  
  @JSImport("matrix-bot-sdk/lib/models/MatrixProfile", "MatrixProfile")
  @js.native
  open class MatrixProfile protected () extends StObject {
    /**
      * Creates a new profile representation for a user.
      * @param {string} userId The user ID the profile is for.
      * @param {MatrixProfile} profile The profile itself.
      */
    def this(userId: String, profile: MatrixProfileInfo) = this()
    
    /**
      * The avatar URL for the user. If the user does not have an avatar, this will
      * be null.
      */
    def avatarUrl: String = js.native
    
    /**
      * The display name for the user. This will always return a value, though it
      * may be based upon their user ID if no explicit display name is set.
      */
    def displayName: String = js.native
    
    /**
      * A mention pill for this user.
      */
    def mention: MentionPill = js.native
    
    /* private */ var profile: Any = js.native
    
    /* private */ var userId: Any = js.native
  }
  
  trait MatrixProfileInfo extends StObject {
    
    /**
      * A URL to the user's avatar, if any.
      */
    var avatar_url: js.UndefOr[String] = js.undefined
    
    /**
      * The display name of the user, if any.
      */
    var displayname: js.UndefOr[String] = js.undefined
  }
  object MatrixProfileInfo {
    
    inline def apply(): MatrixProfileInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatrixProfileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatrixProfileInfo] (val x: Self) extends AnyVal {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    }
  }
}
