package typings.lunr.mod.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait presence extends js.Object

/**
  * Constants for indicating what kind of presence a term must have in matching documents.
  */
@JSImport("lunr", "Query.presence")
@js.native
object presence extends js.Object {
  /**
    * Term's presence in a document is optional, this is the default value.
    */
  @js.native
  sealed trait OPTIONAL extends presence
  
  /**
    * Term's presence in a document is prohibited, documents that do contain this term will not be returned.
    */
  @js.native
  sealed trait PROHIBITED extends presence
  
  /**
    * Term's presence in a document is required, documents that do not contain this term will not be returned.
    */
  @js.native
  sealed trait REQUIRED extends presence
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[presence with Double] = js.native
  /* 1 */ @js.native
  object OPTIONAL extends TopLevel[OPTIONAL with Double]
  
  /* 3 */ @js.native
  object PROHIBITED extends TopLevel[PROHIBITED with Double]
  
  /* 2 */ @js.native
  object REQUIRED extends TopLevel[REQUIRED with Double]
  
}

