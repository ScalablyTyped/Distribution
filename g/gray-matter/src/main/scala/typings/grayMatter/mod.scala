package typings.grayMatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gray-matter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gray-matter", JSImport.Default)
  @js.native
  def default: GrayMatter = js.native
  @scala.inline
  def default_=(x: GrayMatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait GrayMatter extends StObject {
    
    def apply(str: String): js.Any = js.native
    def apply(
      str: String,
      options: js.UndefOr[scala.Nothing],
      delims: js.UndefOr[scala.Nothing],
      parser: js.Function
    ): js.Any = js.native
    def apply(str: String, options: js.UndefOr[scala.Nothing], delims: js.Array[String]): js.Any = js.native
    def apply(str: String, options: js.UndefOr[scala.Nothing], delims: js.Array[String], parser: js.Function): js.Any = js.native
    def apply(str: String, options: GrayMatterOption): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: js.UndefOr[scala.Nothing], parser: js.Function): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: js.Array[String]): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: js.Array[String], parser: js.Function): js.Any = js.native
    
    def read(fp: String): js.Any = js.native
    def read(fp: String, options: GrayMatterOption): js.Any = js.native
    
    def stringify(str: String, data: js.Object): String = js.native
    def stringify(str: String, data: js.Object, options: GrayMatterOption): String = js.native
  }
  
  @js.native
  trait GrayMatterOption extends StObject {
    
    var delims: String = js.native
    
    var eval: js.UndefOr[Boolean] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var parser: js.UndefOr[js.Function] = js.native
  }
  object GrayMatterOption {
    
    @scala.inline
    def apply(delims: String): GrayMatterOption = {
      val __obj = js.Dynamic.literal(delims = delims.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrayMatterOption]
    }
    
    @scala.inline
    implicit class GrayMatterOptionMutableBuilder[Self <: GrayMatterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelims(value: String): Self = StObject.set(x, "delims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setParser(value: js.Function): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
}
