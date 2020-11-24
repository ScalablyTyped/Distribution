package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSImport("lovefield", "Type")
@js.native
object Type extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait ARRAY_BUFFER extends Type
  /* 0 */ @js.native
  object ARRAY_BUFFER extends TopLevel[ARRAY_BUFFER with Double]
  
  @js.native
  sealed trait BOOLEAN extends Type
  /* 1 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  @js.native
  sealed trait DATE_TIME extends Type
  /* 2 */ @js.native
  object DATE_TIME extends TopLevel[DATE_TIME with Double]
  
  @js.native
  sealed trait INTEGER extends Type
  /* 3 */ @js.native
  object INTEGER extends TopLevel[INTEGER with Double]
  
  @js.native
  sealed trait NUMBER extends Type
  /* 4 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  @js.native
  sealed trait OBJECT extends Type
  /* 5 */ @js.native
  object OBJECT extends TopLevel[OBJECT with Double]
  
  @js.native
  sealed trait STRING extends Type
  /* 6 */ @js.native
  object STRING extends TopLevel[STRING with Double]
}
