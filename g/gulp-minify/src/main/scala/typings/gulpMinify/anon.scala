package typings.gulpMinify

import typings.gulpMinify.gulpMinifyBooleans.`false`
import typings.gulpMinify.gulpMinifyNumbers.`32000`
import typings.gulpMinify.gulpMinifyNumbers.`80`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Asciionly extends StObject {
    
    /**
      * Output ASCII-safe? (encodes Unicode characters as ASCII)
      */
    var ascii_only: js.UndefOr[Boolean] = js.native
    
    /**
      * Beautify output?
      */
    var beautify: js.UndefOr[Boolean] = js.native
    
    /**
      * Use brackets every time?
      */
    var bracketize: js.UndefOr[Boolean] = js.native
    
    /**
      * Output comments?
      */
    var comments: js.UndefOr[Boolean] = js.native
    
    /**
      * Beautify output?
      */
    var ie_proof: js.UndefOr[Boolean] = js.native
    
    /**
      * Indentation level (only when `beautify`)
      */
    var indent_level: js.UndefOr[Double] = js.native
    
    /**
      * Start indentation on every line (only when `beautify`)
      */
    var indent_start: js.UndefOr[Double] = js.native
    
    /**
      * Escape "</script"?
      */
    var inline_script: js.UndefOr[Boolean] = js.native
    
    /**
      * Maximum line length (for non-beautified output)
      */
    var max_line_len: js.UndefOr[`32000`] = js.native
    
    /**
      * Quote all keys in object literals?
      */
    var quote_keys: js.UndefOr[`false`] = js.native
    
    /**
      * Use semicolons to separate statements? (otherwise, newlines)
      */
    var semicolons: js.UndefOr[Boolean] = js.native
    
    /**
      * Output a source map
      */
    var source_map: js.UndefOr[Boolean] = js.native
    
    /**
      * Add a space after colon signs?
      */
    var space_colon: js.UndefOr[Boolean] = js.native
    
    /**
      * Informative maximum line width (for beautified output)
      */
    var width: js.UndefOr[`80`] = js.native
  }
  object Asciionly {
    
    @scala.inline
    def apply(): Asciionly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Asciionly]
    }
    
    @scala.inline
    implicit class AsciionlyMutableBuilder[Self <: Asciionly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscii_only(value: Boolean): Self = StObject.set(x, "ascii_only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscii_onlyUndefined: Self = StObject.set(x, "ascii_only", js.undefined)
      
      @scala.inline
      def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      @scala.inline
      def setBracketize(value: Boolean): Self = StObject.set(x, "bracketize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBracketizeUndefined: Self = StObject.set(x, "bracketize", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setIe_proof(value: Boolean): Self = StObject.set(x, "ie_proof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe_proofUndefined: Self = StObject.set(x, "ie_proof", js.undefined)
      
      @scala.inline
      def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
      
      @scala.inline
      def setIndent_start(value: Double): Self = StObject.set(x, "indent_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_startUndefined: Self = StObject.set(x, "indent_start", js.undefined)
      
      @scala.inline
      def setInline_script(value: Boolean): Self = StObject.set(x, "inline_script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_scriptUndefined: Self = StObject.set(x, "inline_script", js.undefined)
      
      @scala.inline
      def setMax_line_len(value: `32000`): Self = StObject.set(x, "max_line_len", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_line_lenUndefined: Self = StObject.set(x, "max_line_len", js.undefined)
      
      @scala.inline
      def setQuote_keys(value: `false`): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
      
      @scala.inline
      def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      @scala.inline
      def setSource_map(value: Boolean): Self = StObject.set(x, "source_map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_mapUndefined: Self = StObject.set(x, "source_map", js.undefined)
      
      @scala.inline
      def setSpace_colon(value: Boolean): Self = StObject.set(x, "space_colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_colonUndefined: Self = StObject.set(x, "space_colon", js.undefined)
      
      @scala.inline
      def setWidth(value: `80`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Booleans extends StObject {
    
    /**
      * optimize boolean expressions
      */
    var booleans: js.UndefOr[Boolean] = js.native
    
    /**
      * try to cascade `right` into `left` in sequences
      */
    var cascade: js.UndefOr[Boolean] = js.native
    
    /**
      * optimize comparisons
      */
    var comparisons: js.UndefOr[Boolean] = js.native
    
    //
    /**
      * optimize if-s and conditional expressions
      */
    var conditionals: js.UndefOr[Boolean] = js.native
    
    /**
      * discard unreachable code
      */
    var dead_code: js.UndefOr[Boolean] = js.native
    
    /**
      * discard “debugger” statements
      */
    var drop_debugger: js.UndefOr[Boolean] = js.native
    
    /**
      * optimize boolean expressions
      */
    var evaluate: js.UndefOr[Boolean] = js.native
    
    /**
      * global definitions
      */
    var global_defs: js.UndefOr[js.Object] = js.native
    
    /**
      * hoist function declarations
      */
    var hoist_funs: js.UndefOr[Boolean] = js.native
    
    /**
      * hoist variable declarations
      */
    var hoist_vars: js.UndefOr[Boolean] = js.native
    
    // hoist variable declarations
    /**
      * optimize if-s followed by return/continue
      */
    var if_return: js.UndefOr[Boolean] = js.native
    
    /**
      * join var declarations
      */
    var join_vars: js.UndefOr[Boolean] = js.native
    
    /**
      * optimize loops
      */
    var loops: js.UndefOr[Boolean] = js.native
    
    /**
      * optimize property access?: a["foo"] → a.foo
      */
    var properties: js.UndefOr[Boolean] = js.native
    
    /**
      * join consecutive statemets with the “comma operator”
      */
    var sequences: js.UndefOr[Boolean] = js.native
    
    /**
      * drop side-effect-free statements
      */
    var side_effects: js.UndefOr[Boolean] = js.native
    
    /**
      * some unsafe optimizations (see below)
      */
    var unsafe: js.UndefOr[Boolean] = js.native
    
    /**
      * drop unused variables/functions
      */
    var unused: js.UndefOr[Boolean] = js.native
    
    /**
      * warn about potentially dangerous optimizations/code
      */
    var warnings: js.UndefOr[Boolean] = js.native
  }
  object Booleans {
    
    @scala.inline
    def apply(): Booleans = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Booleans]
    }
    
    @scala.inline
    implicit class BooleansMutableBuilder[Self <: Booleans] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBooleans(value: Boolean): Self = StObject.set(x, "booleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleansUndefined: Self = StObject.set(x, "booleans", js.undefined)
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setComparisons(value: Boolean): Self = StObject.set(x, "comparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonsUndefined: Self = StObject.set(x, "comparisons", js.undefined)
      
      @scala.inline
      def setConditionals(value: Boolean): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionalsUndefined: Self = StObject.set(x, "conditionals", js.undefined)
      
      @scala.inline
      def setDead_code(value: Boolean): Self = StObject.set(x, "dead_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDead_codeUndefined: Self = StObject.set(x, "dead_code", js.undefined)
      
      @scala.inline
      def setDrop_debugger(value: Boolean): Self = StObject.set(x, "drop_debugger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrop_debuggerUndefined: Self = StObject.set(x, "drop_debugger", js.undefined)
      
      @scala.inline
      def setEvaluate(value: Boolean): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      @scala.inline
      def setGlobal_defs(value: js.Object): Self = StObject.set(x, "global_defs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal_defsUndefined: Self = StObject.set(x, "global_defs", js.undefined)
      
      @scala.inline
      def setHoist_funs(value: Boolean): Self = StObject.set(x, "hoist_funs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoist_funsUndefined: Self = StObject.set(x, "hoist_funs", js.undefined)
      
      @scala.inline
      def setHoist_vars(value: Boolean): Self = StObject.set(x, "hoist_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoist_varsUndefined: Self = StObject.set(x, "hoist_vars", js.undefined)
      
      @scala.inline
      def setIf_return(value: Boolean): Self = StObject.set(x, "if_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIf_returnUndefined: Self = StObject.set(x, "if_return", js.undefined)
      
      @scala.inline
      def setJoin_vars(value: Boolean): Self = StObject.set(x, "join_vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoin_varsUndefined: Self = StObject.set(x, "join_vars", js.undefined)
      
      @scala.inline
      def setLoops(value: Boolean): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
      
      @scala.inline
      def setProperties(value: Boolean): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSequences(value: Boolean): Self = StObject.set(x, "sequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequencesUndefined: Self = StObject.set(x, "sequences", js.undefined)
      
      @scala.inline
      def setSide_effects(value: Boolean): Self = StObject.set(x, "side_effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide_effectsUndefined: Self = StObject.set(x, "side_effects", js.undefined)
      
      @scala.inline
      def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      @scala.inline
      def setUnused(value: Boolean): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait Min extends StObject {
    
    /**
      * The suffix string of the filenames that output minified files ends with or the regex expressions to be replaced with input filenames.
      */
    var min: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The suffix string of the filenames that output source files ends with.
      */
    var src: js.UndefOr[String] = js.native
  }
  object Min {
    
    @scala.inline
    def apply(): Min = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Min]
    }
    
    @scala.inline
    implicit class MinMutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMin(value: String | js.Array[String]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMinVarargs(value: String*): Self = StObject.set(x, "min", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
