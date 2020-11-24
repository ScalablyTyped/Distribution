package typings.jju.mod

import typings.jju.jjuStrings.Apostrophe
import typings.jju.jjuStrings.Quotationmark
import typings.jju.jjuStrings.cjson
import typings.jju.jjuStrings.json
import typings.jju.jjuStrings.json5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringifyOptions extends js.Object {
  
  /**
    * Output ascii only (default false).
    * If this option is enabled, output will not have any characters except 0x20-0x7f.
    */
  var ascii: js.UndefOr[Boolean] = js.native
  
  /**
    * This option follows JSON specification.
    * @default '\t'
    */
  var indent: js.UndefOr[String | Double | Boolean] = js.native
  
  /**
    * Operation mode. Set it to 'json' if you want correct json in the output.
    * If it is 'json', following options are implied:
    * - options.quote = '"'
    * - options.no_trailing_comma = true
    * - options.quote_keys = true
    * - '\x' literals are not used
    */
  var mode: js.UndefOr[json | json5 | cjson] = js.native
  
  /**
    * Don't output trailing comma. If this option is set, arrays like `[1,2,3,]` will never be generated.
    * Otherwise they may be generated for pretty printing.
    * - If `mode` is JSON, default is true
    * - Otherwise, default is false
    */
  var no_trailing_comma: js.UndefOr[Boolean] = js.native
  
  /**
    * Enquoting char.
    * - If `mode` is 'json', default is "
    * - Otherwise, default is '
    */
  var quote: js.UndefOr[Quotationmark | Apostrophe] = js.native
  
  /**
    * Whether keys quoting in objects is required or not.
    * If you want `{"q": 1}` instead of `{q: 1}`, set it to true.
    * - If `mode` is 'json', default is true
    * - Otherwise, default is false
    */
  var quote_keys: js.UndefOr[Boolean] = js.native
  
  /**
    * Replacer function or array. This option follows JSON specification.
    * If a function, used to transform the results.
    * If an array, acts as a approved list for selecting the object properties that will be stringified.
    */
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])
  ] = js.native
  
  /**
    * Sort all keys while stringifying.
    * By default sort order will depend on implementation--with v8 it's insertion order.
    * If set to true, all keys (but not arrays) will be sorted alphabetically.
    * You can provide your own sorting function as well.
    * @default false
    */
  var sort_keys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
}
object StringifyOptions {
  
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAscii(value: Boolean): Self = this.set("ascii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscii: Self = this.set("ascii", js.undefined)
    
    @scala.inline
    def setIndent(value: String | Double | Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMode(value: json | json5 | cjson): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNo_trailing_comma(value: Boolean): Self = this.set("no_trailing_comma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_trailing_comma: Self = this.set("no_trailing_comma", js.undefined)
    
    @scala.inline
    def setQuote(value: Quotationmark | Apostrophe): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuote_keys(value: Boolean): Self = this.set("quote_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote_keys: Self = this.set("quote_keys", js.undefined)
    
    @scala.inline
    def setReplacerVarargs(value: (Double | String)*): Self = this.set("replacer", js.Array(value :_*))
    
    @scala.inline
    def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacer(value: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSort_keysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sort_keys", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSort_keys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = this.set("sort_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort_keys: Self = this.set("sort_keys", js.undefined)
  }
}
