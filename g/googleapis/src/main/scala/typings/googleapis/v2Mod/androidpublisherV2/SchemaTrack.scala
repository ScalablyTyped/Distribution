package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTrack extends StObject {
  
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
  
  var userFraction: js.UndefOr[Double] = js.native
  
  /**
    * Version codes to make active on this track. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaTrack {
  
  @scala.inline
  def apply(): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrack]
  }
  
  @scala.inline
  implicit class SchemaTrackMutableBuilder[Self <: SchemaTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setUserFraction(value: Double): Self = StObject.set(x, "userFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFractionUndefined: Self = StObject.set(x, "userFraction", js.undefined)
    
    @scala.inline
    def setVersionCodes(value: js.Array[Double]): Self = StObject.set(x, "versionCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodesUndefined: Self = StObject.set(x, "versionCodes", js.undefined)
    
    @scala.inline
    def setVersionCodesVarargs(value: Double*): Self = StObject.set(x, "versionCodes", js.Array(value :_*))
  }
}
