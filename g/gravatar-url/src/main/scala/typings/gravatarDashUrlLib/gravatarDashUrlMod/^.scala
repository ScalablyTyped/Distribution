package typings
package gravatarDashUrlLib.gravatarDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gravatar-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get the URL to a Gravatar image from an email.
  @param email - Email matching a Gravatar profile.
  @example
  ```
  import gravatarUrl = require('gravatar-url');
  gravatarUrl('sindresorhus@gmail.com', {size: 200});
  //=> 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=200'
  ```
  */
  def apply(email: java.lang.String): java.lang.String = js.native
  def apply(email: java.lang.String, options: Options): java.lang.String = js.native
}

