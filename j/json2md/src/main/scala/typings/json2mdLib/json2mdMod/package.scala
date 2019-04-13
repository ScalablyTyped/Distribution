package typings
package json2mdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2mdMod {
  type ConverterCallback[TInput] = js.Function2[/* input */ TInput, /* json2md */ json2mdLib.json2md, java.lang.String]
  type ConvertersMethods = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ TConverter in 'blockquote' | 'code' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'ol' | 'p' | 'table' | 'ul' ]: json2md.json2md.ConverterCallback<json2md.json2md.DefaultConverters.Converters[TConverter]>}
    */ json2mdLib.json2mdLibStrings.ConvertersMethods with json2mdLib.json2mdMod.DefaultConvertersNs.Converters
  type DataObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ TConverter in 'blockquote' | 'code' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'ol' | 'p' | 'table' | 'ul' ]:? json2md.json2md.DefaultConverters.Converters[TConverter]}
    */ json2mdLib.json2mdLibStrings.DataObject with json2mdLib.json2mdMod.DefaultConvertersNs.Converters
}
