package typings.lovefield.lovefieldMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 0 */ @js.native
  object ARRAY_BUFFER extends TopLevel[ARRAY_BUFFER with Double]
  
  /* 1 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  /* 2 */ @js.native
  object DATE_TIME extends TopLevel[DATE_TIME with Double]
  
  /* 3 */ @js.native
  object INTEGER extends TopLevel[INTEGER with Double]
  
  /* 4 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 5 */ @js.native
  object OBJECT extends TopLevel[OBJECT with Double]
  
  /* 6 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
}

