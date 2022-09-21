package typings.htmlhint

import typings.htmlhint.typesMod.Hint
import typings.htmlhint.typesMod.ReportType
import typings.htmlhint.typesMod.Rule
import typings.htmlhint.typesMod.Ruleset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  @JSImport("htmlhint/reporter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Reporter {
    def this(html: String, ruleset: Ruleset) = this()
    
    /* CompleteClass */
    var brLen: Double = js.native
    
    /* CompleteClass */
    override def error(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var html: String = js.native
    
    /* CompleteClass */
    override def info(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var lines: js.Array[String] = js.native
    
    /* CompleteClass */
    var messages: js.Array[Hint] = js.native
    
    /* private */ /* CompleteClass */
    override def report(`type`: ReportType, message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
    
    /* CompleteClass */
    var ruleset: Ruleset = js.native
    
    /* CompleteClass */
    override def warn(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit = js.native
  }
  
  trait Reporter extends StObject {
    
    var brLen: Double
    
    def error(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var html: String
    
    def info(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var lines: js.Array[String]
    
    var messages: js.Array[Hint]
    
    /* private */ def report(`type`: ReportType, message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
    
    var ruleset: Ruleset
    
    def warn(message: String, line: Double, col: Double, rule: Rule, raw: String): Unit
  }
  object Reporter {
    
    inline def apply(
      brLen: Double,
      error: (String, Double, Double, Rule, String) => Unit,
      html: String,
      info: (String, Double, Double, Rule, String) => Unit,
      lines: js.Array[String],
      messages: js.Array[Hint],
      report: (ReportType, String, Double, Double, Rule, String) => Unit,
      ruleset: Ruleset,
      warn: (String, Double, Double, Rule, String) => Unit
    ): Reporter = {
      val __obj = js.Dynamic.literal(brLen = brLen.asInstanceOf[js.Any], error = js.Any.fromFunction5(error), html = html.asInstanceOf[js.Any], info = js.Any.fromFunction5(info), lines = lines.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], report = js.Any.fromFunction6(report), ruleset = ruleset.asInstanceOf[js.Any], warn = js.Any.fromFunction5(warn))
      __obj.asInstanceOf[Reporter]
    }
    
    extension [Self <: Reporter](x: Self) {
      
      inline def setBrLen(value: Double): Self = StObject.set(x, "brLen", value.asInstanceOf[js.Any])
      
      inline def setError(value: (String, Double, Double, Rule, String) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction5(value))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: (String, Double, Double, Rule, String) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction5(value))
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setMessages(value: js.Array[Hint]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: Hint*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setReport(value: (ReportType, String, Double, Double, Rule, String) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction6(value))
      
      inline def setRuleset(value: Ruleset): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: (String, Double, Double, Rule, String) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction5(value))
    }
  }
}
