package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a turn-based match data object.
  */
@js.native
trait SchemaTurnBasedMatchData extends StObject {
  
  /**
    * The byte representation of the data (limited to 128 kB), as a
    * Base64-encoded string with the URL_SAFE encoding option.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * True if this match has data available but it wasn&#39;t returned in a
    * list response; fetching the match individually will retrieve this data.
    */
  var dataAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchData.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTurnBasedMatchData {
  
  @scala.inline
  def apply(): SchemaTurnBasedMatchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchData]
  }
  
  @scala.inline
  implicit class SchemaTurnBasedMatchDataMutableBuilder[Self <: SchemaTurnBasedMatchData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAvailable(value: Boolean): Self = StObject.set(x, "dataAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAvailableUndefined: Self = StObject.set(x, "dataAvailable", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
