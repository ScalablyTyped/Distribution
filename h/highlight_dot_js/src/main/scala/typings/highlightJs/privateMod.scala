package typings.highlightJs

import typings.highlightJs.mod.CompiledMode
import typings.highlightJs.mod.Language
import typings.highlightJs.mod.Mode
import typings.std.Error
import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateMod {
  
  trait AnnotatedError
    extends StObject
       with Error {
    
    var badRule: js.UndefOr[Mode] = js.undefined
    
    var languageName: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Mode | Language] = js.undefined
  }
  object AnnotatedError {
    
    inline def apply(message: String, name: String): AnnotatedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotatedError]
    }
    
    extension [Self <: AnnotatedError](x: Self) {
      
      inline def setBadRule(value: Mode): Self = StObject.set(x, "badRule", value.asInstanceOf[js.Any])
      
      inline def setBadRuleUndefined: Self = StObject.set(x, "badRule", js.undefined)
      
      inline def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      
      inline def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
      
      inline def setMode(value: Mode | Language): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait EnhancedMatch
    extends StObject
       with RegExpMatchArray {
    
    var rule: CompiledMode = js.native
    
    var `type`: MatchType = js.native
  }
  
  type KeywordData = js.Tuple2[String, Double]
  
  type KeywordDict = Record[String, KeywordData]
  
  object MatchType {
    
    inline def begin: "begin" = "begin".asInstanceOf["begin"]
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def illegal: "illegal" = "illegal".asInstanceOf["illegal"]
  }
  type MatchType = "begin" | "end" | "illegal"
}
