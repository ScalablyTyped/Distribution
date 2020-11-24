package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseConstraintDefinition extends js.Object {
  
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: js.UndefOr[Body] = js.native
  
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.native
  
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: js.UndefOr[Constraint] = js.native
  
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: js.UndefOr[Mouse] = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.native
}
object IMouseConstraintDefinition {
  
  @scala.inline
  def apply(): IMouseConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMouseConstraintDefinition]
  }
  
  @scala.inline
  implicit class IMouseConstraintDefinitionOps[Self <: IMouseConstraintDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCollisionFilter(value: ICollisionFilter): Self = this.set("collisionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionFilter: Self = this.set("collisionFilter", js.undefined)
    
    @scala.inline
    def setConstraint(value: Constraint): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    
    @scala.inline
    def setMouse(value: Mouse): Self = this.set("mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
