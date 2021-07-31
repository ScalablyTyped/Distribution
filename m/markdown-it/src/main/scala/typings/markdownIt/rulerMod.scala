package typings.markdownIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulerMod {
  
  /**
    * class Ruler
    *
    * Helper class, used by [[MarkdownIt#core]], [[MarkdownIt#block]] and
    * [[MarkdownIt#inline]] to manage sequences of functions (rules):
    *
    * - keep rules in defined order
    * - assign the name to each rule
    * - enable/disable rules
    * - add/replace rules
    * - allow assign rules to additional named chains (in the same)
    * - cacheing lists of active rules
    *
    * You will not need use this class directly until write plugins. For simple
    * rules control use [[MarkdownIt.disable]], [[MarkdownIt.enable]] and
    * [[MarkdownIt.use]].
    */
  @JSImport("markdown-it/lib/ruler", JSImport.Namespace)
  @js.native
  class ^[T] ()
    extends StObject
       with Ruler[T]
  
  trait RuleOptions extends StObject {
    
    /**
      * array with names of "alternate" chains.
      */
    var alt: js.Array[String]
  }
  object RuleOptions {
    
    @scala.inline
    def apply(alt: js.Array[String]): RuleOptions = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleOptions]
    }
    
    @scala.inline
    implicit class RuleOptionsMutableBuilder[Self <: RuleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: js.Array[String]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltVarargs(value: String*): Self = StObject.set(x, "alt", js.Array(value :_*))
    }
  }
  
  /**
    * class Ruler
    *
    * Helper class, used by [[MarkdownIt#core]], [[MarkdownIt#block]] and
    * [[MarkdownIt#inline]] to manage sequences of functions (rules):
    *
    * - keep rules in defined order
    * - assign the name to each rule
    * - enable/disable rules
    * - add/replace rules
    * - allow assign rules to additional named chains (in the same)
    * - cacheing lists of active rules
    *
    * You will not need use this class directly until write plugins. For simple
    * rules control use [[MarkdownIt.disable]], [[MarkdownIt.enable]] and
    * [[MarkdownIt.use]].
    */
  @js.native
  trait Ruler[T] extends StObject {
    
    /**
      * Add new rule to chain after one with given name. See also
      * [[Ruler.before]], [[Ruler.push]].
      *
      * ##### Options:
      *
      * - __alt__ - array with names of "alternate" chains.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * md.inline.ruler.after('text', 'my_rule', function replace(state) {
      *   //...
      * });
      * ```
      *
      * @param afterName new rule will be added after this one.
      * @param ruleName name of added rule.
      * @param fn rule function.
      * @param options rule options (not mandatory).
      */
    def after(afterName: String, ruleName: String, fn: T): Unit = js.native
    def after(afterName: String, ruleName: String, fn: T, options: RuleOptions): Unit = js.native
    
    /**
      * Replace rule by name with new function & options. Throws error if name not
      * found.
      *
      * ##### Example
      *
      * Replace existing typographer replacement rule with new one:
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * md.core.ruler.at('replacements', function replace(state) {
      *   //...
      * });
      * ```
      *
      * @param name rule name to replace.
      * @param fn new rule function.
      * @param options new rule options (not mandatory).
      */
    def at(name: String, fn: T): Unit = js.native
    def at(name: String, fn: T, options: RuleOptions): Unit = js.native
    
    /**
      * Add new rule to chain before one with given name. See also
      * [[Ruler.after]], [[Ruler.push]].
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * md.block.ruler.before('paragraph', 'my_rule', function replace(state) {
      *   //...
      * });
      * ```
      *
      * @param beforeName new rule will be added before this one.
      * @param ruleName name of added rule.
      * @param fn rule function.
      * @param options rule options (not mandatory).
      */
    def before(beforeName: String, ruleName: String, fn: T): Unit = js.native
    def before(beforeName: String, ruleName: String, fn: T, options: RuleOptions): Unit = js.native
    
    /**
      * Disable rules with given names. If any rule name not found - throw Error.
      * Errors can be disabled by second param.
      *
      * Returns list of found rule names (if no exception happened).
      *
      * See also [[Ruler.enable]], [[Ruler.enableOnly]].
      *
      * @param list list of rule names to disable.
      * @param ignoreInvalid set `true` to ignore errors when rule not found.
      */
    def disable(list: String): js.Array[String] = js.native
    def disable(list: String, ignoreInvalid: Boolean): js.Array[String] = js.native
    def disable(list: js.Array[String]): js.Array[String] = js.native
    def disable(list: js.Array[String], ignoreInvalid: Boolean): js.Array[String] = js.native
    
    /**
      * Enable rules with given names. If any rule name not found - throw Error.
      * Errors can be disabled by second param.
      *
      * Returns list of found rule names (if no exception happened).
      *
      * See also [[Ruler.disable]], [[Ruler.enableOnly]].
      *
      * @param list list of rule names to enable.
      * @param ignoreInvalid set `true` to ignore errors when rule not found.
      */
    def enable(list: String): js.Array[String] = js.native
    def enable(list: String, ignoreInvalid: Boolean): js.Array[String] = js.native
    def enable(list: js.Array[String]): js.Array[String] = js.native
    def enable(list: js.Array[String], ignoreInvalid: Boolean): js.Array[String] = js.native
    
    /**
      * Enable rules with given names, and disable everything else. If any rule name
      * not found - throw Error. Errors can be disabled by second param.
      *
      * See also [[Ruler.disable]], [[Ruler.enable]].
      *
      * @param list list of rule names to enable (whitelist).
      * @param ignoreInvalid set `true` to ignore errors when rule not found.
      */
    def enableOnly(list: String): js.Array[String] = js.native
    def enableOnly(list: String, ignoreInvalid: Boolean): js.Array[String] = js.native
    def enableOnly(list: js.Array[String]): js.Array[String] = js.native
    def enableOnly(list: js.Array[String], ignoreInvalid: Boolean): js.Array[String] = js.native
    
    /**
      * Return array of active functions (rules) for given chain name. It analyzes
      * rules configuration, compiles caches if not exists and returns result.
      *
      * Default chain name is `''` (empty string). It can't be skipped. That's
      * done intentionally, to keep signature monomorphic for high speed.
      */
    def getRules(chainName: String): js.Array[T] = js.native
    
    /**
      * Push new rule to the end of chain. See also
      * [[Ruler.before]], [[Ruler.after]].
      *
      * ##### Options:
      *
      * - __alt__ - array with names of "alternate" chains.
      *
      * ##### Example
      *
      * ```javascript
      * var md = require('markdown-it')();
      *
      * md.core.ruler.push('my_rule', function replace(state) {
      *   //...
      * });
      * ```
      *
      * @param ruleName name of added rule.
      * @param fn rule function.
      * @param options rule options (not mandatory).
      */
    def push(ruleName: String, fn: T): Unit = js.native
    def push(ruleName: String, fn: T, options: RuleOptions): Unit = js.native
  }
}
