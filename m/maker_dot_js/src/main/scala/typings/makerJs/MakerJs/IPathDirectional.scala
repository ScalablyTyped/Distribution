package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A path that may be indicated to "flow" in either direction between its endpoints.
  */
@js.native
trait IPathDirectional extends IPath {
  
  /**
    * The endpoints of the path.
    */
  var endPoints: js.Array[IPoint] = js.native
  
  /**
    * Path flows forwards or reverse.
    */
  var reversed: js.UndefOr[Boolean] = js.native
}
object IPathDirectional {
  
  @scala.inline
  def apply(endPoints: js.Array[IPoint], origin: IPoint, `type`: String): IPathDirectional = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathDirectional]
  }
  
  @scala.inline
  implicit class IPathDirectionalMutableBuilder[Self <: IPathDirectional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPoints(value: js.Array[IPoint]): Self = StObject.set(x, "endPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointsVarargs(value: IPoint*): Self = StObject.set(x, "endPoints", js.Array(value :_*))
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
