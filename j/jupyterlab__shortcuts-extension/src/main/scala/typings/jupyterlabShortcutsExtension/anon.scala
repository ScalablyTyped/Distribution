package typings.jupyterlabShortcutsExtension

import typings.jupyterlabShortcutsExtension.libComponentsTopNavMod.IShortcutUIexternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait External extends StObject {
    
    var external: IShortcutUIexternal
  }
  object External {
    
    inline def apply(external: IShortcutUIexternal): External = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: IShortcutUIexternal): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    }
  }
}
