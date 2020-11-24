package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppState extends js.Object {
  
  /** List of keyed app states. This field will always be present. */
  var keyedAppState: js.UndefOr[js.Array[KeyedAppState]] = js.native
  
  /** The package name of the app. This field will always be present. */
  var packageName: js.UndefOr[String] = js.native
}
object AppState {
  
  @scala.inline
  def apply(): AppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppState]
  }
  
  @scala.inline
  implicit class AppStateOps[Self <: AppState] (val x: Self) extends AnyVal {
    
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
    def setKeyedAppStateVarargs(value: KeyedAppState*): Self = this.set("keyedAppState", js.Array(value :_*))
    
    @scala.inline
    def setKeyedAppState(value: js.Array[KeyedAppState]): Self = this.set("keyedAppState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyedAppState: Self = this.set("keyedAppState", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
}
