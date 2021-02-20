package typings.icssUtils

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Container
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("icss-utils", "createICSSRules")
  @js.native
  def createICSSRules(imports: CSSImports, exports: CSSExports): js.Array[Rule_] = js.native
  
  @JSImport("icss-utils", "extractICSS")
  @js.native
  def extractICSS(css: Container): ExtractedICSS = js.native
  @JSImport("icss-utils", "extractICSS")
  @js.native
  def extractICSS(css: Container, removeRules: Boolean): ExtractedICSS = js.native
  
  @JSImport("icss-utils", "replaceSymbols")
  @js.native
  def replaceSymbols(css: Container, replacements: Replacements): Unit = js.native
  
  @JSImport("icss-utils", "replaceValueSymbols")
  @js.native
  def replaceValueSymbols(value: String, replacements: Replacements): String = js.native
  
  type CSSExports = StringDictionary[String]
  
  type CSSImports = StringDictionary[StringDictionary[String]]
  
  @js.native
  trait ExtractedICSS extends StObject {
    
    var icssExports: CSSExports = js.native
    
    var icssImports: CSSImports = js.native
  }
  object ExtractedICSS {
    
    @scala.inline
    def apply(icssExports: CSSExports, icssImports: CSSImports): ExtractedICSS = {
      val __obj = js.Dynamic.literal(icssExports = icssExports.asInstanceOf[js.Any], icssImports = icssImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractedICSS]
    }
    
    @scala.inline
    implicit class ExtractedICSSMutableBuilder[Self <: ExtractedICSS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcssExports(value: CSSExports): Self = StObject.set(x, "icssExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcssImports(value: CSSImports): Self = StObject.set(x, "icssImports", value.asInstanceOf[js.Any])
    }
  }
  
  type Replacements = StringDictionary[String]
}
