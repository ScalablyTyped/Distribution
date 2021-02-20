package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompositeDefinition extends StObject {
  
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  var bodies: js.UndefOr[js.Array[Body]] = js.native
  
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  var composites: js.UndefOr[js.Array[Composite]] = js.native
  
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  var constraints: js.UndefOr[js.Array[Constraint]] = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  var isModified: js.UndefOr[Boolean] = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  var parent: js.UndefOr[Composite] = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  var `type`: js.UndefOr[String] = js.native
}
object ICompositeDefinition {
  
  @scala.inline
  def apply(): ICompositeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeDefinition]
  }
  
  @scala.inline
  implicit class ICompositeDefinitionMutableBuilder[Self <: ICompositeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodies(value: js.Array[Body]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodiesUndefined: Self = StObject.set(x, "bodies", js.undefined)
    
    @scala.inline
    def setBodiesVarargs(value: Body*): Self = StObject.set(x, "bodies", js.Array(value :_*))
    
    @scala.inline
    def setComposites(value: js.Array[Composite]): Self = StObject.set(x, "composites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositesUndefined: Self = StObject.set(x, "composites", js.undefined)
    
    @scala.inline
    def setCompositesVarargs(value: Composite*): Self = StObject.set(x, "composites", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[Constraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: Constraint*): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setParent(value: Composite): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
