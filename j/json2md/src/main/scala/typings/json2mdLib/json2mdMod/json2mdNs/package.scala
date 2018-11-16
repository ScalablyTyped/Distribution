package typings
package json2mdLib.json2mdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2mdNs {
  type ConverterCallback[TInput] = js.Function2[/* input */ TInput, /* json2md */ json2mdLib.json2md, java.lang.String]
  type ConvertersMethods = json2mdLib.json2mdLibStrings.ConvertersMethods with js.Any
  type DataObject = json2mdLib.json2mdLibStrings.DataObject with js.Any
}
