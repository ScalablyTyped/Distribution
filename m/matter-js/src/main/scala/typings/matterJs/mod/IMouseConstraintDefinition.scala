package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseConstraintDefinition extends StObject {
  
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @default null
    */
  var body: js.UndefOr[Body] = js.undefined
  
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.undefined
  
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    */
  var constraint: js.UndefOr[IConstraintDefinition] = js.undefined
  
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @default mouse
    */
  var mouse: js.UndefOr[Mouse] = js.undefined
  
  /**
    * A `String` denoting the type of object.
    *
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IMouseConstraintDefinition {
  
  inline def apply(): IMouseConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMouseConstraintDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseConstraintDefinition] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCollisionFilter(value: ICollisionFilter): Self = StObject.set(x, "collisionFilter", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilterUndefined: Self = StObject.set(x, "collisionFilter", js.undefined)
    
    inline def setConstraint(value: IConstraintDefinition): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
