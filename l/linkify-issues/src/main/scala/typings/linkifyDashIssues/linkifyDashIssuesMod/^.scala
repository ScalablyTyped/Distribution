package typings.linkifyDashIssues.linkifyDashIssuesMod

import typings.std.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linkify-issues", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
  /**
  Linkify GitHub issue references.
  @param string - String with issue references to linkify.
  @example
  ```
  import linkifyIssues = require('linkify-issues');
  linkifyIssues('Fixes #143 and avajs/ava#1023', {
  	user: 'sindresorhus',
  	repository: 'dofle',
  	attributes: {
  		class: 'unicorn',
  		multiple: ['a', 'b'],
  		number: 1,
  		exclude: false,
  		include: true
  	}
  });
  //=> 'Fixes <a href="https://github.com/sindresorhus/dofle/issues/143" class="unicorn" multiple="a b" number="1" include>#143</a> and <a href="https://github.com/avajs/ava/issues/1023" class="unicorn" multiple="a b" number="1" include>avajs/ava#1023</a>'
  const fragment = linkifyUrls('See #143', {
  	user: 'sindresorhus',
  	repository: 'dofle',
  	type: 'dom',
  	attributes: {
  		class: 'unicorn',
  	}
  });
  document.body.appendChild(fragment);
  ```
  */
  def apply(string: String, options: TypeDomOptions): DocumentFragment = js.native
}

