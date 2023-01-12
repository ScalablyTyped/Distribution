package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildNote extends StObject {
  
  /** Required. Immutable. Version of the builder which produced this build. */
  var builderVersion: js.UndefOr[String] = js.undefined
}
object BuildNote {
  
  inline def apply(): BuildNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildNote] (val x: Self) extends AnyVal {
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
  }
}
