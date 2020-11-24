package typings.humanizeString

import typings.humanizeString.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("humanize-string", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def default(text: String): String = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function humanizeString(text: string): string;
  // export = humanizeString;
  @JSName("default")
  var default_Original: Call = js.native
}
