package typings.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * If an object or map contains a key that, when converted to a string,
    * is equal to the value of `aliasString`, then the name of the XML element
    * containing the object will be replaced with the value associated with
    * said key.
    *
    * For example, if `aliasString` is `"="`, then the following object:
    * ```javascript
    * {
    *     "abc": {
    *         "=": "def"
    *         "#": "ghi"
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <def>ghi</def>
    * </root>
    * ```
    *
    * The default alias string is `"="`.
    */
  var aliasString: js.UndefOr[String] = js.undefined
  /**
    * If an object or map contains a key that, when converted to a string,
    * begins with the value of `attributeString`, then the value mapped by
    * said key will be interpreted as attributes for the XML element for that
    * object.
    *
    * The keys of the value of `attributeString` are interpreted as attribute
    * names, while the values mapping to those keys are interpreted as
    * attribute values.
    *
    * For example, if `attributeString` is `"@"`, then the following object:
    * ```javascript
    * {
    *     "abc": {
    *         "@1": {
    *             "ghi": "jkl",
    *             "mno": "pqr"
    *         },
    *         "stu": "vwx",
    *         "@2": {
    *             "yza": "bcd"
    *         },
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc ghi='jkl' mno='pqr' yza='bcd'>
    *         <stu>vwx</stu>
    *     </abc>
    * </root>
    * ```
    *
    * The default attribute string is `"@"`.
    */
  var attributeString: js.UndefOr[String] = js.undefined
  /**
    * Whether to enclose any text containing the characters `<` or `&`
    * in CDATA sections. If this is false, these characters shall be replaced
    * with XML escape characters instead.
    *
    * By default, this is disabled.
    */
  var cdataInvalidChars: js.UndefOr[Boolean] = js.undefined
  /**
    * If an object or map contains a key that, when converted to a string, is
    * equal to an item in `cdataKeys`, then the value mapped by said key will
    * be enclosed in a CDATA section.
    *
    * For example, if `cdataKeys` is:
    * ```javascript
    * [
    *     "abc"
    * ]
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "abc": "def&",
    *     "ghi": "jkl",
    *     "mno": "pqr<"
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc><![CDATA[def&]]></ghi>
    *     <ghi>jlk</ghi>
    *     <mno>pqr&lt;</mno>
    * </root>
    * ```
    *
    * If `cdataKeys` has a key named `"*"`, then that entry will match all
    * keys.
    *
    * By default, this is an empty array.
    */
  var cdataKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The options associated with the XML declaration.
    */
  var declaration: js.UndefOr[IDeclarationOptions] = js.undefined
  /**
    * The options associated with the XML document type definition.
    */
  var dtd: js.UndefOr[IDtdOptions] = js.undefined
  /**
    * The options associated with the formatting of the XML document.
    */
  var format: js.UndefOr[IFormatOptions] = js.undefined
  /**
    * Whether to replace any characters that are not valid in XML in particular
    * contexts with the Unicode replacement character, U+FFFD.
    *
    * At present this is limited to attribute names and values; element names
    * and character data; CDATA sections; and comments. This may be extended
    * in future.
    *
    * By default, this is disabled.
    */
  var replaceInvalidChars: js.UndefOr[Boolean] = js.undefined
  /**
    * If a value has a type (as defined by calling `Object.prototype.toString`
    * on the value) equal to a key in `typeHandlers`, then said value will be
    * replaced by the return value of the function mapped to by the key in
    * `typeHandlers`. This function is called with the value as a parameter.
    *
    * If one of these functions returns the sole instance of {@link Absent},
    * then the value will be suppressed from the XML output altogether.
    *
    * For example, if `typeHandlers` is:
    * ```javascript
    * {
    *     "[object Date]": function(value) {
    *         return value.getYear();
    *     },
    *     "[object Null]": function(value) {
    *         return Absent.instance;
    *     }
    * }
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "abc": new Date(2012, 10, 31),
    *     "def": null
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc>2012</abc>
    * </root>
    * ```
    *
    * If `typeHandlers` has a key named `"*"`, then that entry will match all
    * values, unless there is a more specific entry.
    *
    * Note that normal parsing still occurs for the value returned by the
    * function; it is not directly converted to a string.
    *
    * The default value is an empty object.
    */
  var typeHandlers: js.UndefOr[ITypeHandlers] = js.undefined
  /**
    * Whether to use a self-closing tag for empty elements.
    *
    * For example, the following element will be used:
    * ```xml
    * <element/>
    * ```
    * instead of:
    * ```xml
    * <element></element>
    * ```
    *
    * By default, this is enabled.
    */
  var useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to throw an exception if basic XML validation fails while
    * building the document.
    *
    * By default, this is enabled.
    */
  var validation: js.UndefOr[Boolean] = js.undefined
  /**
    * If an object or map contains a key that, when converted to a string,
    * begins with the value of `valueString`, then the value mapped by said key
    * will be represented as bare text within the XML element for that object.
    *
    * For example, if `valueString` is `"#"`, then the following object:
    * ```javascript
    * new Map([
    *     ["#1", "abc"],
    *     ["def", "ghi"],
    *     ["#2", "jkl"]
    * ])
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     abc
    *     <def>ghi</def>
    *     jkl
    * </root>
    * ```
    *
    * The default value is `"#"`.
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * If an object or map contains a key that, when converted to a string, is
    * equal to a key in `wrapHandlers`, and the key in said object or map maps
    * to an array or set, then all items in the array or set will be wrapped
    * in an XML element with the same name as the key.
    *
    * The key in `wrapHandlers` must map to a function that is called with the
    * key name, as well as the array or set, as parameters. This function must
    * return a string or value that can be converted to a string, which will
    * become the name for each XML element for each item in the array or set.
    * Alternatively, this function may return `null` to indicate that no
    * wrapping should occur.
    *
    * For example, if `wrapHandlers` is:
    * ```javascript
    * {
    *     "abc": function(key, value) {
    *         return "def";
    *     }
    * }
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "ghi": "jkl",
    *     "mno": {
    *         "pqr": ["s", "t"]
    *     },
    *     "uvw": {
    *         "abc": ["x", "y"]
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <ghi>jkl</ghi>
    *     <mno>
    *         <pqr>s</pqr>
    *         <pqr>t</pqr>
    *     </mno>
    *     <uwv>
    *         <abc>
    *             <def>x</def>
    *             <def>y</def>
    *         </abc>
    *     </uwv>
    * </root>
    * ```
    *
    * If `wrapHandlers` has a key named `"*"`, then that entry will
    * match all arrays and sets, unless there is a more specific entry.
    *
    * The default value is an empty object.
    */
  var wrapHandlers: js.UndefOr[IWrapHandlers] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    aliasString: String = null,
    attributeString: String = null,
    cdataInvalidChars: js.UndefOr[Boolean] = js.undefined,
    cdataKeys: js.Array[String] = null,
    declaration: IDeclarationOptions = null,
    dtd: IDtdOptions = null,
    format: IFormatOptions = null,
    replaceInvalidChars: js.UndefOr[Boolean] = js.undefined,
    typeHandlers: ITypeHandlers = null,
    useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.undefined,
    validation: js.UndefOr[Boolean] = js.undefined,
    valueString: String = null,
    wrapHandlers: IWrapHandlers = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (aliasString != null) __obj.updateDynamic("aliasString")(aliasString.asInstanceOf[js.Any])
    if (attributeString != null) __obj.updateDynamic("attributeString")(attributeString.asInstanceOf[js.Any])
    if (!js.isUndefined(cdataInvalidChars)) __obj.updateDynamic("cdataInvalidChars")(cdataInvalidChars.get.asInstanceOf[js.Any])
    if (cdataKeys != null) __obj.updateDynamic("cdataKeys")(cdataKeys.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (dtd != null) __obj.updateDynamic("dtd")(dtd.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidChars)) __obj.updateDynamic("replaceInvalidChars")(replaceInvalidChars.get.asInstanceOf[js.Any])
    if (typeHandlers != null) __obj.updateDynamic("typeHandlers")(typeHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(useSelfClosingTagIfEmpty)) __obj.updateDynamic("useSelfClosingTagIfEmpty")(useSelfClosingTagIfEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validation)) __obj.updateDynamic("validation")(validation.get.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (wrapHandlers != null) __obj.updateDynamic("wrapHandlers")(wrapHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

