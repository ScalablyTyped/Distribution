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
  
  /* 0 */ val ARRAY_BUFFER: ARRAY_BUFFER with scala.Double = js.native
  /* 1 */ val BOOLEAN: BOOLEAN with scala.Double = js.native
  /* 2 */ val DATE_TIME: DATE_TIME with scala.Double = js.native
  /* 3 */ val INTEGER: INTEGER with scala.Double = js.native
  /* 4 */ val NUMBER: NUMBER with scala.Double = js.native
  /* 5 */ val OBJECT: OBJECT with scala.Double = js.native
  /* 6 */ val STRING: STRING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.Type with scala.Double] = js.native
}

