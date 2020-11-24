package typings.jupyterlabApputils.sessioncontextMod.SessionContext

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for populating a kernel selector.
  */
@js.native
trait IKernelSearch extends js.Object {
  
  /**
    * The kernel preference.
    */
  var preference: IKernelPreference = js.native
  
  /**
    * The current running sessions.
    */
  var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.native
  
  /**
    * The Kernel specs.
    */
  var specs: ISpecModels | Null = js.native
}
object IKernelSearch {
  
  @scala.inline
  def apply(preference: IKernelPreference): IKernelSearch = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelSearch]
  }
  
  @scala.inline
  implicit class IKernelSearchOps[Self <: IKernelSearch] (val x: Self) extends AnyVal {
    
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
    def setPreference(value: IKernelPreference): Self = this.set("preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessions(value: IterableOrArrayLike[IModel]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
    
    @scala.inline
    def setSpecs(value: ISpecModels): Self = this.set("specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsNull: Self = this.set("specs", null)
  }
}
