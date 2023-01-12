package typings.gsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /**
    * You can register an onGoogleLibraryLoad callback. It's notified after the Sign In With Google JavaScript library is loaded:
    *
    * ```
    * window.onGoogleLibraryLoad = () => {
    *   // ...
    * }
    * ```
    *
    * This callback is just a shortcut for the window.onload callback. There are no differences in behavior.
    *
    * The following code example implements an onGoogleLibraryLoad callback:
    *
    * ```
    * <script>
    * window.onGoogleLibraryLoad = () => {
    *   google.accounts.id.initialize({
    *     // ...
    *   })
    *   google.accounts.id.prompt()
    * }
    * </script>
    * ```
    */
  var onGoogleLibraryLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setOnGoogleLibraryLoad(value: () => Unit): Self = StObject.set(x, "onGoogleLibraryLoad", js.Any.fromFunction0(value))
    
    inline def setOnGoogleLibraryLoadUndefined: Self = StObject.set(x, "onGoogleLibraryLoad", js.undefined)
  }
}
