package typings.gravatarUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gravatar-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Get the URL to a Gravatar image from an identifier, such as an email.
  @param identifier - Identifier for which to get the Gravatar image. This will typically be an email matching a Gravatar profile, but can technically be any string. The Gravatar service only sees a hash of the identifier, so you could actually use this to get pseudo-random avatars for any entity, e.g. based on its ID. Note that if the identifier contains an `@`, it is assumed to be an email, and will therefore be lower-cased and trimmed before hashing, as per the Gravatar instructions - otherwise it will be hashed as-is.
  @example
  ```
  import gravatarUrl = require('gravatar-url');
  gravatarUrl('sindresorhus@gmail.com', {size: 200});
  //=> 'https://gravatar.com/avatar/d36a92237c75c5337c17b60d90686bf9?size=200'
  ```
  */
  def apply(identifier: String): String = js.native
  def apply(identifier: String, options: Options): String = js.native
}
