package typings
package gulpDashCoffeelintLib.gulpDashCoffeelintMod.coffeelintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coffeelint extends js.Object {
  /**
           * @param optFile Absolute path of a json file containing options for coffeelint.
           * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
           * @param literate Are we dealing with Literate CoffeeScript?
           * @param rules Add custom rules to coffeelint.
           */
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
           * @param optFile Absolute path of a json file containing options for coffeelint.
           * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
           * @param literate Are we dealing with Literate CoffeeScript?
           * @param rules Add custom rules to coffeelint.
           */
  def apply(optFile: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
           * @param optFile Absolute path of a json file containing options for coffeelint.
           * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
           * @param literate Are we dealing with Literate CoffeeScript?
           * @param rules Add custom rules to coffeelint.
           */
  def apply(optFile: java.lang.String, opt: js.Any): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
           * @param optFile Absolute path of a json file containing options for coffeelint.
           * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
           * @param literate Are we dealing with Literate CoffeeScript?
           * @param rules Add custom rules to coffeelint.
           */
  def apply(optFile: java.lang.String, opt: js.Any, literate: scala.Boolean): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
           * @param optFile Absolute path of a json file containing options for coffeelint.
           * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
           * @param literate Are we dealing with Literate CoffeeScript?
           * @param rules Add custom rules to coffeelint.
           */
  def apply(optFile: java.lang.String, opt: js.Any, literate: scala.Boolean, rules: js.Array[js.Function]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def reporter(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def reporter(reporter: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def reporter(reporter: js.Function): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

