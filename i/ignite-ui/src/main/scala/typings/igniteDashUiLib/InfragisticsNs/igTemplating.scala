package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.igTemplating")
@js.native
class igTemplating protected () extends js.Object {
  def this(regExp: igniteDashUiLib.IgTemplatingRegExp) = this()
  def clearTmplCache(): scala.Unit = js.native
  /**
  	 * Populates the given template with the provided data. If data is a function that requires arguments, the arguments need to be provided as an array following the data. tmpl(template, data[, args])
  	 *
  	 * @param template Specifies the template string
  	 * @param data Specifies the data to be templated in the template. If function is provided, then it has to be object or array returning function, possible receiving arguments array which can be specified as the third parameter
  	 * @param args If function is provided as the second parameter, then this parameter is the arguments for the function.
  	 */
  def tmpl(template: java.lang.String, data: js.Object): java.lang.String = js.native
  /**
  	 * Populates the given template with the provided data. If data is a function that requires arguments, the arguments need to be provided as an array following the data. tmpl(template, data[, args])
  	 *
  	 * @param template Specifies the template string
  	 * @param data Specifies the data to be templated in the template. If function is provided, then it has to be object or array returning function, possible receiving arguments array which can be specified as the third parameter
  	 * @param args If function is provided as the second parameter, then this parameter is the arguments for the function.
  	 */
  def tmpl(template: java.lang.String, data: js.Object, args: js.Array[_]): java.lang.String = js.native
}

