package typings
package junkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("junk", JSImport.Namespace)
@js.native
object junkMod extends js.Object {
  // TODO: Remove this for the next major release
  var default: junkLib.Anon_Default = js.native
  /**
  	Regex used for matching junk files.
  	*/
  val regex: stdLib.RegExp = js.native
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  def is(filename: java.lang.String): scala.Boolean = js.native
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
  def not(filename: java.lang.String): scala.Boolean = js.native
}

