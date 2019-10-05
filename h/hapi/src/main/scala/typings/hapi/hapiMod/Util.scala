package typings.hapi.hapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.hapi.hapiMod.Util.HTTP_METHODS
import typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hapi", "Util")
@js.native
object Util extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.hapi.hapiStrings.HEAD
    - typings.hapi.hapiStrings.head
    - typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL
  */
  trait HTTP_METHODS extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapi.hapiStrings.GET
    - typings.hapi.hapiStrings.POST
    - typings.hapi.hapiStrings.PUT
    - typings.hapi.hapiStrings.PATCH
    - typings.hapi.hapiStrings.DELETE
    - typings.hapi.hapiStrings.OPTIONS
    - typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
  */
  trait HTTP_METHODS_PARTIAL extends HTTP_METHODS
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapi.hapiStrings.get
    - typings.hapi.hapiStrings.post
    - typings.hapi.hapiStrings.put
    - typings.hapi.hapiStrings.patch
    - typings.hapi.hapiStrings.delete
    - typings.hapi.hapiStrings.options
  */
  trait HTTP_METHODS_PARTIAL_LOWERCASE extends HTTP_METHODS_PARTIAL
  
  type Dictionary[T] = StringDictionary[T]
}

