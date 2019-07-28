package typings.humanizeDashString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Convert a camelized/dasherized/underscored string into a humanized one: `fooBar-Baz_Faz` → `Foo bar baz faz`.
  	@param text - The string to make human readable.
  	@example
  	```
  	import humanizeString = require('humanize-string');
  	humanizeString('fooBar');
  	//=> 'Foo bar'
  	humanizeString('foo-bar');
  	//=> 'Foo bar'
  	humanizeString('foo_bar');
  	//=> 'Foo bar'
  	```
  	*/
  def apply(text: String): String = js.native
}

