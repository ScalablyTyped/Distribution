package typings.gulpMustache

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(view: View): Transform = ^.asInstanceOf[js.Dynamic].apply(view.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(view: View, options: Unit, partials: Hash): Transform = (^.asInstanceOf[js.Dynamic].apply(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(view: View, options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(view: View, options: Options, partials: Hash): Transform = (^.asInstanceOf[js.Dynamic].apply(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("gulp-mustache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Hash = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  type View = js.UndefOr[Hash | String]
}
