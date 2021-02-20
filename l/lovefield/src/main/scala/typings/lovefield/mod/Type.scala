package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSImport("lovefield", "Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait ARRAY_BUFFER extends Type
  /* 0 */ val ARRAY_BUFFER: typings.lovefield.mod.Type.ARRAY_BUFFER with Double = js.native
  
  @js.native
  sealed trait BOOLEAN extends Type
  /* 1 */ val BOOLEAN: typings.lovefield.mod.Type.BOOLEAN with Double = js.native
  
  @js.native
  sealed trait DATE_TIME extends Type
  /* 2 */ val DATE_TIME: typings.lovefield.mod.Type.DATE_TIME with Double = js.native
  
  @js.native
  sealed trait INTEGER extends Type
  /* 3 */ val INTEGER: typings.lovefield.mod.Type.INTEGER with Double = js.native
  
  @js.native
  sealed trait NUMBER extends Type
  /* 4 */ val NUMBER: typings.lovefield.mod.Type.NUMBER with Double = js.native
  
  @js.native
  sealed trait OBJECT extends Type
  /* 5 */ val OBJECT: typings.lovefield.mod.Type.OBJECT with Double = js.native
  
  @js.native
  sealed trait STRING extends Type
  /* 6 */ val STRING: typings.lovefield.mod.Type.STRING with Double = js.native
}
