package typings.inversify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/queryable_string", JSImport.Namespace)
@js.native
object queryableStringMod extends js.Object {
  @js.native
  class QueryableString protected ()
    extends typings.inversify.interfacesMod.interfaces.QueryableString {
    def this(str: String) = this()
    var str: js.Any = js.native
    /* CompleteClass */
    override def contains(searchString: String): Boolean = js.native
    /* CompleteClass */
    override def endsWith(searchString: String): Boolean = js.native
    /* CompleteClass */
    override def equals(compareString: String): Boolean = js.native
    /* CompleteClass */
    override def startsWith(searchString: String): Boolean = js.native
    /* CompleteClass */
    override def value(): String = js.native
  }
  
}

