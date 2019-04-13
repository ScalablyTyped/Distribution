package typings
package humanizeDashStringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("humanize-string", JSImport.Namespace)
@js.native
object humanizeDashStringMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function humanizeString(text: string): string;
  // export = humanizeString;
  @JSName("default")
  var default_Original: humanizeDashStringLib.Anon_Default = js.native
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
  def apply(text: java.lang.String): java.lang.String = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function humanizeString(text: string): string;
  // export = humanizeString;
  def default(text: java.lang.String): java.lang.String = js.native
}

