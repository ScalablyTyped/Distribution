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
    
    @scala.inline
    def addRule(rule: Rule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def format(arrMessages: js.Array[LintResult]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(arrMessages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def format(arrMessages: js.Array[LintResult], options: FormatOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(arrMessages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def verify(fileContent: String): js.Array[LintResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Array[LintResult]]
    @scala.inline
    def verify(fileContent: String, ruleSet: RuleSet): js.Array[LintResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(fileContent.asInstanceOf[js.Any], ruleSet.asInstanceOf[js.Any])).asInstanceOf[js.Array[LintResult]]
  }
  
  trait FormatOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
  }
  object FormatOptions {
    
    @scala.inline
    def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
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
    
    @scala.inline
    def apply(col: Double, evidence: String, line: Double, message: String, rule: Rule): LintResult = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    @scala.inline
    implicit class LintResultMutableBuilder[Self <: LintResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence(value: String): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rule extends StObject {
    
    var description: String
    
    var id: String
    
    var link: String
  }
  object Rule {
    
    @scala.inline
    def apply(description: String, id: String, link: String): Rule = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleSet = StringDictionary[Boolean | String]
}
