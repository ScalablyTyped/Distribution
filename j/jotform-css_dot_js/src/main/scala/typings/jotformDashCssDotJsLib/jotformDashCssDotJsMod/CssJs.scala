package typings
package jotformDashCssDotJsLib.jotformDashCssDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssJs extends js.Object {
  def applyNamespacing(parsedCss: java.lang.String, prefix: java.lang.String): CssJs = js.native
  /**
  	 * Given css string or objectArray, parses it and then for every selector,
  	 * prepends this.cssPreviewNamespace to prevent css collision issues
  	 * @returns object in which this css prepended
  	 */
  def applyNamespacing(parsedCss: CssJs, prefix: java.lang.String): CssJs = js.native
  /**
  	 * Filter outs rule objects whose type param equal to DELETED
  	 * @param rules array of rules
  	 */
  def compactRules(rules: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
  	 * Compresses given cssObjectArray and tries to minimize selector redundence
  	 */
  def compressCSS(cssObject: CssJs): CssJs = js.native
  /**
  	 * @returns diff css object contains changed values in css1 in regards to css2, false if same
  	 */
  def cssDiff(css1: CssJs, css2: CssJs): scala.Boolean = js.native
  /**
  	 * deletes cssObjects having given selector, and returns new array
  	 */
  def deleteBySelector(cssObject: CssJs, selector: java.lang.String): CssJs = js.native
  /**
  	 * Finds styles that have given selector, compress them and returns them
  	 */
  def findBySelector(cssObject: CssJs, selector: java.lang.String): CssJs = js.native
  def findBySelector(cssObject: CssJs, selector: java.lang.String, contains: scala.Boolean): CssJs = js.native
  /**
  	 * returns the rule having given directive
  	 */
  def findCorrespondingRule(rules: java.lang.String, directive: java.lang.String): java.lang.String | scala.Boolean = js.native
  def findCorrespondingRule(rules: java.lang.String, directive: java.lang.String, value: java.lang.String): java.lang.String | scala.Boolean = js.native
  /**
  	 * Computes string for ace editor using this.css or given cssBase optional parameter
  	 */
  def getCSSForEditor(parsedCss: CssJs): java.lang.String = js.native
  def getCSSForEditor(parsedCss: CssJs, depth: scala.Double): java.lang.String = js.native
  /**
  	 * Given rules array, returns visually formatted css string to be used inside editor
  	 */
  def getCSSOfRules(rules: java.lang.String): java.lang.String = js.native
  /**
  	 * inserts new css objects into a bigger css object with same selectors grouped together
  	 * @param cssObject array of bigger css object to be pushed into
  	 * @param minimalObject single css object
  	 * @param reverse reverse [optional] default is false, if given, cssObject will be reversly traversed
  	 * resulting more priority in minimalObject's styles
  	 */
  def intelligentCSSPush(cssObject: CssJs, minimalObject: CssJs): scala.Unit = js.native
  def intelligentCSSPush(cssObject: CssJs, minimalObject: CssJs, reverse: scala.Boolean): scala.Unit = js.native
  /**
  	 * @param cssObject target css object array
  	 * @param newArray source array that will be pushed into cssObject parameter
  	 * @param reverse [optional], if given true, first parameter will be traversed on reversed order
  	 * effectively giving priority to the styles in newArray
  	 */
  def intelligentMerge(cssObject: CssJs, newArray: CssJs): scala.Unit = js.native
  def intelligentMerge(cssObject: CssJs, newArray: CssJs, reverse: scala.Boolean): scala.Unit = js.native
  /**
  	 * Parses given css string, and returns css object
  	 * keys as selectors and values are css rules
  	 * eliminates all css comments before parsing
  	 * @param css string to be parsed
  	 * @returns css object
  	 */
  def parseCSS(css: java.lang.String): CssJs = js.native
  /**
  	 * parses given string containing css directives
  	 * @param rules, css directive string eg color:white; font-size:18px;
  	 * @returns an array of objects containing ruleName:ruleValue pairs
  	 */
  def parseRules(rules: java.lang.String): js.Array[_] = js.native
  /**
  	 * @param css the original css string to be stripped out of comments
  	 * @returns cleaned CSS containing no css comments
  	 */
  def stripComments(css: java.lang.String): java.lang.String = js.native
}

