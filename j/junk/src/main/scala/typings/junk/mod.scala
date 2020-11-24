package typings.junk

import typings.junk.anon.Default
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("junk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  // TODO: Remove this for the next major release
  var default: Default = js.native
  
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  def is(filename: String): Boolean = js.native
  
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
  def not(filename: String): Boolean = js.native
  
  /**
  	Regex used for matching junk files.
  	*/
  val regex: RegExp = js.native
}
