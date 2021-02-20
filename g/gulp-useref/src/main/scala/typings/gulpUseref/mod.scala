package typings.gulpUseref

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-useref", JSImport.Namespace)
  @js.native
  val ^ : Useref = js.native
  
  @js.native
  trait Options extends StObject {
    
    var additionalStreams: js.UndefOr[js.Array[ReadWriteStream]] = js.native
    
    var base: js.UndefOr[String] = js.native
    
    var noAssets: js.UndefOr[Boolean] = js.native
    
    var noconcat: js.UndefOr[Boolean] = js.native
    
    var searchPath: js.UndefOr[String | js.Array[String]] = js.native
    
    var transformPath: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.native
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
      def setAdditionalStreams(value: js.Array[ReadWriteStream]): Self = StObject.set(x, "additionalStreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalStreamsUndefined: Self = StObject.set(x, "additionalStreams", js.undefined)
      
      @scala.inline
      def setAdditionalStreamsVarargs(value: ReadWriteStream*): Self = StObject.set(x, "additionalStreams", js.Array(value :_*))
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setNoAssets(value: Boolean): Self = StObject.set(x, "noAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAssetsUndefined: Self = StObject.set(x, "noAssets", js.undefined)
      
      @scala.inline
      def setNoconcat(value: Boolean): Self = StObject.set(x, "noconcat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoconcatUndefined: Self = StObject.set(x, "noconcat", js.undefined)
      
      @scala.inline
      def setSearchPath(value: String | js.Array[String]): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
      
      @scala.inline
      def setSearchPathVarargs(value: String*): Self = StObject.set(x, "searchPath", js.Array(value :_*))
      
      @scala.inline
      def setTransformPath(value: /* filePath */ String => Unit): Self = StObject.set(x, "transformPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
    }
  }
  
  type Useref = js.Function2[/* options */ js.UndefOr[Options], /* repeated */ ReadWriteStream, ReadWriteStream]
  
  type _To = Useref
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Useref = ^
}
