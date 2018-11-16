package typings
package js2xmlparserLib.libOptionsMod

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
       *         "__val": "ghi"
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
       * If left undefined, the default value is `"="`.
       */
  var aliasString: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If an object or map contains a key that, when converted to a string,
       * begins with the value of `attributeString`, then the value mapped by
       * said key will be interpreted as attributes for the XML element for that
       * object.
       *
       * The attribute object must be an object containing keys that map to
       * primitives (string, number, boolean, null, or undefined).
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
       * If left undefined, the default value is `"@"`.
       */
  var attributeString: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If `cdataInvalidChars` is `true`, then any text containing the
       * characters `<` or `&` shall be enclosed in CDATA sections. Otherwise,
       * those characters shall be replaced with XML escape characters.
       *
       * If left undefined, the default value is `false`.
       */
  var cdataInvalidChars: js.UndefOr[scala.Boolean] = js.undefined
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
       * If left undefined, the default value is an empty array.
       */
  var cdataKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
       * If an value has a type (as defined by calling `Object.prototype.toString`
       * on the value) equal to a key in `typeHandlers`, then said value will be
       * replaced by the return value of the function mapped to by the key in
       * `typeHandlers`. This function is called with the value as a parameter.
       *
       * For example, if `typeHandlers` is:
       * ```javascript
       * {
       *     "[object Date]": function(value) {
       *         return value.getYear();
       *     }
       * }
       * ```
       * then the following object:
       * ```javascript
       * {
       *     "abc": new Date(2012, 10, 31)
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
       * If left undefined, the default value is an empty object.
       */
  var typeHandlers: js.UndefOr[ITypeHandlers] = js.undefined
  /**
       * If an object or map contains a key that, when converted to a string,
       * begins with the value of `valueString`, then the value mapped by said key
       * will be represented as bare text within the XML element for that object.
       * The value must be a primitive (string, number, boolean, null, or
       * undefined).
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
       * If left undefined, the default value is `"#"`.
       */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If an object or map contains a key that, when converted to a string, is
       * equal to a key in `wrapHandlers`, and the key in said object or map maps
       * to an array or set, then all items in the array or set will be wrapped
       * in an XML element with the same name as the key.
       *
       * The key in `wrapHandlers` must map to a function that is called with the
       * key name, as well as the array or set, as parameters. This function must
       * return a string, which will become the name for each XML element for
       * each item in the array or set. Alternatively, this function may return
       * `null` to indicate that no wrapping should occur.
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
       * If left undefined, the default value is an empty object.
       */
  var wrapHandlers: js.UndefOr[IWrapHandlers] = js.undefined
}

