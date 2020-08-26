package typings.junk.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  /**
  	Regex used for matching junk files.
  	*/
  val regex: RegExp = js.native
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
}

object Default {
  @scala.inline
  def apply(is: String => Boolean, not: String => Boolean, regex: RegExp): Default = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), not = js.Any.fromFunction1(not), regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIs(value: String => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    @scala.inline
    def setNot(value: String => Boolean): Self = this.set("not", js.Any.fromFunction1(value))
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
  
}

