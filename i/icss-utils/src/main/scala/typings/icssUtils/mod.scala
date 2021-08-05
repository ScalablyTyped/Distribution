package typings.icssUtils

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Container
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("icss-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createICSSRules(imports: CSSImports, exports: CSSExports): js.Array[Rule_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createICSSRules")(imports.asInstanceOf[js.Any], exports.asInstanceOf[js.Any])).asInstanceOf[js.Array[Rule_]]
  
  inline def extractICSS(css: Container): ExtractedICSS = ^.asInstanceOf[js.Dynamic].applyDynamic("extractICSS")(css.asInstanceOf[js.Any]).asInstanceOf[ExtractedICSS]
  inline def extractICSS(css: Container, removeRules: Boolean): ExtractedICSS = (^.asInstanceOf[js.Dynamic].applyDynamic("extractICSS")(css.asInstanceOf[js.Any], removeRules.asInstanceOf[js.Any])).asInstanceOf[ExtractedICSS]
  
  inline def replaceSymbols(css: Container, replacements: Replacements): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSymbols")(css.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceValueSymbols(value: String, replacements: Replacements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceValueSymbols")(value.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type CSSExports = StringDictionary[String]
  
  type CSSImports = StringDictionary[StringDictionary[String]]
  
  trait ExtractedICSS extends StObject {
    
    var icssExports: CSSExports
    
    var icssImports: CSSImports
  }
  object ExtractedICSS {
    
    inline def apply(icssExports: CSSExports, icssImports: CSSImports): ExtractedICSS = {
      val __obj = js.Dynamic.literal(icssExports = icssExports.asInstanceOf[js.Any], icssImports = icssImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractedICSS]
    }
    
    extension [Self <: ExtractedICSS](x: Self) {
      
      inline def setIcssExports(value: CSSExports): Self = StObject.set(x, "icssExports", value.asInstanceOf[js.Any])
      
      inline def setIcssImports(value: CSSImports): Self = StObject.set(x, "icssImports", value.asInstanceOf[js.Any])
    }
  }
  
  type Replacements = StringDictionary[String]
}
