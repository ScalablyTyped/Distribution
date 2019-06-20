package typings
package linkifyDashUrlsLib.linkifyDashUrlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linkify-urls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(string: java.lang.String): java.lang.String = js.native
  def apply(string: java.lang.String, options: Options): java.lang.String = js.native
  /**
  Linkify URLs in a string.
  @param string - String with URLs to linkify.
  @example
  ```
  import linkifyUrls = require('linkify-urls');
  linkifyUrls('See https://sindresorhus.com', {
  	attributes: {
  		class: 'unicorn',
  		one: 1,
  		foo: true,
  		multiple: ['a', 'b']
  	}
  });
  //=> 'See <a href="https://sindresorhus.com" class="unicorn" one="1" foo multiple="a b">https://sindresorhus.com</a>'
  // In the browser
  const fragment = linkifyUrls('See https://sindresorhus.com', {
  	type: 'dom',
  	attributes: {
  		class: 'unicorn',
  	}
  });
  document.body.appendChild(fragment);
  ```
  */
  def apply(string: java.lang.String, options: TypeDomOptions): stdLib.DocumentFragment = js.native
}

