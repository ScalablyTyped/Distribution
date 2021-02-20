package typings.junk

import typings.junk.anon.Default
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("junk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("junk", "default")
  @js.native
  def default: Default = js.native
  @scala.inline
  def default_=(x: Default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Returns `true` if `filename` matches a junk file.
  	*/
  @JSImport("junk", "is")
  @js.native
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
  @JSImport("junk", "not")
  @js.native
  def not(filename: String): Boolean = js.native
  
  /**
  	Regex used for matching junk files.
  	*/
  @JSImport("junk", "regex")
  @js.native
  val regex: RegExp = js.native
}
