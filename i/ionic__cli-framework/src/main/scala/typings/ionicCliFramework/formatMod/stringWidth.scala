package typings.ionicCliFramework.formatMod

import typings.stringWidth.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/utils/format", "stringWidth")
@js.native
object stringWidth extends js.Object {
  
  /**
  	Get the visual width of a string - the number of columns required to display it.
  	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
  	@example
  	```
  	import stringWidth = require('string-width');
  	stringWidth('a');
  	//=> 1
  	stringWidth('古');
  	//=> 2
  	stringWidth('\\u001B[1m古\\u001B[22m');
  	//=> 2
  	```
  	*/
  def apply(string: String): Double = js.native
  
  /**
  	Get the visual width of a string - the number of columns required to display it.
  	Some Unicode characters are [fullwidth](https://en.wikipedia.org/wiki/Halfwidth_and_fullwidth_forms) and use double the normal width. [ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) are stripped and doesn't affect the width.
  	@example
  	```
  	import stringWidth = require('string-width');
  	stringWidth('a');
  	//=> 1
  	stringWidth('古');
  	//=> 2
  	stringWidth('\\u001B[1m古\\u001B[22m');
  	//=> 2
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function stringWidth(string: string): number;
  // export = stringWidth;
  def default(string: String): Double = js.native
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function stringWidth(string: string): number;
  // export = stringWidth;
  @JSName("default")
  var default_Original: Call = js.native
}
