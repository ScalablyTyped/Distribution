package typings.gsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object accounts {
      
      object id {
        
        @JSGlobal("google.accounts.id")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * You can cancel the One Tap flow if you remove the prompt from the relying party DOM. The cancel operation is ignored if a credential is already selected.
          *
          * The following code example implements the google.accounts.id.cancel() method with an onNextButtonClicked() function:
          *
          * ```
          * <script>
          * function onNextButtonClicked() {
          *   google.accounts.id.cancel()
          *   showPasswordPage()
          * }
          * </script>
          * ```
          */
        inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
        
        /**
          * When the user signs out of your website, you need to call the method google.accounts.id.disableAutoSelect to record the status in cookies. This prevents a UX dead loop.
          *
          * The following code example implements the google.accounts.id.disableAutoSelect method with an onSignout() function:
          *
          * ```
          * <script>
          * function onSignout() {
          *   google.accounts.id.disableAutoSelect()
          * }
          * </script>
          * ```
          */
        inline def disableAutoSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoSelect")().asInstanceOf[Unit]
        
        /**
          * The google.accounts.id.initialize method initializes the Sign In With Google client based on the configuration object.
          *
          * The following code example implements the google.accounts.id.initialize method with an onload function:
          *
          * ```
          * <script>
          * window.onload = function () {
          *   google.accounts.id.initialize({
          *     client_id: 'YOUR_GOOGLE_CLIENT_ID',
          *     callback: handleCredentialResponse
          *   })
          *   google.accounts.id.prompt()
          * }
          * </script>
          * ```
          *
          * @param configuration Id configuration options.
          */
        inline def initialize(configuration: IdConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * The google.accounts.id.prompt method displays the One Tap prompt or the browser native credential manager after the initialize() method is invoked.
          *
          * Normally, the prompt() method is called on page load. Due to the session status and user settings on the Google side, the One Tap prompt UI might not be displayed.
          * To get notified on the UI status for different moments, pass a function to receive UI status notifications.
          *
          * Notifications are fired on the following moments:
          * - **Display moment:** This occurs after the prompt() method is called. The notification contains a boolean value to indicate whether the UI is displayed or not.
          * - **Skipped moment:** This occurs when the One Tap prompt is closed by an auto cancel, a manual cancel, or when Google fails to issue a credential,
          * such as when the selected session has signed out of Google. In these cases, we recommend that you continue on to the next identity providers, if there are any.
          * - **Dismissed moment:** This occurs when Google successfully retrieves a credential or a user wants to stop the credential retrieval flow.
          * For example, when the user begins to input their username and password in your login dialog, you can call the google.accounts.id.cancel()
          * method to close the One Tap prompt and trigger a dismissed moment.
          *
          * The following code example implements the skipped moment:
          *
          * ```
          * <script>
          * window.onload = function () {
          *   google.accounts.id.initialize(...)
          *   google.accounts.id.prompt((notification) => {
          *     if (notification.isNotDisplayed() || notification.isSkippedMoment()) {
          *       // continue with another identity provider.
          *     }
          *   })
          * }
          * </script>
          * ```
          *
          * @param listener Listener function to handle moments.
          */
        inline def prompt(listener: MomentListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * The google.accounts.id.renderButton method renders a Sign In With Google button in your web pages.
          *
          * @param parent The parent element onto which to mount the Sign In With Google button.
          * @param options Button configuration options.
          */
        inline def renderButton(parent: String, options: GsiButtonConfiguration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderButton")(parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * The google.accounts.id.revoke method revokes the OAuth grant used to share the ID token for the specified user.
          *
          * The following code sample shows how use the revoke method with an Id.
          *
          * ```
          * google.accounts.id.revoke('1618033988749895', done => {
          *   console.log(done.error)
          * })
          * ```
          * @param hint The email address or unique ID of the user's Google Account. The ID is the sub property of the credential payload.
          * @param callback Optional RevocationResponse handler.
          */
        inline def revoke(hint: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(hint.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def revoke(hint: String, callback: js.Function1[/* done */ RevocationResponse, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(hint.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * This method is a simple wrapper for the store() method of the browser's native credential manager API. Therefore, it can only be used to store a password credential.
          *
          * The following code example implements the google.accounts.id.storeCredential method with an onSignIn() function:
          *
          * ```
          * <script>
          * function onSignIn() {
          *   let cred = {id: '...', password: '...'}
          *   google.accounts.id.storeCredential(cred)
          * }
          * </script>
          * ```
          *
          * @param credential Credential object.
          * @param callback Optional callback to run code after the credentials are stored.
          */
        inline def storeCredential(credential: GsiCredential): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def storeCredential(credential: GsiCredential, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storeCredential")(credential.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
    }
  }
}
