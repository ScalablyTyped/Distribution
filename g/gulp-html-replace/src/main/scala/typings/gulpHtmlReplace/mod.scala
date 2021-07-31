package typings.gulpHtmlReplace

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-html-replace", JSImport.Namespace)
  @js.native
  val ^ : HtmlReplace = js.native
  
  trait AdvancedTask extends StObject {
    
    var src: String | js.Array[String]
    
    var tpl: String
  }
  object AdvancedTask {
    
    @scala.inline
    def apply(src: String | js.Array[String], tpl: String): AdvancedTask = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tpl = tpl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvancedTask]
    }
    
    @scala.inline
    implicit class AdvancedTaskMutableBuilder[Self <: AdvancedTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setTpl(value: String): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    }
  }
  
  type HtmlReplace = js.Function2[/* tasks */ Tasks, /* options */ js.UndefOr[Options], ReadWriteStream]
  
  trait Options extends StObject {
    
    var keepBlockTags: js.UndefOr[Boolean] = js.undefined
    
    var keepUnassigned: js.UndefOr[Boolean] = js.undefined
    
    var resolvePaths: js.UndefOr[Boolean] = js.undefined
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
      def setKeepBlockTags(value: Boolean): Self = StObject.set(x, "keepBlockTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepBlockTagsUndefined: Self = StObject.set(x, "keepBlockTags", js.undefined)
      
      @scala.inline
      def setKeepUnassigned(value: Boolean): Self = StObject.set(x, "keepUnassigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUnassignedUndefined: Self = StObject.set(x, "keepUnassigned", js.undefined)
      
      @scala.inline
      def setResolvePaths(value: Boolean): Self = StObject.set(x, "resolvePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvePathsUndefined: Self = StObject.set(x, "resolvePaths", js.undefined)
    }
  }
  
  type Tasks = StringDictionary[String | js.Array[String] | AdvancedTask]
  
  type _To = HtmlReplace
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HtmlReplace = ^
}
