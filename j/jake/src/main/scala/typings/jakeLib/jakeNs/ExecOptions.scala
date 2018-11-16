package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////////////////////
// Running shell-commands ////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

trait ExecOptions extends js.Object {
  /**
  		 * stop execution on error, default true
  		 */
  var breakOnError: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * print to stderr, default false
  		 */
  var printStderr: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * print to stdout, default false
  		 */
  
  var printStdout: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		*/
  var windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
}

