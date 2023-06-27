package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConstraintDefinition extends StObject {
  
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @default null
    */
  var bodyA: js.UndefOr[Body] = js.undefined
  
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @default null
    */
  var bodyB: js.UndefOr[Body] = js.undefined
  
  /**
    * A `Number` that specifies the damping of the constraint,
    * i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation.
    * Damping will only be apparent when the constraint also has a very low `stiffness`.
    * A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation.
    * A value of `0` means the constraint will apply no damping.
    *
    * @default 0
    */
  var damping: js.UndefOr[Double] = js.undefined
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @default "Constraint"
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @default { x: 0, y: 0 }
    */
  var pointA: js.UndefOr[Vector] = js.undefined
  
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @default { x: 0, y: 0 }
    */
  var pointB: js.UndefOr[Vector] = js.undefined
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    */
  var render: js.UndefOr[IConstraintRenderDefinition] = js.undefined
  
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @default 1
    */
  var stiffness: js.UndefOr[Double] = js.undefined
  
  /**
    * A `String` denoting the type of object.
    *
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IConstraintDefinition {
  
  inline def apply(): IConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConstraintDefinition] (val x: Self) extends AnyVal {
    
    inline def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyAUndefined: Self = StObject.set(x, "bodyA", js.undefined)
    
    inline def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setBodyBUndefined: Self = StObject.set(x, "bodyB", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPointA(value: Vector): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    inline def setPointAUndefined: Self = StObject.set(x, "pointA", js.undefined)
    
    inline def setPointB(value: Vector): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
    
    inline def setPointBUndefined: Self = StObject.set(x, "pointB", js.undefined)
    
    inline def setRender(value: IConstraintRenderDefinition): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
