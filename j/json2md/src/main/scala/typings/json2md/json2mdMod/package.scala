package typings.json2md

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2mdMod {
  import typings.json2md.json2mdMod.DefaultConverters.Converters

  type ConverterCallback[TInput] = js.Function2[/* input */ TInput, /* json2md */ typings.json2md.json2mdMod.json2md, String]
  type ConvertersMethods = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ TConverter in 'blockquote' | 'code' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'ol' | 'p' | 'table' | 'ul' ]: json2md.json2md.ConverterCallback<json2md.json2md.DefaultConverters.Converters[TConverter]>}
    */ typings.json2md.json2mdStrings.ConvertersMethods with Converters
  type DataObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ TConverter in 'blockquote' | 'code' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'ol' | 'p' | 'table' | 'ul' ]:? json2md.json2md.DefaultConverters.Converters[TConverter]}
    */ typings.json2md.json2mdStrings.DataObject with Converters
  type json2md = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof json2md */ js.Any
}
