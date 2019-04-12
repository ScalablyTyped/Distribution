package typings
package junkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  /**
  	Regex used for matching junk files.
  	*/
  val regex: stdLib.RegExp
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  def is(filename: java.lang.String): scala.Boolean
  /**
  	Returns `true` if `filename` doesn't match a junk file.
  	@example
  	```
  	import {promisify} from 'util';
  	import * as fs from 'fs';
  	import junk = require('junk');
  	const pReaddir = promisify(fs.readdir);
  	(async () => {
  		const files = await pReaddir('some/path');
  		console.log(files);
  		//=> ['.DS_Store', 'test.jpg']
  		console.log(files.filter(junk.not));
  		//=> ['test.jpg']
  	})();
  	```
  	*/
  def not(filename: java.lang.String): scala.Boolean
}

object Anon_Default {
  @scala.inline
  def apply(
    is: java.lang.String => scala.Boolean,
    not: java.lang.String => scala.Boolean,
    regex: stdLib.RegExp
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), not = js.Any.fromFunction1(not), regex = regex)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

