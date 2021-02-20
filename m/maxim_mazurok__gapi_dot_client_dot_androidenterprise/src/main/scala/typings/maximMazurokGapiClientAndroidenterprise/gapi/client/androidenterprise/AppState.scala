package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppState extends StObject {
  
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
  implicit class AppStateMutableBuilder[Self <: AppState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyedAppState(value: js.Array[KeyedAppState]): Self = StObject.set(x, "keyedAppState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyedAppStateUndefined: Self = StObject.set(x, "keyedAppState", js.undefined)
    
    @scala.inline
    def setKeyedAppStateVarargs(value: KeyedAppState*): Self = StObject.set(x, "keyedAppState", js.Array(value :_*))
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
