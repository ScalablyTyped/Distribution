package typings.grayMatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gray-matter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gray-matter", JSImport.Default)
  @js.native
  def default: GrayMatter = js.native
  inline def default_=(x: GrayMatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait GrayMatter extends StObject {
    
    def apply(str: String): js.Any = js.native
    def apply(str: String, options: Unit, delims: js.Array[String]): js.Any = js.native
    def apply(str: String, options: Unit, delims: js.Array[String], parser: js.Function): js.Any = js.native
    def apply(str: String, options: Unit, delims: Unit, parser: js.Function): js.Any = js.native
    def apply(str: String, options: GrayMatterOption): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: js.Array[String]): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: js.Array[String], parser: js.Function): js.Any = js.native
    def apply(str: String, options: GrayMatterOption, delims: Unit, parser: js.Function): js.Any = js.native
    
    def read(fp: String): js.Any = js.native
    def read(fp: String, options: GrayMatterOption): js.Any = js.native
    
    def stringify(str: String, data: js.Object): String = js.native
    def stringify(str: String, data: js.Object, options: GrayMatterOption): String = js.native
  }
  
  trait GrayMatterOption extends StObject {
    
    var delims: String
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[js.Function] = js.undefined
  }
  object GrayMatterOption {
    
    inline def apply(delims: String): GrayMatterOption = {
      val __obj = js.Dynamic.literal(delims = delims.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrayMatterOption]
    }
    
    extension [Self <: GrayMatterOption](x: Self) {
      
      inline def setDelims(value: String): Self = StObject.set(x, "delims", value.asInstanceOf[js.Any])
      
      inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setParser(value: js.Function): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
}
