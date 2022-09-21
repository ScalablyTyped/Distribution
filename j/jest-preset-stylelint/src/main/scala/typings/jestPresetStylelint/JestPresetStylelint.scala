package typings.jestPresetStylelint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JestPresetStylelint {
  
  trait Case extends StObject {
    
    var code: String
    
    var description: js.UndefOr[String] = js.undefined
  }
  object Case {
    
    inline def apply(code: String): Case = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Case]
    }
    
    extension [Self <: Case](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait RejectCase
    extends StObject
       with Case
       with Report {
    
    var fixed: js.UndefOr[String] = js.undefined
    
    var only: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[js.Array[Report]] = js.undefined
  }
  object RejectCase {
    
    inline def apply(code: String): RejectCase = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RejectCase]
    }
    
    extension [Self <: RejectCase](x: Self) {
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setWarnings(value: js.Array[Report]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: Report*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait Report extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object Report {
    
    inline def apply(): Report = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Report]
    }
    
    extension [Self <: Report](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    var accept: js.UndefOr[js.Array[Case]] = js.undefined
    
    var config: js.UndefOr[Any] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.Array[String]
    
    var reject: js.UndefOr[js.Array[RejectCase]] = js.undefined
    
    var ruleName: String
    
    var skipBasicChecks: js.UndefOr[Boolean] = js.undefined
    
    var syntax: js.UndefOr[Syntax] = js.undefined
  }
  object Schema {
    
    inline def apply(plugins: js.Array[String], ruleName: String): Schema = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAccept(value: js.Array[Case]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: Case*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReject(value: js.Array[RejectCase]): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      inline def setRejectVarargs(value: RejectCase*): Self = StObject.set(x, "reject", js.Array(value*))
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setSkipBasicChecks(value: Boolean): Self = StObject.set(x, "skipBasicChecks", value.asInstanceOf[js.Any])
      
      inline def setSkipBasicChecksUndefined: Self = StObject.set(x, "skipBasicChecks", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestPresetStylelint.jestPresetStylelintStrings.`css-in-js`
    - typings.jestPresetStylelint.jestPresetStylelintStrings.html
    - typings.jestPresetStylelint.jestPresetStylelintStrings.less
    - typings.jestPresetStylelint.jestPresetStylelintStrings.markdown
    - typings.jestPresetStylelint.jestPresetStylelintStrings.sass
    - typings.jestPresetStylelint.jestPresetStylelintStrings.scss
    - typings.jestPresetStylelint.jestPresetStylelintStrings.sugarss
  */
  trait Syntax extends StObject
  object Syntax {
    
    inline def `css-in-js`: typings.jestPresetStylelint.jestPresetStylelintStrings.`css-in-js` = "css-in-js".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.`css-in-js`]
    
    inline def html: typings.jestPresetStylelint.jestPresetStylelintStrings.html = "html".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.html]
    
    inline def less: typings.jestPresetStylelint.jestPresetStylelintStrings.less = "less".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.less]
    
    inline def markdown: typings.jestPresetStylelint.jestPresetStylelintStrings.markdown = "markdown".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.markdown]
    
    inline def sass: typings.jestPresetStylelint.jestPresetStylelintStrings.sass = "sass".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.sass]
    
    inline def scss: typings.jestPresetStylelint.jestPresetStylelintStrings.scss = "scss".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.scss]
    
    inline def sugarss: typings.jestPresetStylelint.jestPresetStylelintStrings.sugarss = "sugarss".asInstanceOf[typings.jestPresetStylelint.jestPresetStylelintStrings.sugarss]
  }
  
  type TestRule = js.Function1[/* schema */ Schema, Unit]
}
