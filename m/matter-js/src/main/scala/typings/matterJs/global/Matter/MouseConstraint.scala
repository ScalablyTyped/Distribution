package typings.matterJs.global.Matter

import typings.matterJs.mod.IMouseConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.MouseConstraint")
@js.native
open class MouseConstraint ()
  extends typings.matterJs.mod.MouseConstraint
/* static members */
object MouseConstraint {
  
  @JSGlobal("Matter.MouseConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @returns {MouseConstraint} A new MouseConstraint
    */
  inline def create(engine: typings.matterJs.mod.Engine): typings.matterJs.mod.MouseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.MouseConstraint]
  inline def create(engine: typings.matterJs.mod.Engine, options: IMouseConstraintDefinition): typings.matterJs.mod.MouseConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.matterJs.mod.MouseConstraint]
}
