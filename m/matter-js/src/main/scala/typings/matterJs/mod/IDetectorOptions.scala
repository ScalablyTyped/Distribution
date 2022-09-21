package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDetectorOptions extends StObject {
  
  /**
    * The array of `Matter.Body` between which the detector finds collisions.
    *
    * _Note:_ The order of bodies in this array _is not fixed_ and will be continually managed by the detector.
    * @property bodies
    * @type {Body[] | undefined}
    * @default []
    */
  var bodies: js.UndefOr[js.Array[Body]] = js.undefined
  
  /**
    * Optional. A `Matter.Pairs` object from which previous collision objects may be reused. Intended for internal `Matter.Engine` usage.
    * @property pairs
    * @type {Pairs | null | undefined}
    * @default null
    */
  var pairs: js.UndefOr[Pairs | Null] = js.undefined
}
object IDetectorOptions {
  
  inline def apply(): IDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetectorOptions]
  }
  
  extension [Self <: IDetectorOptions](x: Self) {
    
    inline def setBodies(value: js.Array[Body]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
    
    inline def setBodiesUndefined: Self = StObject.set(x, "bodies", js.undefined)
    
    inline def setBodiesVarargs(value: Body*): Self = StObject.set(x, "bodies", js.Array(value*))
    
    inline def setPairs(value: Pairs): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPairsNull: Self = StObject.set(x, "pairs", null)
    
    inline def setPairsUndefined: Self = StObject.set(x, "pairs", js.undefined)
  }
}
