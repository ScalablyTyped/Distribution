package typings.markdownItExternalLinks

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownItExternalLinks.anon.DefaultRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-external-links", JSImport.Namespace)
  @js.native
  val ^ : (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender = js.native
  
  trait Config extends StObject {
    
    var externalClassName: js.UndefOr[String | Null] = js.undefined
    
    var externalRel: js.UndefOr[String] = js.undefined
    
    var externalTarget: js.UndefOr[String] = js.undefined
    
    var internalClassName: js.UndefOr[String | Null] = js.undefined
    
    var internalDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var internalRel: js.UndefOr[String] = js.undefined
    
    var internalTarget: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setExternalClassName(value: String): Self = StObject.set(x, "externalClassName", value.asInstanceOf[js.Any])
      
      inline def setExternalClassNameNull: Self = StObject.set(x, "externalClassName", null)
      
      inline def setExternalClassNameUndefined: Self = StObject.set(x, "externalClassName", js.undefined)
      
      inline def setExternalRel(value: String): Self = StObject.set(x, "externalRel", value.asInstanceOf[js.Any])
      
      inline def setExternalRelUndefined: Self = StObject.set(x, "externalRel", js.undefined)
      
      inline def setExternalTarget(value: String): Self = StObject.set(x, "externalTarget", value.asInstanceOf[js.Any])
      
      inline def setExternalTargetUndefined: Self = StObject.set(x, "externalTarget", js.undefined)
      
      inline def setInternalClassName(value: String): Self = StObject.set(x, "internalClassName", value.asInstanceOf[js.Any])
      
      inline def setInternalClassNameNull: Self = StObject.set(x, "internalClassName", null)
      
      inline def setInternalClassNameUndefined: Self = StObject.set(x, "internalClassName", js.undefined)
      
      inline def setInternalDomains(value: js.Array[String]): Self = StObject.set(x, "internalDomains", value.asInstanceOf[js.Any])
      
      inline def setInternalDomainsUndefined: Self = StObject.set(x, "internalDomains", js.undefined)
      
      inline def setInternalDomainsVarargs(value: String*): Self = StObject.set(x, "internalDomains", js.Array(value*))
      
      inline def setInternalRel(value: String): Self = StObject.set(x, "internalRel", value.asInstanceOf[js.Any])
      
      inline def setInternalRelUndefined: Self = StObject.set(x, "internalRel", js.undefined)
      
      inline def setInternalTarget(value: String): Self = StObject.set(x, "internalTarget", value.asInstanceOf[js.Any])
      
      inline def setInternalTargetUndefined: Self = StObject.set(x, "internalTarget", js.undefined)
    }
  }
  
  type _To = (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (PluginWithOptions[Config | js.Array[Config]]) & DefaultRender = ^
}
