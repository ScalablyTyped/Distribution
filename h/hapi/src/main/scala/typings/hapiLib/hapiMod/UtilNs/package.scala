package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UtilNs {
  type HTTP_METHODS = hapiLib.hapiLibStrings.HEAD | hapiLib.hapiLibStrings.head | HTTP_METHODS_PARTIAL
  type HTTP_METHODS_PARTIAL = hapiLib.hapiLibStrings.GET | hapiLib.hapiLibStrings.POST | hapiLib.hapiLibStrings.PUT | hapiLib.hapiLibStrings.PATCH | hapiLib.hapiLibStrings.DELETE | hapiLib.hapiLibStrings.OPTIONS | HTTP_METHODS_PARTIAL_LOWERCASE
  type HTTP_METHODS_PARTIAL_LOWERCASE = hapiLib.hapiLibStrings.get | hapiLib.hapiLibStrings.post | hapiLib.hapiLibStrings.put | hapiLib.hapiLibStrings.patch | hapiLib.hapiLibStrings.delete | hapiLib.hapiLibStrings.options
}
