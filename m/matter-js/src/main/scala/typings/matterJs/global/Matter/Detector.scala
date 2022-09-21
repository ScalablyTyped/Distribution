package typings.matterJs.global.Matter

import typings.matterJs.mod.ICollisionFilter
import typings.matterJs.mod.IDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Detector")
@js.native
open class Detector ()
  extends typings.matterJs.mod.Detector
/* static members */
object Detector {
  
  @JSGlobal("Matter.Detector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param ICollisionFilter filterA
    * @param ICollisionFilter filterB
    * @returns {boolean} `true` if collision can occur
    */
  inline def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canCollide")(filterA.asInstanceOf[js.Any], filterB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Clears the detector including its list of bodies.
    * @method clear
    * @param {Detector} detector
    */
  inline def clear(detector: typings.matterJs.mod.Detector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(detector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Efficiently finds all collisions among all the bodies in `detector.bodies` using a broadphase algorithm.
    *
    * _Note:_ The specific ordering of collisions returned is not guaranteed between releases and may change for performance reasons.
    * If a specific ordering is required then apply a sort to the resulting array.
    * @method collisions
    * @param {Detector} detector
    * @returns {Collision[]} collisions
    */
  inline def collisions(detector: typings.matterJs.mod.Detector): js.Array[typings.matterJs.mod.Collision] = ^.asInstanceOf[js.Dynamic].applyDynamic("collisions")(detector.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Collision]]
  
  /**
    * Finds all collisions given a list of pairs.
    * Creates a new collision detector.
    * @method create
    * @param {IDetectorOptions | undefined} options
    * @returns {Detector} A new collision detector
    */
  inline def create(): typings.matterJs.mod.Detector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.matterJs.mod.Detector]
  inline def create(options: IDetectorOptions): typings.matterJs.mod.Detector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Detector]
  
  /**
    * Sets the list of bodies in the detector.
    * @method setBodies
    * @param {Detector} detector
    * @param {Body[]} bodies
    */
  inline def setBodies(detector: typings.matterJs.mod.Detector, bodies: js.Array[typings.matterJs.mod.Body]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBodies")(detector.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
