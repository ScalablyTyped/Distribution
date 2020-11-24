package typings.jupyterlabApputils.sessioncontextMod.ISessionContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A kernel preference.
  *
  * #### Notes
  * Preferences for a kernel are considered in the order `id`, `name`,
  * `language`. If no matching kernels can be found and `autoStartDefault` is
  * `true`, then the default kernel for the server is preferred.
  */
@js.native
trait IKernelPreference extends js.Object {
  
  /**
    * Automatically start the default kernel if no other matching kernel is
    * found (default `true`).
    */
  val autoStartDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * A kernel can be started (default `true`).
    */
  val canStart: js.UndefOr[Boolean] = js.native
  
  /**
    * The id of an existing kernel.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The preferred kernel language.
    */
  val language: js.UndefOr[String] = js.native
  
  /**
    * The name of the kernel.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * A kernel should be started automatically (default `true`).
    */
  val shouldStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Shut down the session when session context is disposed (default `false`).
    */
  val shutdownOnDispose: js.UndefOr[Boolean] = js.native
}
object IKernelPreference {
  
  @scala.inline
  def apply(): IKernelPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelPreference]
  }
  
  @scala.inline
  implicit class IKernelPreferenceOps[Self <: IKernelPreference] (val x: Self) extends AnyVal {
    
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
    def setAutoStartDefault(value: Boolean): Self = this.set("autoStartDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStartDefault: Self = this.set("autoStartDefault", js.undefined)
    
    @scala.inline
    def setCanStart(value: Boolean): Self = this.set("canStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanStart: Self = this.set("canStart", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShouldStart(value: Boolean): Self = this.set("shouldStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStart: Self = this.set("shouldStart", js.undefined)
    
    @scala.inline
    def setShutdownOnDispose(value: Boolean): Self = this.set("shutdownOnDispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdownOnDispose: Self = this.set("shutdownOnDispose", js.undefined)
  }
}
