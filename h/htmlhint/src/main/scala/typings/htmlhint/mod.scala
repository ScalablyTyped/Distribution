package typings.htmlhint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object HTMLHint {
    
    @JSImport("htmlhint", "HTMLHint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addRule(rule: Rule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def format(arrMessages: js.Array[LintResult]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(arrMessages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def format(arrMessages: js.Array[LintResult], options: FormatOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(arrMessages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def verify(fileContent: String): js.Array[LintResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Array[LintResult]]
    inline def verify(fileContent: String, ruleSet: RuleSet): js.Array[LintResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(fileContent.asInstanceOf[js.Any], ruleSet.asInstanceOf[js.Any])).asInstanceOf[js.Array[LintResult]]
  }
  
  trait FormatOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  trait LintResult extends StObject {
    
    var col: Double
    
    var evidence: String
    
    var line: Double
    
    var message: String
    
    var rule: Rule
  }
  object LintResult {
    
    inline def apply(col: Double, evidence: String, line: Double, message: String, rule: Rule): LintResult = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    extension [Self <: LintResult](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setEvidence(value: String): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rule extends StObject {
    
    var description: String
    
    var id: String
    
    var link: String
  }
  object Rule {
    
    inline def apply(description: String, id: String, link: String): Rule = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleSet = StringDictionary[Boolean | String]
}
