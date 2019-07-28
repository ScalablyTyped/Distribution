package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("lovefield", "Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER extends Type
  
  @js.native
  sealed trait BOOLEAN extends Type
  
  @js.native
  sealed trait DATE_TIME extends Type
  
  @js.native
  sealed trait INTEGER extends Type
  
  @js.native
  sealed trait NUMBER extends Type
  
  @js.native
  sealed trait OBJECT extends Type
  
  @js.native
  sealed trait STRING extends Type
  
  /* 0 */ val ARRAY_BUFFER: typings.lovefield.lovefieldMod.Type.ARRAY_BUFFER with Double = js.native
  /* 1 */ val BOOLEAN: typings.lovefield.lovefieldMod.Type.BOOLEAN with Double = js.native
  /* 2 */ val DATE_TIME: typings.lovefield.lovefieldMod.Type.DATE_TIME with Double = js.native
  /* 3 */ val INTEGER: typings.lovefield.lovefieldMod.Type.INTEGER with Double = js.native
  /* 4 */ val NUMBER: typings.lovefield.lovefieldMod.Type.NUMBER with Double = js.native
  /* 5 */ val OBJECT: typings.lovefield.lovefieldMod.Type.OBJECT with Double = js.native
  /* 6 */ val STRING: typings.lovefield.lovefieldMod.Type.STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

