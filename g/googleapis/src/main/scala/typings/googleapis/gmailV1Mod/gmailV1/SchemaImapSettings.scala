package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IMAP settings for an account.
  */
@js.native
trait SchemaImapSettings extends js.Object {
  
  /**
    * If this value is true, Gmail will immediately expunge a message when it
    * is marked as deleted in IMAP. Otherwise, Gmail will wait for an update
    * from the client before expunging messages marked as deleted.
    */
  var autoExpunge: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether IMAP is enabled for the account.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The action that will be executed on a message when it is marked as
    * deleted and expunged from the last visible IMAP folder.
    */
  var expungeBehavior: js.UndefOr[String] = js.native
  
  /**
    * An optional limit on the number of messages that an IMAP folder may
    * contain. Legal values are 0, 1000, 2000, 5000 or 10000. A value of zero
    * is interpreted to mean that there is no limit.
    */
  var maxFolderSize: js.UndefOr[Double] = js.native
}
object SchemaImapSettings {
  
  @scala.inline
  def apply(): SchemaImapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImapSettings]
  }
  
  @scala.inline
  implicit class SchemaImapSettingsOps[Self <: SchemaImapSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoExpunge(value: Boolean): Self = this.set("autoExpunge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpunge: Self = this.set("autoExpunge", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExpungeBehavior(value: String): Self = this.set("expungeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpungeBehavior: Self = this.set("expungeBehavior", js.undefined)
    
    @scala.inline
    def setMaxFolderSize(value: Double): Self = this.set("maxFolderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFolderSize: Self = this.set("maxFolderSize", js.undefined)
  }
}
