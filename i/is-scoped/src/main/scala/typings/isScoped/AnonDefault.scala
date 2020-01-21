package typings.isScoped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  /**
  	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
  	@example
  	```
  	import isScoped = require('is-scoped');
  	isScoped('@sindresorhus/df');
  	//=> true
  	isScoped('cat-names');
  	//=> false
  	```
  	*/
  def apply(input: String): Boolean = js.native
}

