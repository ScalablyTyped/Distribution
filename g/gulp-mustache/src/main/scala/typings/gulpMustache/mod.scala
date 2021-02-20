package typings.gulpMustache

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-mustache", JSImport.Namespace)
  @js.native
  def apply(view: View): Transform = js.native
  @JSImport("gulp-mustache", JSImport.Namespace)
  @js.native
  def apply(view: View, options: js.UndefOr[scala.Nothing], partials: Hash): Transform = js.native
  @JSImport("gulp-mustache", JSImport.Namespace)
  @js.native
  def apply(view: View, options: Options): Transform = js.native
  @JSImport("gulp-mustache", JSImport.Namespace)
  @js.native
  def apply(view: View, options: Options, partials: Hash): Transform = js.native
  
  type Hash = StringDictionary[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var extension: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  type View = js.UndefOr[Hash | String]
}
