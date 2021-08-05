package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseConstraintDefinition extends StObject {
  
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: js.UndefOr[Body] = js.undefined
  
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.undefined
  
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: js.UndefOr[Constraint] = js.undefined
  
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: js.UndefOr[Mouse] = js.undefined
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IMouseConstraintDefinition {
  
  inline def apply(): IMouseConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMouseConstraintDefinition]
  }
  
  extension [Self <: IMouseConstraintDefinition](x: Self) {
    
    inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCollisionFilter(value: ICollisionFilter): Self = StObject.set(x, "collisionFilter", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilterUndefined: Self = StObject.set(x, "collisionFilter", js.undefined)
    
    inline def setConstraint(value: Constraint): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
