package typings.junk

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  /**
  	Regex used for matching junk files.
  	*/
  val regex: RegExp
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  def is(filename: String): Boolean
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
  def not(filename: String): Boolean
}

object Anon_Default {
  @scala.inline
  def apply(is: String => Boolean, not: String => Boolean, regex: RegExp): Anon_Default = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), not = js.Any.fromFunction1(not), regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Default]
  }
}

