package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a rematch response.
  */
trait SchemaTurnBasedMatchRematch extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchRematch.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The old match that the rematch was created from; will be updated such
    * that the rematchId field will point at the new match.
    */
  var previousMatch: js.UndefOr[SchemaTurnBasedMatch] = js.undefined
  
  /**
    * The newly created match; a rematch of the old match with the same
    * participants.
    */
  var rematch: js.UndefOr[SchemaTurnBasedMatch] = js.undefined
}
object SchemaTurnBasedMatchRematch {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchRematch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchRematch]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchRematchMutableBuilder[Self <: SchemaTurnBasedMatchRematch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPreviousMatch(value: SchemaTurnBasedMatch): Self = StObject.set(x, "previousMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMatchUndefined: Self = StObject.set(x, "previousMatch", js.undefined)
    
    @scala.inline
    def setRematch(value: SchemaTurnBasedMatch): Self = StObject.set(x, "rematch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRematchUndefined: Self = StObject.set(x, "rematch", js.undefined)
  }
}
