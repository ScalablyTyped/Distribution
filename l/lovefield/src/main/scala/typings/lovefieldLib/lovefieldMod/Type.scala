package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("lovefield", "Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait BOOLEAN
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait DATE_TIME
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait INTEGER
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait NUMBER
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait OBJECT
    extends lovefieldLib.lovefieldMod.Type
  
  @js.native
  sealed trait STRING
    extends lovefieldLib.lovefieldMod.Type
  
  val ARRAY_BUFFER: ARRAY_BUFFER with java.lang.String = js.native
  val BOOLEAN: BOOLEAN with java.lang.String = js.native
  val DATE_TIME: DATE_TIME with java.lang.String = js.native
  val INTEGER: INTEGER with java.lang.String = js.native
  val NUMBER: NUMBER with java.lang.String = js.native
  val OBJECT: OBJECT with java.lang.String = js.native
  val STRING: STRING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.Type with java.lang.String] = js.native
}

