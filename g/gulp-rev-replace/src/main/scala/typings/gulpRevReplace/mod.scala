package typings.gulpRevReplace

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-rev-replace", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-rev-replace", JSImport.Namespace)
  @js.native
  def apply(options: Options): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var canonicalUris: js.UndefOr[Boolean] = js.native
    
    var manifest: js.UndefOr[ReadWriteStream] = js.native
    
    var modifyReved: js.UndefOr[js.Function] = js.native
    
    var modifyUnreved: js.UndefOr[js.Function] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var replaceInExtensions: js.UndefOr[js.Array[String]] = js.native
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
      def setCanonicalUris(value: Boolean): Self = StObject.set(x, "canonicalUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalUrisUndefined: Self = StObject.set(x, "canonicalUris", js.undefined)
      
      @scala.inline
      def setManifest(value: ReadWriteStream): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setModifyReved(value: js.Function): Self = StObject.set(x, "modifyReved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyRevedUndefined: Self = StObject.set(x, "modifyReved", js.undefined)
      
      @scala.inline
      def setModifyUnreved(value: js.Function): Self = StObject.set(x, "modifyUnreved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyUnrevedUndefined: Self = StObject.set(x, "modifyUnreved", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setReplaceInExtensions(value: js.Array[String]): Self = StObject.set(x, "replaceInExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInExtensionsUndefined: Self = StObject.set(x, "replaceInExtensions", js.undefined)
      
      @scala.inline
      def setReplaceInExtensionsVarargs(value: String*): Self = StObject.set(x, "replaceInExtensions", js.Array(value :_*))
    }
  }
}
